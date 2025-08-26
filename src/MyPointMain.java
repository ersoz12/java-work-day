public class MyPointMain {
    public static void main(String[] args) {
        MyPoint first = new MyPoint(6, 5);
        MyPoint second = new MyPoint(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        MyPoint point = new MyPoint(); // (0,0)
        System.out.println("distance()= " + point.distance());
    }
}

