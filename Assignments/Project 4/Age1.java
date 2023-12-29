/* Ethan Leonard
 * 202435864
 * 11/29/23
 * Does not use generics to make the age class less flexible
 */

public class Age1 {

    private String ageString;
    private int ageInt;
    private double ageFloat;

    public Age1() {
        System.out.println("Your age is");
    }

    public void setAgeString(String age) {
        this.ageString = age;
    }

    public void setAgeInt(int age) {
        this.ageInt = age;
    }

    public void setAgeFloat(double age) {
        this.ageFloat = age;
    }

    public String ageString() {
        return ageString;
    }

    public int ageInt() {
        return ageInt;
    }

    public double ageFloat() {
        return ageFloat;
    }
}

