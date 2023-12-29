/* Ethan Leonard
 * 202435864
 * 11/25/23
 * This program runs a main function in java in order to test the Heap211 class.
 * It will create a random number generator and then use that to decide whether to add or remove a node.
 * It will then add or remove a node and print out the heap.
 */

import java.util.Random;

public class myHeap {
    
	// int to control how many tests
    final static int HOW_MANY_TESTs = 20;

    public static void main(String[] args) {

		// print out the title of the project
        System.out.println("Project 3. MinHeap (Fall 2023)");
		
		// create an instance of Random class
		Random rand = new Random();
		
		// creat an instance of Heap211 class
		Heap211 minHeap = new Heap211();

		// for each test
        for (int test = 1; test <= HOW_MANY_TESTs; test++) {
						
			//generate an random number to decide the action is 'add' or 'remove'
			int action = rand.nextInt(3);
				
			// if the action is 'add' {

			if (action <= 1) {
				
				// generate a node number using random number (eg 0~49) 
				int node = rand.nextInt(49);
				
				// print out the action and the node number
				System.out.println("Action " + test + ": Add " + node);   
					
				// add node to the heap	by calling 'add method' in Heap211 class.                                	                  
				minHeap.add(node);
					
			// } 
			}
		
			// if the action is 'remove' {
			else {
			
				if (minHeap.isEmpty()) {  //if the heap is empty, skip this action, do not count this action
					test = test - 1;
				}
				
				else {
					
					// print out the action
					System.out.println("Action " + test+": Remove min");
						
					// remove node to the heap by calling 'remove method' in Heap211 class.	                    
					// int min = minHeap.remove();

					minHeap.remove();

				}
			}
		}
    }
}
