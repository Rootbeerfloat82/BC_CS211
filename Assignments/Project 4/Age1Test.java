/* Ethan Leonard
 * 202435864
 * 11/29/23
 * Tests the age1 class
 */

public class Age1Test {
    public static void main(String[] args) {
        Age1 age1 = new Age1();
        age1.setAgeString("Eighteen");
        System.out.println(age1.ageString());
        age1.setAgeInt(18);
        System.out.println(age1.ageInt());
        age1.setAgeFloat(18.0);
        System.out.println(age1.ageFloat());
    }
}
