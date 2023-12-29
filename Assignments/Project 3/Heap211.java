/* Ethan Leonard
 * 202435864
 * 11/29/23
 * 
 */


import java.util.ArrayList;

public class Heap211 {

    // new arraylist to hold the heap
    static public ArrayList<Integer> heap = new ArrayList<>();

    // constructor
    Heap211() {
        heap.add(0);  // we need to add 0 because we are using 1-based indexing
    }

    /* proj. 3 */

    // find parent
    int parent(int index) {
        return index / 2;
    }

    // find left child
    int leftChild(int index) {
        return index * 2;
    }

    // find right child
    int rightChild(int index) {
        return index * 2 + 1;
    }

    // checks if parent exists
    boolean hasParent(int index) {
        return index > 1;
    }

    // checks if left child exists
    boolean hasLeftChild(int index) {
        return leftChild(index) < heap.size();
    }

    // checks if right child exists
    boolean hasRightChild(int index) {
        return rightChild(index) < heap.size();
    }

    // swaps two nodes
    void swap(int a, int b) {
        int temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
        System.out.println("   swap: " + heap.get(a) + " <-> " + heap.get(b));
    }
    

    // CP 15
    // peek at the min value
    int peekMin() {
        return heap.get(1);
    }
    // checks if heap is empty
    boolean isEmpty() {
        return heap.size() == 1;
    }

    // add method
    void add(int value) {
        // CP 15
        heap.add(value); // add as rightmost leaf

        // printing for ui
        System.out.println("   heap: " + printHeap());
        System.out.println("   bubble-up: start");

        // proj 3 bubbles

        // start at the end of the heap and work up
        int index = heap.size() -1 ;
        // boolean to check if we are done
        boolean found = false;
        // while we are not done and we have a parent
        while (!found && hasParent(index)) {
            // if the parent is greater than the current node
            int parent = parent(index);
            if (heap.get(index) <= heap.get(parent)) {
                swap(index, parent(index));
                index = parent(index);
            } else {
                found = true;
            }
        
        }
        
        // printing for ui
        System.out.println("   bubble-up: end");
        System.out.println("   new heap: " + printHeap());
    }

    // remove method
    int remove() {
        // printing for ui
        System.out.println("   heap: " + printHeap());

        // CP 15

        int min = peekMin();  // peek min value by calling peekMin()
        swap(1, heap.size() - 1); // swap the first and last elements
        heap.remove(heap.size() - 1); // remove the last node

        // printing for ui
        System.out.println("   Removed: " + min);

        // printing for ui
        System.out.println("   bubble-down: start");

        int index = 1; // start at the beginning of the heap
        // boolean to check if we are done
        boolean found = false;
        while (!found && hasLeftChild(index)) {
            // if the left child is smaller than the right child
            int smallestChildIndex = leftChild(index);
            if (hasRightChild(index) && heap.get(rightChild(index)) < heap.get(smallestChildIndex)) {
                smallestChildIndex = rightChild(index);
            }
            // if the current node is greater than the smallest child
            if (heap.get(index) > heap.get(smallestChildIndex)) {
                swap(index, smallestChildIndex);
                index = smallestChildIndex;
            } else {
                found = true;
            }
        }

        // printing for ui
        System.out.println("   bubble-down: end");

        System.out.println("   new heap: " + printHeap());

        return min;
    }

    // print heap method
    public String printHeap(){
        
        // string builder to hold the heap
        StringBuilder result = new StringBuilder("["); 
        
        // if the heap is not empty
        if (heap.size()>1) {
         result.append(heap.get(1));
        }
        
        // for each node in the heap
        for (int i = 2; i < heap.size(); i++){
            result.append(", ").append(heap.get(i));
        }
        // return the heap  
        return result + "]";
    }
    
}

