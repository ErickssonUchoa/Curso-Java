package entities;

public class Gender {

    private double height;
    private char gender;

    public Gender(double height) {
        this.height = height;
    }

    public Gender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
