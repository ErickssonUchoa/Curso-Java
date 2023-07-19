package util;

public class Rectangle {
    public double width;
    public double height;
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return (width + height) * 2;
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public String toString() {
        return  "Area: "
                + String.format("%.2f%n", area())
                + "Perímetro: "
                + String.format("%.2f%n", perimeter())
                + "Diagonal: "
                + String.format("%.2f%n", diagonal());
    }

    // area - a = w * h
    // perimetro - p = (w + h) * 2
    // diagonal - d = raiz de w2 + raiz de h2
}
