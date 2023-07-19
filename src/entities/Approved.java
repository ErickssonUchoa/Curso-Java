package entities;

public class Approved {

    private String name;
    private double noteOne;
    private double noteTwo;

    public Approved(String name) {
        this.name = name;
    }

    public Approved(double noteOne) {
        this.noteOne = noteOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNoteOne() {
        return noteOne;
    }

    public void setNoteOne(double noteOne) {
        this.noteOne = noteOne;
    }

    public double getNoteTwo() {
        return noteTwo;
    }

    public void setNoteTwo(double noteTwo) {
        this.noteTwo = noteTwo;
    }
}
