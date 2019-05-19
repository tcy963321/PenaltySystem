package main.dataaccess;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.parser.JSONParser;
import main.RuntimeTypeAdapterFactory;
import main.models.Masters;
import main.models.PHD;
import main.models.Student;
import main.models.Undergraduate;
import org.apache.commons.io.FileUtils;

// Singleton for data input / output
public class StudentsDA {

    private static final String STUDENTS_PATH = RootDA.ROOT_PATH + "students_ps.json";

    private static final Type STUDENT_SERIAL_TYPE
            = new TypeToken<List<Student>>() {
            }.getType();

    private static StudentsDA instance = null;

    // Save subclasses (polymorphic) locally
    RuntimeTypeAdapterFactory<Student> adapter = RuntimeTypeAdapterFactory
            .of(Student.class, "student")
            .registerSubtype(Undergraduate.class, "undergraduate")
            .registerSubtype(Masters.class, "masters")
            .registerSubtype(PHD.class, "phd");

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private StudentsDA() {
    }

    public static StudentsDA getInstance() {
        if (instance == null) {
            instance = new StudentsDA();
        }
        return instance;
    }

    private Gson getGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapterFactory(adapter)
                .create();
    }

    /**
     * Save the students list locally - currently, in a text file
     *
     * @param students list of students to save
     */
    public void saveStudents(List<Student> students) {

        String studentsJson = getGson().toJson(students);

        saveStudentsLocally(studentsJson);
    }

    private void saveStudentsLocally(String studentsJson) {
        try {
            FileUtils.writeStringToFile(
                    new File(STUDENTS_PATH), studentsJson, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println(
                    "GetData: Cannot save students locally: " + e.getMessage());
        }
    }

    /**
     * Convert the JSON representation of students to List
     *
     * @return List of Students
     */
    public List<Student> getStudents() {
        
        JsonParser parser = new JsonParser();
        JsonArray stdArray = parser.parse(STUDENTS_PATH).getAsJsonArray();
        
        List<Student> students = new ArrayList<>();
        for (JsonElement jsonElement : stdArray) {
            Student s = getGson().fromJson(jsonElement, STUDENT_SERIAL_TYPE);
            students.add(s);
        }
        
        return students;
    }

    /**
     * Load JSON representation of students from a file with already defined
     * path
     *
     * @return List of students in JSON format
     */
    private String loadStudentsData() {
        try {
            return FileUtils.readFileToString(
                    new File(STUDENTS_PATH), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("GetData: Cannot load students: " + e.getMessage());
        }
        return "";
    }

    public void studentsDemoData() {
        List<Student> myStudents = new ArrayList<>();

        myStudents.add(new Student("Bro Handsom", "S51321", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));
        myStudents.add(new Undergraduate("Yo asd", "S23412", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));
        myStudents.add(new Student("Teenage guy", "S51321", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));
        myStudents.add(new Masters("Girl", "S51321", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));
        myStudents.add(new PHD("Bro Handsom", "S51321", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));
        myStudents.add(new PHD("Bro Handsom", "S51321", "99110019231931", "software engineering", "PPIMG", "012313141", "B2-516", 0));

        saveStudents(myStudents);
    }
}
