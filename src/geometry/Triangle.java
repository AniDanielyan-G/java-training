package geometry;

public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    // Six-argument constructor
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.vertex1 = new Point(x1, y1);
        this.vertex2 = new Point(x2, y2);
        this.vertex3 = new Point(x3, y3);
    }

    // Three-argument constructor
    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = new Point(vertex1);
        this.vertex2 = new Point(vertex2);
        this.vertex3 = new Point(vertex3);
    }

    // Copy constructor
    public Triangle(Triangle triangle) {
        this(triangle.vertex1, triangle.vertex2, triangle.vertex3);
    }

    // Accessors for x and y coordinates of each vertex
    public double getX1() {
        return vertex1.getX();
    }

    public double getY1() {
        return vertex1.getY();
    }

    public double getX2() {
        return vertex2.getX();
    }

    public double getY2() {
        return vertex2.getY();
    }

    public double getX3() {
        return vertex3.getX();
    }

    public double getY3() {
        return vertex3.getY();
    }

    // Mutators for x and y coordinates of each vertex
    public void setX1(double x) {
        vertex1.setX(x);
    }

    public void setY1(double y) {
        vertex1.setY(y);
    }

    public void setX2(double x) {
        vertex2.setX(x);
    }

    public void setY2(double y) {
        vertex2.setY(y);
    }

    public void setX3(double x) {
        vertex3.setX(x);
    }

    public void setY3(double y) {
        vertex3.setY(y);
    }

    // Accessors and mutators for each vertex
    public Point getVertex1() { return vertex1; }
    public Point getVertex2() { return vertex2; }
    public Point getVertex3() { return vertex3; }

    public void setVertex1(Point vertex1) { this.vertex1 = new Point(vertex1); }
    public void setVertex2(Point vertex2) { this.vertex2 = new Point(vertex2); }
    public void setVertex3(Point vertex3) { this.vertex3 = new Point(vertex3); }

    // Method to calculate the perimeter
    public double perimeter() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        return side1 + side2 + side3;
    }

    // Method to calculate the area using Heron's formula
    public double area() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the center of mass
    public Point centerOfMass() {
        double x = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double y = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new Point(x, y);
    }

    // Check if the triangle is equilateral
    public boolean isEquilateral() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        return side1 == side2 && side2 == side3;
    }

    // Check if the triangle is isosceles
    public boolean isIsosceles() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        return side1 == side2 || side2 == side3 || side3 == side1;
    }

    // Check if the triangle is scalene
    public boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

    // toString method
    @Override
    public String toString() {
        return "Triangle[vertex1=" + vertex1 + ", vertex2=" + vertex2 + ", vertex3=" + vertex3 + "]";
    }

}
