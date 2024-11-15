package geometry;

public class TriangleDemo {
    public static void main(String[] args) {
        // Constructing triangles using different constructors
        Triangle triangle1 = new Triangle(0, 0, 3, 0, 1.5, Math.sqrt(6.75)); // Equilateral triangle
        Triangle triangle2 = new Triangle(new Point(0, 0), new Point(4, 0), new Point(2, 3)); // Isosceles triangle
        Triangle triangle3 = new Triangle(triangle1); // Copy of triangle1

        // Displaying the results for each triangle
        Triangle[] triangles = {triangle1, triangle2, triangle3};
        for (Triangle t : triangles) {
            System.out.println(t);
            System.out.println("Perimeter: " + t.perimeter());
            System.out.println("Area: " + t.area());
            System.out.println("Center of Mass: " + t.centerOfMass());
            System.out.println("Is Equilateral: " + t.isEquilateral());
            System.out.println("Is Isosceles: " + t.isIsosceles());
            System.out.println("Is Scalene: " + t.isScalene());
            System.out.println();
        }
    }
}

