public class Rice implements Eatable{
    @Override
    public String getNutrition() {
        return "Carbs";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
