package x.crazyjvm.value.j;

/**
 * Created by chenchao on 15/10/13.
 */
public class Point {
    private final int x, y;

    public Point(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return x; }

    public int getY() { return y; }

    public boolean equals(Object that) {

        if (this == that){
            return true;
        }

        if (that instanceof Point){
            return x == ((Point) that).x && y == ((Point) that).y;
        }
        return false;
    }

    public int hashCode() {
        return 31 * x + y;
    }

    public String toString() {
        return String.format("Point(%d, %d)", x, y);
    }

    public static void main(String[] args){
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);

        System.out.println(point1.equals(point2));
    }
}
