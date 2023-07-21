package entities;

import entities.enums.AbstrataColor;

public class AbstrataRectangle extends AbstrataShape{

    private Double width;
    private Double height;

    public AbstrataRectangle() {
        super();
    }

    public AbstrataRectangle(AbstrataColor color, Double large, Double height) {
        super(color);
        this.width = large;
        this.height = height;
    }

    public Double getLarge() {
        return width;
    }

    public void setLarge(Double large) {
        this.width = large;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
