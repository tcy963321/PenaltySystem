package main.dataaccess;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import main.models.Rule;
import org.apache.commons.io.FileUtils;

// Singleton for data input / output
public class RulesDA {

    private static final String RULES_FILE = RootDA.ROOT_PATH + "rules_ps.json";

    private static final Type RULES_SERIALIZATION_TYPE
            = new TypeToken<List<Rule>>() {
            }.getType();

    private static RulesDA instance = null;

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private RulesDA() {
    }

    public static RulesDA getInstance() {
        if (instance == null) {
            instance = new RulesDA();
        }
        return instance;
    }

    /**
     * Save the rules list locally - currently, in a text file
     *
     * @param rules list of rules to save
     */
    public void saveRules(List<Rule> rules) {
        Gson gson = new Gson();

        String rulesJson = gson.toJson(rules);

        saveRulesLocally(rulesJson);
    }

    private void saveRulesLocally(String rulesJson) {
        try {
            FileUtils.writeStringToFile(
                    new File(RULES_FILE), rulesJson, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println(
                    "GetData: Cannot save rules locally: " + e.getMessage());
        }
    }

    /**
     * Convert the JSON representation of rules to List
     *
     * @return List of Rules
     */
    public List<Rule> getRules() {
        Gson gson = new Gson();

        String rulesJson = loadRulesData();

        if (rulesJson.isEmpty()) {
            return new ArrayList<>();
        }

        return gson.fromJson(rulesJson, RULES_SERIALIZATION_TYPE);
    }

    /**
     * Load JSON representation of rules from a file with already defined path
     *
     * @return List of rules in JSON format
     */
    private String loadRulesData() {
        try {
            return FileUtils.readFileToString(
                    new File(RULES_FILE), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("GetData: Cannot load rules: " + e.getMessage());
        }
        return "";
    }

    public void initialRulesData() {
        List<Rule> myRules = new ArrayList<>();

        myRules.add(new Rule(0, "BILIK KOTOR"));
        myRules.add(new Rule(0, "BILIK TIDAK KEMAS DAN BERSELERAK SEMASA PEMERIKSAAN BILIK DIBUAT"));
        myRules.add(new Rule(0, "KEHILANGAN KUNCI BILIK"));
        myRules.add(new Rule(0, "MENJEMUR/MENYADAI PAKAIAN BASAH DI DALAM BILIK, TINGKAP, BILIK REHAT"));
        myRules.add(new Rule(0, "MEMBAWA/MENGABIL/MENGALIH ALAT-ALAT KEMUDAHAN PERABOT TANPA KEBENARAN"));
        myRules.add(new Rule(0, "MEMBIARKAN KASUT-KASUT/ SELIPAR BERSEPAH DI LUAR BILIK (SEPASANG)"));
        myRules.add(new Rule(0, "MEMBUANG SISA MAKANAN DAN MINUMAN YANG HARAM DI SISI AGAMA ISLAM"));
        myRules.add(new Rule(0, "MEMBUANG SAMPAH/ OBJEK DARI TINGKAT ATAS KE TINGKAT BAWAH"));
        myRules.add(new Rule(0, "MEMCONTENG PERMUKAAN PREMIS: 1 KAKI PERSEGI"));
        myRules.add(new Rule(0, "TIDAK MELAPORKAN KEROSAKAN YANG MENDATANGKAN MUDARAT KE DALAM BILIK KEDIAMAN"));
        myRules.add(new Rule(50, "KEROSAKAN TILAM"));
        myRules.add(new Rule(50, "KEROSAKAN SHOWER"));
        myRules.add(new Rule(50, "KEROSAKAN LAMPU"));
        myRules.add(new Rule(50, "KEROSAKAN TOMBOL"));
        myRules.add(new Rule(50, "LELAKI YANG DIDAPATI BERADA DI ASRAMA PEREMPUAN(KECUALI STAF ASRAMA UNIVERSITY)"));
        myRules.add(new Rule(50, "MEMILIKI DAPUR MINYAK, RICE COOKER"));
        myRules.add(new Rule(50, "MEMILIKI HOT PLATE, HEATER COIL"));
        myRules.add(new Rule(100, "MEMANJAT TINGKAP BILIK/ PAGAR"));
        myRules.add(new Rule(100, "MEMGGUNAKAN GELANGGAN FUTSAL SELEPAS JAM 12.00 TEHGAH MALAM"));
        myRules.add(new Rule(100, "IDAK PAMER PELEKAT KENDERAAN"));
        myRules.add(new Rule(100, "KEROSAKAN PINTU"));
        
        saveRules(myRules);
    }
}
