package line;

public class LineDemo {
    public static void main(String[] args) {
        // Constructing line using four-argument constructor
        Line line1 = new Line(0, 0, 4, 3);
        System.out.println("Line 1 (Four-argument constructor):");
        System.out.println(line1);
        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Midpoint of Line 1: " + line1.midpoint());

        // Constructing line using two-argument constructor
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Line line2 = new Line(p1, p2);
        System.out.println("\nLine 2 (Two-argument constructor):");
        System.out.println(line2);
        System.out.println("Length of Line 2: " + line2.length());
        System.out.println("Midpoint of Line 2: " + line2.midpoint());

        // Creating a copy of the first line using the copy constructor
        Line line3 = new Line(line1);
        System.out.println("\nLine 3 (Copy of Line 1):");
        System.out.println(line3);
        System.out.println("Length of Line 3: " + line3.length());
        System.out.println("Midpoint of Line 3: " + line3.midpoint());

        // Change the beginning point of the first line to be the midpoint of the second line
        Point midpointLine2 = line2.midpoint();
        line1.setStart(midpointLine2);
        System.out.println("\nAfter changing the start point of Line 1 to be the midpoint of Line 2:");
        System.out.println(line1);
        System.out.println("New Length of Line 1: " + line1.length());
        System.out.println("New Midpoint of Line 1: " + line1.midpoint());
    }
}
