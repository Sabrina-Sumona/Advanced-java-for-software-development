public class Chicken implements Eatable, Flyable{
    @Override
    public String getNutrition() {
        return "Protein";
    }

    @Override
    public int getPrice() {
        return 380;
    }

    @Override
    public void fly() {
        System.out.println("Flying rarely.");
    }

    @Override
    public String getName() {
        return "Deshi chicken";
    }
}
