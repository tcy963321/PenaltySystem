package main.models;

public class Rule {
    private double fine;
    private String description;

    public Rule(double fine, String description) {
        this.fine = fine;
        this.description = description;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
