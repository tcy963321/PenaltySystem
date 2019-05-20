package main.models;

import java.util.List;

/**
 * Class to pass data from New Case Form to Display Report Screen
 */
public class Penalty {
    
    private String adminName, adminPosition, department, date, warning;
    private Student student;
    private List<Rule> rulesBroken;

    public Penalty(String adminName, String adminPosition, String department, String date, String warning, Student student, List<Rule> rulesBroken) {
        this.adminName = adminName;
        this.adminPosition = adminPosition;
        this.department = department;
        this.date = date;
        this.warning = warning;
        this.student = student;
        this.rulesBroken = rulesBroken;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPosition() {
        return adminPosition;
    }

    public void setAdminPosition(String adminPosition) {
        this.adminPosition = adminPosition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Rule> getRulesBroken() {
        return rulesBroken;
    }

    public void setRulesBroken(List<Rule> rulesBroken) {
        this.rulesBroken = rulesBroken;
    }
}
