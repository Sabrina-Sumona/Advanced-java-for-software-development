public class MainInterface {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        //        sell(eagle);


        Aeroplane aeroplane = new Aeroplane();
        sell(aeroplane);

        Chicken chicken = new Chicken();
        eat(chicken);

        Rice rice = new Rice();
        eat(rice);

    }
    public static void sell (Sellable sellable) {
//        sellable.fly();
        System.out.println(sellable.getPrice());
    }

    public static void eat (Eatable eatable) {
        System.out.println(eatable.getPrice());
        System.out.println(eatable.getNutrition());
    }
}
