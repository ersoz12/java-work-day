public class AreaMain {

    public static void main(String[] args) {
        Area wall = new Area(55, 4); // satır 1
        System.out.println("area= " + wall.getArea()); // satır 2

        wall.setHeight(-1.5); // satır 4
        System.out.println("width= " + wall.getWidth());  // satır 5
        System.out.println("height= " + wall.getHeight()); // satır 6
        System.out.println("area= " + wall.getArea());  // satır 7
    }
}
