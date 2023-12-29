import java.util.*;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i<4; i++) {
            System.out.println(i);
            hm.put(i++,i++);
            System.out.println(hm);
            hs.add(hm.get(i-1));
            System.out.println(hs);
            hm.put(i, hm.get(i--));
            System.out.println(hm);

        }
        System.out.println(hm);
        System.out.println(hs);
    }

}
