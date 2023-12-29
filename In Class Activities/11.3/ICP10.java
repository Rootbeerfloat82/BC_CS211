// ArrayList is faster because when I ran 5 tests, 
//during test 1 it was 3.04% of LinkedList, 
// during test 2 it was 3.31% of linkedlist, 
//during test 3 it was 4.56% of linkedlist, 
//during test 4 it was 4.85% of linkedlist and 
//during test 5 it was 3.69% of linkedlist. 
// This is because both arraylist and linkedlist take O(n)
// to remove stuff because arraylist has to shift all the values of the list
// and linkedlist has to search the list for the value you would like to remove
// Because array list stores its values all right next to each other in memory, it
// can perform its functions very quickly.



import java.util.*;

public class ICP10 {

    static int howManyTests = 5;
    static int howManyData = 50000; 
    static ArrayList<String> data1 = new ArrayList<>();
    static LinkedList<String> data2 = new LinkedList<>();

    public static void main(String[] args) {

        for (int i=1; i<=howManyTests; i++) { 
            initilization();
            System.out.printf("\nTest: "+i + "\n"); 
            remove();
        }
    }

    public static void initilization() {

        data1.clear();
        data2.clear();
        
        // add String value of int i to ArrayList and LinkedList
        for (int i = 0; i<howManyData; i++) {   
            data1.add(Integer.toString(i));
            data2.add(Integer.toString(i));
        
            // FYI: from int to string: Integer.toString(i));
        }
    }
      
    public static void remove() {

        double TimeRemove_ArrayList=0.0;   
        double TimeRemove_LinkedList=0.0; 
        double startTime, endTime;

        int n = 1;
     
        for (int i=0; i<howManyData/2; i++){  // remove half of the data

            Random rand = new Random();

          // index must be within the size of ArrayList or LinkedList.
          // remember that both lists are always the same size.
          int index2remove = rand.nextInt(howManyData-n);
       
          // remove index2remove from ArrayList

          startTime = System.currentTimeMillis();

          data1.remove(index2remove);

          endTime = System.currentTimeMillis();

          TimeRemove_ArrayList += endTime - startTime;

            startTime = System.currentTimeMillis();

          data2.remove(index2remove);

          endTime = System.currentTimeMillis();

          TimeRemove_LinkedList += endTime - startTime;

          n++;



          // accumulate the processing time of this ‘remove’ operation
          // eg) TimeRemove_ArrayList += ...
          // see week 5-2 for how to check processing time
     
          // remove index2remove from LinkedList
          // accumulate the processing time of this ‘remove’ operation
          // eg) TimeRemove_LinkedList += ...
     
         } // end for  
        
        // Printout the result as shown in the sample log

        System.out.println("Removed: " + howManyData);
        System.out.println("ArrayList: " + TimeRemove_ArrayList/1000.0 + " sec");
        System.out.println("LinkedList: " + TimeRemove_LinkedList/1000.0 + " sec");
        System.out.println("ArrayList's processing time is " + (TimeRemove_ArrayList/TimeRemove_LinkedList)*100 + "% of LinkedList");
     
     } // end remove()
}