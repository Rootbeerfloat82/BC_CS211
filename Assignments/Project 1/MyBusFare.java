/* Ethan Leonard
 * 202435864
 * 9/27/23
 * This program creates two new people objects name Ted and Chole and prints out their names and fares
 */

public class MyBusFare {
    // Main Method
    public static void main(String[] args)  {
        Adult ted = new Adult("ted");
        ted.printRate();
        Senior chole = new Senior("chole");
        chole.printRate();
    }
}
