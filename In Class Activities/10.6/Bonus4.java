import java.util.*;

public class Bonus4 {

    static HashSet<String> CS210 = new HashSet<String>();
    static HashSet<String> CS211 = new HashSet<String>();
    static HashSet<String> CS212 = new HashSet<String>();
    
    public static void Initialize() {
        
        CS210.add("Bill"); CS210.add("Eva"); CS210.add("Olivia");
        CS211.add("Eva"); CS211.add("Olivia"); CS211.add("Kim");   
        CS212.add("Chloe"); CS212.add("Jane"); CS212.add("Olivia"); CS212.add("Bill");    
    }
    
    public static void atLeastOneClass() {
        HashSet<String> inOneClass = new HashSet<String>();

        inOneClass.addAll(CS210);
        inOneClass.addAll(CS211);
        inOneClass.addAll(CS212);

        System.out.println(inOneClass.toString());
    }
    
    public static void main(String[] args) {  
        Initialize();
        atLeastOneClass();
    }
}