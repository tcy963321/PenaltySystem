package main.models;

public abstract class Student {
    
    public final String type = getClass().getName();

    private String fullName,
            matrixId,
            ic,
            course,
            faculty,
            phoneNumber,
            roomNumber;

    private int timesRulesAreBroken;

    public Student(String fullName, String matrixId, String ic, String course, String faculty, String phoneNumber, String roomNumber, int timesRulesAreBroken) {
        this.fullName = fullName;
        this.matrixId = matrixId;
        this.ic = ic;
        this.course = course;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.timesRulesAreBroken = timesRulesAreBroken;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMatrixId() {
        return matrixId;
    }

    public void setMatrixId(String matrixId) {
        this.matrixId = matrixId;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getTimesRulesAreBroken() {
        return timesRulesAreBroken;
    }

    public void setTimesRulesAreBroken(int timesRulesAreBroken) {
        this.timesRulesAreBroken = timesRulesAreBroken;
    }
    
    /**
     * How much to multiply from normal penalty charges
     * @return multiplier
     */
    public abstract float getMultiplier();

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Name: %s\n"
                + "Matrix No: %s\n"
                + "IC: %s\n"
                + "Course: %s\n"
                + "Faculty: %s\n"
                + "Phone number: %s\n"
                + "Have broken %d rules.",
                type, fullName, matrixId, ic, course, faculty,
                phoneNumber, timesRulesAreBroken);
    }
}
