package customizedComparator;//created package as customizedComparator

import java.util.PriorityQueue;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit

public class EmployeePriorityQueue {//Here public is a access modifier which defines who can access this method
                                   //created class as EmployeePriorityQueue
	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		// Creates Priority queue object 
		PriorityQueue<Employee> empPQ = new PriorityQueue<Employee>();
		
		//Adding elements in the priority queue
		empPQ.add(new Employee("Anvesh", 70988));
		empPQ.add(new Employee("Praveen", 30500));
		empPQ.add(new Employee("Tharun", 490000));
		empPQ.add(new Employee("Roopesh", 62400));
		empPQ.add(new Employee("Lokesh", 10000));

		while (empPQ.size() != 0) {//using while taking size
			System.out.println(empPQ.remove());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}
	}

}