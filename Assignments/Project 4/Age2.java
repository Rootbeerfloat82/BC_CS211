/* Ethan Leonard
 * 202435864
 * 11/29/23
 * Uses generics to make the age class more flexible
 */

public class Age2 <T> {
    private Object age;

    public Age2() {
        System.out.println("Your age is");
    }

    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return (T) age;
    }
}
