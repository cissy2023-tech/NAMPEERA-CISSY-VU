package vu.questiontwo;

/**
 *
 * @author USER
 */
public class Circle extends Shape {

    private double radius;

    /**
     * Constructor
     * Part (c): Throws InvalidShapeException for invalid radius.
     * @throws vu.questiontwo.InvalidShapeException
     */
    public Circle(double radius) throws InvalidShapeException {

        if (radius <= 0) {
            throw new InvalidShapeException(
                    "Radius must be greater than zero.");
        }

        this.radius = radius;
    }

    /**
     * Part (b): Override getArea()
     * @return 
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Part (b): Override getPerimeter()
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Part (b) and (c)
     * Resize the circle.
     * @param factor
     */
    @Override
    public void resize(double factor) {

        if (factor <= 0) {
            throw new RuntimeException(
                    "Resize factor must be positive.");
        }

        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius +
                ", area=" + getArea() + "]";
    }
}
    

