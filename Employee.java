package customizedComparator;//created package as customizedComparator

/**
 * Creating a PriorityQueue<Employee> class with Customized Comparator. 
     Adding the objects of Employee class in the PriorityQueue object.
       Using the Comparator to sort the employees as per their salaries.
 */
public class Employee implements Comparable<Employee> { //Here public is a access modifier which defines who can access this method
	                 //taken class name as Employee
	String eName; // Declaring variables
	float eSal;//variables taken as eName,Esal

	public Employee(String eName, float eSal) { // Creates method
		//Here public is a access modifier which defines who can access this method
		super();//here taking three different types of variables
		this.eName = eName;

		this.eSal = eSal;
	}
	// here we are using the getter n setter
			// for three different properties
	public String getName() { // Get name of the employee
		return eName; // Return name
	}

	public void setName(String eName) {//Here public is a access modifier which defines who can access this method
		this.eName = eName;//eName
	}

	public float getSalary() { //Here public is a access modifier which defines who can access this method
		// Get name of the employee
		return eSal; // Return salary
	}

	// salary the salary to set

	public void setSalary(float eSal) {//Here public is a access modifier which defines who can access this method
		this.eSal = eSal;//esal
	}

	// toString() method to return values of the object
	public String toString() {//Here public is a access modifier which defines who can access this method
		return "Employee Name: " + eName + "\nMonthly Salary: " + eSal + " \n";
	}

	@Override

	// Comparing on the basis of salary
	public int compareTo(Employee e) {//Here public is a access modifier which defines who can access this method
		if (eSal > e.eSal) {//satement states whether true or false
			return 1;
		} else {
			return -1;//returns
		}
	}

}