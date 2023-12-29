public class BurgersUSA extends Burgers {

    @Override 
    public void menu() {
        System.out.println("price: " + super.getPrice() + " topping: " + super.getToppings());
    }
    
}
