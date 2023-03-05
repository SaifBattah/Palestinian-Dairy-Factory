import java.util.*;
public class Test {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		// ProductionWorker
		// Adding two elements of type ProductionWorker to array list
		emp.add(new ProductionWorker("Ahmad", "124-B", new Date(2 / 2 / 2020),
				new Addresses("Street23", "State11", "Ramallah", "69555"), 1, 12, 220));
		emp.add(new ProductionWorker("Tawfiq", "040-D", new Date(27 / 3 / 2019),
				new Addresses("Street03", "State31", "Gaza", "32545"), 2, 8, 200));
		// TeamLeader
		// Adding two elements of type TeamLeader to array list
		emp.add(new TeamLeader("Khaled", "512_H", new Date(5 / 7 / 2019),
				new Addresses("Street12", "State05", "Jerusalem", "62935"), 2, 15, 200, 60, 70));

		emp.add(new TeamLeader("Hussein", "981-H", new Date(3 / 1 / 2019),
				new Addresses("Street67", "State02", "Jenin", "73291"), 1, 13, 180, 50, 65));
		// ShiftSupervisor
		// Adding two elements of type ShiftSupervisor to array list
		emp.add(new ShiftSupervisor("Ibraheem", "416-d", new Date(1 / 12 / 2020),
				new Addresses("Street07", "State13", "Nablus", "78245"), 3500, 55, 50));

		emp.add(new ShiftSupervisor("Mohammad", "533-C", new Date(4 / 5 / 2018),
				new Addresses("Street20", "State16", "Jericho", "60182"), 2000, 50, 60));
		// Print The Array List Of previous Elements using for loop
		for (int i = 0; i < emp.size(); i++) { 
			if(emp.get(i).getType() == 1) { // Type 1  for ProductionWorker
				System.out.println(emp.get(i));
				System.out.println("-----------------------------------------");
			}
			if(emp.get(i).getType() == 2) { // Type 1  for Super Visor
				System.out.print("Enter Bonus Value For Super Visor: "+"\n"+"Bonus= ");
				System.out.println(emp.get(i));
				System.out.println("-----------------------------------------");
			}
			if(emp.get(i).getType() == 3) { // Type 1  for Team Leader
				System.out.print("Enter Bonus Value For Team Leader: "+"\n"+"Bonus= ");
				System.out.println(emp.get(i));
				System.out.println("-----------------------------------------");
			}

		} 
		// print the average value of all previous employees salaries using a
		// AVG(ArrayList<Employee> emp) method
		System.out.println("AVG = " + AVG(emp));
		System.out.println("Employees Above The Salary Average is: ");
		// print the list of employees which their salaries is greater than the average
		// using method
		ListGreaterThanAverage(emp);
	}

	public static double AVG(ArrayList<Employee> emp) {
		double sum_of_salaries = 0; // giving sum an initial value of zero
		for (int i = 0; i < emp.size(); i++) { // for loop to accumululate total employyes salaries
			sum_of_salaries += emp.get(i).getTotalSalary();
		}
		double AVG = sum_of_salaries / emp.size(); // finiding the average value by divide total salaries by arraylist size -which is 6-
		return AVG; // returning the value to be printed
	}

	public static void ListGreaterThanAverage(ArrayList<Employee> emp) { // method to extract employees that above
																			// average
		for (int i = 0; i < emp.size(); i++) { // for loop to check every employee salary
			if (emp.get(i).getTotalSalary() > AVG(emp)) {// comparing salaries with average to know wether it is greater
															// or not
				System.out.println(emp.get(i).getEmployee_name()+"    >>>   With Salary = "+emp.get(i).getTotalSalary()); // if its greater than average , here we return the
																	// name of that employee to be printed
			}
		}
	}

}
