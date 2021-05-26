public class Eagle implements Flyable, Living{

    @Override
    public void fly() {
        System.out.println("Flapping feathers.. Flying.");
    }

    @Override
    public String getName() {
        return "White Eagle";
    }

    @Override
    public int getLivingYears() {
        return 34*365;
    }
}
