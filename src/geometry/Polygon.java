package geometry;

 public class Polygon {
    private Point[] vertices;

    // Constructor that takes an array of x and y coordinates
    public Polygon(double[] xCoords, double[] yCoords) {
        int n = xCoords.length;
        vertices = new Point[n];
        for (int i = 0; i < n; i++) {
            vertices[i] = new Point(xCoords[i], yCoords[i]);
        }
    }

    // Constructor that takes an array of Points
    public Polygon(Point[] points) {
        vertices = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            vertices[i] = new Point(points[i]);
        }
    }

    // Copy constructor
    public Polygon(Polygon polygon) {
        this(polygon.vertices);
    }

    // Accessors and mutators for each vertex
    public Point getVertex(int index) {
        return vertices[index];
    }

    public void setVertex(int index, Point vertex) {
        vertices[index] = new Point(vertex);
    }

    // Method to calculate the perimeter of the polygon
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < vertices.length; i++) {
            Point current = vertices[i];
            Point next = vertices[(i + 1) % vertices.length];
            perimeter += current.distanceTo(next);
        }
        return perimeter;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Polygon[vertices=");
        for (Point vertex : vertices) {
            sb.append(vertex).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Remove last comma and space
        sb.append("]");
        return sb.toString();
    }
}


