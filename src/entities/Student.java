package entities;

public class Student {

    public String name;
    public double noteOne;
    public double noteTwo;
    public double noteThree;

    public double finalGrade() {
        return noteOne + noteTwo + noteThree;
    }

    public double missingNote() {
        if(finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0;
        }
    }


}
