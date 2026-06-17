package vu.questiontwo;

/**
 *
 * @author NAMPEERA CISSY VU-BIT-DAY-2507-3600-DAY
 */
public abstract class ShapeDemo {
    

/**
 * Question 2(c), 2(d) and 2(e)
 * Driver class.
 */


    public static void main(String[] args) {

        try {

            // Part (d): Create shapes
            Shape[] shapes = new Shape[3];

            shapes[0] = new Circle(5);
            shapes[1] = new Rectangle(4, 6, "Blue", true);
            shapes[2] = new Triangle(3, 4, 5);

            // Part (d): Dynamic binding
            ShapeUtils.printAreas(shapes);

            // Part (d): Largest shape
            Shape largestShape =
                    ShapeUtils.largest(shapes);

            System.out.println("\n===== LARGEST SHAPE =====");
            System.out.println(largestShape);

            // Part (c): Exception demonstration
            System.out.println(
                    "\n===== INVALID TRIANGLE TEST =====");

            Triangle invalidTriangle =
                    new Triangle(1, 2, 10);

        } catch (InvalidShapeException e) {

            System.out.println(
                    "Exception Caught: "
                    );
        }
    }

    private static class ShapeUtils {

        private static void printAreas(Shape[] shapes) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static Shape largest(Shape[] shapes) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ShapeUtils() {
        }
    }
}

    
