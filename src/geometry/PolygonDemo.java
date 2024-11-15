package geometry;

public class PolygonDemo {  public static void main(String[] args) {
    // Constructing polygons using different constructors
    double[] xCoords = {0, 4, 4, 0};
    double[] yCoords = {0, 0, 3, 0};
    Polygon polygon1 = new Polygon(xCoords, yCoords); // Square polygon

    Point[] points = {new Point(0, 0), new Point(5, 0), new Point(3, 4)};
    Polygon polygon2 = new Polygon(points); // Triangle

    Polygon polygon3 = new Polygon(polygon1); // Copy of polygon1

    // Displaying the results for each polygon
    Polygon[] polygons = {polygon1, polygon2, polygon3};
    for (Polygon p : polygons) {
        System.out.println(p);
        System.out.println("Perimeter: " + p.perimeter());
        System.out.println();
    }
}
}
