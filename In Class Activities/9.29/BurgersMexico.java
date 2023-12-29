public class BurgersMexico extends BurgersUSA {
    
    @Override 
    public void menu() {
        System.out.println("price: " + super.getPrice() * 17.5 + " topping: " + super.getToppings() + ", taco sause");
    }

}
