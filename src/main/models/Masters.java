package main.models;

public class Masters extends Student {

    public Masters(String fullName, String matrixId, String ic, String course, String faculty, String phoneNumber, String roomNumber, int timesRulesAreBroken) {
        super(fullName, matrixId, ic, course, faculty, phoneNumber, roomNumber, timesRulesAreBroken);
    }

    @Override
    public float getMultiplier() {
        return 1.5f;
    }
}
