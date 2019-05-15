package main.models;

public class Rule {
    private double fine;
    private int minimumTimesBeforeFine;
    private String title;
    private String description;

    public Rule(double fine, int minimumTimesBeforeFine, String title, String description) {
        this.fine = fine;
        this.minimumTimesBeforeFine = minimumTimesBeforeFine;
        this.title = title;
        this.description = description;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public int getMinimumTimesBeforeFine() {
        return minimumTimesBeforeFine;
    }

    public void setMinimumTimesBeforeFine(int minimumTimesBeforeFine) {
        this.minimumTimesBeforeFine = minimumTimesBeforeFine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
