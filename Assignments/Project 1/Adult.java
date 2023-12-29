/* Ethan Leonard
 * 202435864
 * 9/27/23
 * This program is the child class of BusFare, it overides the getFare method which is kinda pointless right now but maybe fairs for adults will change in the future
 */

public class Adult extends BusFare {

    private static final double adultDiscount = 1.0;
    // Constructor
    public Adult(String name) {
        super(name);
    }
    // Updated getFare Method
    @Override
    public double getFare() {
        return super.getFare() * adultDiscount;
    }
    // Updated printRate method
    @Override 
    public void printRate() {
        System.out.println("Name: " + this.getName() + " Fare: $" + this.getFare());
    }
}
