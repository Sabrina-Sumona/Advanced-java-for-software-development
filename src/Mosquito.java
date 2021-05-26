public class Mosquito implements Flyable, Living{

    @Override
    public void fly() {
        System.out.println("Looking for blood. Flying towards it..");
    }

    @Override
    public String getName() {
        return "Adis Mosquito";
    }

    @Override
    public int getLivingYears() {
        return 3;
    }
}
