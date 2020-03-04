package shapes;

public class ShapeHandler {

    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        double sum = 0;

        for (Shape s : shapes) {
            sum += s.volume();
        }

        return sum;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double sum = 0;

        for (Shape s : shapes) {
            sum += s.surfaceArea();
        }

        return sum;
    }



    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{ new Tetrahedron(3), new Cylinder(3, 6), new Cube(3) };

        double volSum = volumeSum(shapes);
        System.out.println(volSum);

        double surSum = surfaceAreaSum(shapes);
        System.out.println(surSum);
    }
}
