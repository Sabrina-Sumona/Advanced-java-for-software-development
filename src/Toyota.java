public class Toyota extends Car{
    double price;

    public Toyota(int d, int w, String c, String n, String t, String m, int p){
        super(d, w, c, n, t , m);
        this.price = p;
    }

    public Toyota(){
        System.out.println("\nEmpty toyota constructor called..");
    }

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
