package defaultComparator;//created package as defaultComparator

/**
 * Creating a PriorityQueue<Integer> with default Comparator.
     Adding some elements in the PriorityQueue object.
       Removing the elements from PrioirityQueue from Head.
 */
import java.util.Arrays;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
                   //Array contains elements of similar data type
import java.util.PriorityQueue;
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit


public class PriorityQueueComparator {  //Creating class name as PriorityQueueComparator
	//Here public is a access modifier which defines who can access this method
	public static void main(String[] args) { //Main class
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		
        //Creating Priority queue object 
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		// Adding elements in the priority queue
		pQueue.add(3);//adding 3
		pQueue.add(6);//adding 6
		pQueue.add(9);// adding 9
		pQueue.add(4);//adding 4
		pQueue.add(1);//adding 1

		Object[] arr = pQueue.toArray(); //Converting queue into array for sorting
		Arrays.sort(arr); // Sorting the array 
		System.out.println("Elements in Priority queue:");//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		for (Object p : arr) { // Prints all sorted elements in the priority queue 
			System.out.println(p);//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output

		}

		int i;  //Declaring variable i
         for (i = 0; pQueue.size() > i; i--) { //Loop will execute till the size of Priority Queue.

			Integer head = pQueue.peek(); // Points towards new TOP element in the queue

			head = pQueue.poll(); //Removes the TOP element from the queue
			System.out.println("\n"+ head + " is removed  ");//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
			head = pQueue.peek(); // Points towards new TOP element in the queue
			System.out.println("New head is: " + head);//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
			if (pQueue.isEmpty()) { // If Priority queue is Empty
				System.err.println("Priority queue is empty"); // Prints empty queue statement
															
				break;  // Breaks the loop 

			}

		}

	}

}