public class Vehicle {
    private int doors;
    private int wheels;
    private String color;

    protected String name;

//     constructor
    public Vehicle(int d, int w, String c, String n){
        this.doors = d;
        this.wheels = w;
        this.color = c;
        this.name = n;
    }

//      empty constructor
    public Vehicle(){
        System.out.println("\nEmpty vehicle constructor called..");
    }

//    public String describe() {
//         String description = "\nThe vehicle has "
//                        + doors
//                        + " doors, "
//                        + wheels
//                        + " wheels,"
//                        + " and it's color is "
//                        + color
//                        + ".";
//     return description;

    public String toString() {
        return "\nThe vehicle has "
                + doors
                + " doors, "
                + wheels
                + " wheels, it's "
                + color
                + " colored and it's name is "
                + name
                + ".";
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
