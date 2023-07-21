package entities;

import entities.enums.AbstrataColor;

public abstract class AbstrataShape {

    private AbstrataColor color;

    public AbstrataShape() {

    }

    public AbstrataShape(AbstrataColor color) {
        this.color = color;
    }

    public AbstrataColor getColor() {
        return color;
    }

    public void setColor(AbstrataColor color) {
        this.color = color;
    }

    public abstract double area();

}
