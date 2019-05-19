package main.models;

public class Undergraduate extends Student {

    public Undergraduate(String fullName, String matrixId, String ic, String course, String faculty, String phoneNumber, String roomNumber, int timesRulesAreBroken) {
        super(fullName, matrixId, ic, course, faculty, phoneNumber, roomNumber, timesRulesAreBroken);
    }

    @Override
    public float getMultiplier() {
        return 1f;
    }
}
