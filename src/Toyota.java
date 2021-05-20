public class Toyota extends Car{
    double price;

    public String toString() {
        return  super.toString()
                + "\nAnd it's price is "
                + price
                + " lakh tk.";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
