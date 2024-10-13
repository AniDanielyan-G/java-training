package line;

public class Line {
    private Point start;
    private Point end;

    // Four-argument constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Two-argument constructor (using Points)
    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    // Copy constructor
    public Line(Line other) {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    // Accessors
    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    // Mutators
    public void setStart(Point start) {
        this.start = new Point(start);
    }

    public void setEnd(Point end) {
        this.end = new Point(end);
    }

    public void setLine(double x1, double y1, double x2, double y2) {
        this.start.setX(x1);
        this.start.setY(y1);
        this.end.setX(x2);
        this.end.setY(y2);
    }

    public double[][] getLine() {
        double[][] result = new double[2][2];
        result[0][0] = start.getX();
        result[0][1] = start.getY();
        result[1][0] = end.getX();
        result[1][1] = end.getY();

        return result;
    }


    // Calculate the length of the line
    public double length() {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    // Calculate the midpoint of the line
    public Point midpoint() {
        double midX = (start.getX() + end.getX()) / 2;
        double midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }

    @Override
    public String toString() {
        return "Line[start=" + start + ", end=" + end + "]";
    }
}


