package customizedComparator;//created package as customizedComparator

import java.util.Comparator;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
//java comparator interface is used to order the use defined class objects,compare() method,vollectionetc

public class SalComp implements Comparator<Employee> { // Creates a class as SalComp and implements through Comparator interface 
	//Here public is a access modifier which defines who can access this method

	@Override
	public int compare(Employee e1, Employee e2) { //Here public is a access modifier which defines who can access this method

		//Creates a Method and do the comparison based on salary
		
		if (e1.getSalary() < e2.getSalary()) {//staing whether true or false
			return 1;
		} else {
			return -1;//returns
		}
		
	}

}