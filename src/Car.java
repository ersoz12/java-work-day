public class Car {

     private String make = "Tesla" ;

     private String model = "Model X" ;

     private String color = " Gray " ;

     private int doors = 2;

     private boolean convertible = true;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake () {
          return make;

     }

      public void describeCar () {

          System.out.println(doors + "-Doors" +
                  color + " " +
                  make + "  " +
                  model + " " +
                  (convertible ? "Convertible" : ""));
      }

}
