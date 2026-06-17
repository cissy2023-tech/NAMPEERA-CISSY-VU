package vu.questiontwo;
/**
 * Question 2(b) and 2(c)
 * Triangle class inheriting from Shape.
 *NAMPEERA CISSY
 */
public class Triangle extends Shape {
//creating diferent sides of the Triangle
    private double a;
    private double b;
    private double c;

    /**
     * Constructor
     * Part (c): Validates triangle inequality.
     */
    public Triangle(double a,
                    double b,
                    double c)
            throws InvalidShapeException {
             
        if (a <= 0 || b <= 0 || c <= 0) {

            throw new InvalidShapeException(
                    "All sides must be positive.");
        }

        if ((a + b<= c) || (a + c<= b) ||(b + c<= a)) {

            throw new InvalidShapeException(
                    "Triangle inequality violated.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Part (b)
     */
    @Override
    public double getArea() {

        double s =
                (a + b+ c) / 2;

        return Math.sqrt(
                s *
                (s - a) *
                (s - b) *
                (s - c));
    }

    /**
     * Part (b)
     */
    @Override
    public double getPerimeter() {
        return a+ b + c;
    }

    /**
     * Part (b) and (c)
     */
    @Override
    public void resize(double factor) {

        if (factor <= 0) {
            throw new RuntimeException(
                    "Resize factor must be positive.");
        }

        a *= factor;
        b *= factor;
        c *= factor;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + getArea() + "]";
    }
}

