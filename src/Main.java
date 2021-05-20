public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//       System.out.println(vehicle.describe());
       Vehicle vehicle = new Vehicle();
       System.out.println(vehicle);

        Vehicle vehicle01 = new Vehicle();
        vehicle01.setDoors(4);
        vehicle01.setWheels(4);
        vehicle01.setColor("blue");
        System.out.println(vehicle01);

        Vehicle vehicle0 = new Vehicle(0, 2, "red", "bicycle");
        System.out.println(vehicle0);

        Vehicle vehicle1 = new Vehicle(6, 8, "blue", "bus");
        vehicle1.setDoors(2);
        vehicle1.setWheels(6);
        vehicle1.name = "truck";
//        vehicle1.setColor("blue");
//        System.out.println(vehicle1.describe());
//        System.out.println(vehicle1.toString());
        System.out.println(vehicle1);


        Vehicle vehicle2 = new Vehicle(2, 3, "multi", "rickshaw");
//         vehicle2.setDoors(2);
//         vehicle2.setWheels(8);
//         vehicle2.setColor("pink");
//        System.out.println(vehicle2.describe());
        System.out.println(vehicle2);

        Vehicle car1 = new Car(4, 4, "purple", "car", "power car", "S-006");
//         car1.setDoors(4);
//         car1.setWheels(4);
//         car1.setColor("white");
//         car1.name = "power car";
        System.out.println(car1);

        Car car2 = new Car();
         car2.setColor("black");
         car2.setType("car");
         car2.setModel("S-963");
//         car2.setName("racing car");
        System.out.println(car2);

        Toyota toyota1 = new Toyota(4, 4, "pink", "toyota car", "luxury car", "TY-007", 56);
//         toyota1.model = "TY-007";
//         toyota1.type = "luxury car";
//         toyota1.setName("super car");
//         toyota1.setPrice(76);
        System.out.println(toyota1);

        Car toyota2 = new Toyota(4, 4, "white", "toyota car", "luxury car", "TY-077", 78);
//         toyota2.setModel("TY-097");
//         toyota2.setType("luxury car");
//         toyota2.setName("super car");
        System.out.println(toyota2);

        Vehicle toyota3 = new Toyota();
         toyota3.name = "sport car";
         toyota3.setColor("purple");
        System.out.println(toyota3);

    }
}
