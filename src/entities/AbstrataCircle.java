package entities;

import entities.enums.AbstrataColor;

public class AbstrataCircle extends AbstrataShape{

    private Double radius;

    public AbstrataCircle() {
        super();
    }

    public AbstrataCircle(AbstrataColor color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
