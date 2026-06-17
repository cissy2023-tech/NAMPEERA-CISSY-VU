package vu.questiontwo;

/**
 *
 * @author USER
 */
public abstract class Shape {
    

    // Part (b): Protected fields
    protected String color = "white";
    protected boolean filled;

    // Constructor 1
    public Shape() {
    }

    // Constructor 2
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Part (b): Abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void resize(double factor)
                        throws InvalidShapeException;
       
    

    @Override
    public String toString() {
        return "Shape [color=" + color +
                ", filled=" + filled + "]";
    }
}
    

