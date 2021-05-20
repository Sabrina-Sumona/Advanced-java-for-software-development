public class Car extends Vehicle {
    String type;
    String model;

    public Car(int d, int w, String c, String n, String t, String m){
        super(d, w, c, n);
        this.type = t;
        this.model = m;
    }

    public Car(){
        System.out.println("\nEmpty car constructor called..");
    }

    public String toString() {
        return  super.toString()
//                + "\nIt's name is "
//                + this.getName()
                + "\nThis is a "
                //+ type
                + this.type
                + " type vehicle and it's model is "
                //+ model
                + this.model
                + ".";
    }

//    public void setName(String name){
//        //super.name = name + "-" + this.model;
//        super.name = name;
//        super.setDoors(4);
//        super.setWheels(4);
//    }
//    public String getName(){
//        return super.name;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
