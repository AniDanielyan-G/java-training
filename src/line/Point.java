package line;

public class Point {
    private double x;
    private  double y;

    public Point() {
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;

        return result;
    }

    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ")";
    }
}
