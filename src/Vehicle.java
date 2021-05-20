public class Vehicle {
    private int doors;
    private int wheels;
    private String color;
    protected String name;

    //public String describe() {
    public String toString() {
        // String description = "\nThe ve.."
        return "\nThe vehicle has "
                + doors
                + " doors, "
                + wheels
                + " wheels,"
                + " and it's color is "
                + color
                + ".";
        // return description;
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
    // private method cant access from the sub-classes
    //private void setWheels(int wheels) {
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
