public abstract class Burgers {
    private double price = 3.0;
    private String toppings = "beef patty, tomato, onion, ranch sause";

    public double getPrice() {
        return this.price;
    }

    public String getToppings() {
        return this.toppings;
    }

    public abstract void menu();
}
