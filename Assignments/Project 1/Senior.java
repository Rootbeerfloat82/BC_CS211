/* Ethan Leonard
 * 202435864
 * 9/27/23
 * This program is the child class of BusFare, it overides the getFare method and adjusts for discount
 */

public class Senior extends BusFare {

    private static final double seniorDiscount = 0.5;
    // Constructor
    public Senior(String name) {
        super(name);
    }
    // Updated get fare method
    @Override
    public double getFare() {
        return super.getFare() * seniorDiscount;
    }
    // Updated printRate method
    @Override 
    public void printRate() {
        System.out.println("Name: " + this.getName() + " Fare: $" + this.getFare() );
     }

    
}
