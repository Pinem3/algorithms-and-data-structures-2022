package ru.mirea.practice.s21k0647.zad1;

public class Circle extends Shape {
    double r;

    Circle(String type, double r) {
        super(type);
        this.r = r;
    }

    public String getType() {
        return "Circle";
    }

    public String getAria() {
        return String.format("%.2f", Math.PI * (r * r));
    }

    public String getPerimeter() {
        return String.format("%.2f", Math.PI * r * 2);
    }

    public String toString() {
        return getType() + " r = " + this.r + " Aria: " + getAria() + " Perimeter: " + getPerimeter();
    }


}
