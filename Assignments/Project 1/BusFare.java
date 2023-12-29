/* Ethan Leonard
 * 202435864
 * 9/27/23
 * This program is the parent class, it defines the standard fare and creates the getName and getFare Methods
 */

public abstract class BusFare {

    // Variables
    private static double fare = 5.0;
    private String name;

    // Constructor
    public BusFare(String name) {
        this.name = name;
    }

    // Getter method for names
    public String getName() {
        return this.name;
    }

    // Getter method for fares
    public double getFare() {
        return fare;
    }

    // Printing method
    public abstract void printRate();
} 