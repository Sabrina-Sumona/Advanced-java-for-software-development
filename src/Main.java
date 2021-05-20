public class Main {
    public static void main(String[] args) {
        Vehicle vehicle0 = new Vehicle();
        System.out.println(vehicle0);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setColor("blue");
        vehicle1.setDoors(4);
        vehicle1.setWheels(4);
        //System.out.println(vehicle1.describe());
        System.out.println(vehicle1);
        //System.out.println(vehicle1.toString());

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setColor("pink");
        vehicle2.setDoors(2);
        vehicle2.setWheels(8);
        //System.out.println(vehicle2.describe());
        System.out.println(vehicle2);

        Vehicle car1 = new Car();
        car1.setDoors(4);
        car1.setColor("white");
        car1.setWheels(4);
        car1.name = "power car";
        System.out.println(car1);

        Car car2 = new Car();
        //car2.setDoors(2);
        car2.setColor("black");
        // car2.setWheels(4);
        car2.setType("car");
        car2.setModel("S-963");
        car2.setName("racing car");
        System.out.println(car2);

        Toyota toyota1 = new Toyota();
        toyota1.model = "TY-007";
        toyota1.type = "luxury car";
        toyota1.setName("super car");
        toyota1.setPrice(76);
        System.out.println(toyota1);

        Car toyota2 = new Toyota();
        toyota2.setModel("TY-097");
        toyota2.setType("luxury car");
        toyota2.setName("super car");
        System.out.println(toyota2);

        Vehicle toyota3 = new Toyota();
        toyota3.name = "super car";
        toyota3.setColor("purple");
        System.out.println(toyota3);

    }
}
