/* Ethan Leonard
 * 202435864
 * 11/29/23
 * Tests the age2 class
 * 
 * Explanation:
 * 
 * Age2 is more efficent than Age1 because it makes use of the generic concept. This allows for 
 * a much more compact and flexible program as it does not outright define what object types it
 * will be using throughout. Due to this, you can use pass in strings, ints and floats all into
 * the same object. This is not possible with Age1 as it is not generic and therefore cannot be
 * used with multiple object types. In Age1, you have to use multiple variables to stores the 
 * different data types within the instance of the class. This is not the case with Age2.
 */

public class Age2Test {
    public static void main(String[] args) {
        Age2<Object> age2 = new Age2<>();
        age2.setAge("Eighteen");
        System.out.println(age2.getAge());
        age2.setAge(18);
        System.out.println(age2.getAge());
        age2.setAge(18.0);
        System.out.println(age2.getAge());
    }
}
