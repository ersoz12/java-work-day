public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(MyPoint other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
