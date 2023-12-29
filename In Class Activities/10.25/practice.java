import java.util.*;


public class practice {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        HashSet<Integer> B = new HashSet<Integer>();
        
        A.add(1);
        A.add(2);
        A.add(3);
        
        B.add(3);
        B.add(4);
        B.add(5);
        
        A.removeAll(B);

        System.out.println(A);
        System.out.println(B);
    }    
}
    


