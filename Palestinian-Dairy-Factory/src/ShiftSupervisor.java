import java.util.Date;
import java.util.Scanner;

class ShiftSupervisor extends Employee {

	Scanner input = new Scanner(System.in);
	private int Monthly_Salary;
	private int bonus = 0;
	private int Produced_Products;
	private int Must_Produced_Products;

	public ShiftSupervisor() {
		super();
	}

	public ShiftSupervisor(String Employee_name, String Employee_Number, Date Hire_date, Addresses Address,
			int Monthly_Salary, int Produced_Products, int Must_Produced_Products) {
		super(Employee_name, Employee_Number, Hire_date, Address); // extract employee informations from Employee Class
		this.Monthly_Salary = Monthly_Salary;
		this.Produced_Products = Produced_Products;
		this.Must_Produced_Products = Must_Produced_Products;
	}
//setters and getters
	public int getMonthly_Salary() {
		return Monthly_Salary;
	}

	public void setMonthly_Salary(int Monthly_Salary) {
		this.Monthly_Salary = Monthly_Salary;
	}

	public int getProduced_Products() {
		return Produced_Products;
	}

	public void setProduced_Products(int Produced_Products) {
		this.Produced_Products = Produced_Products;
	}

	public int getMust_Produced_Products() {
		return Must_Produced_Products;
	}

	public void setMust_Produced_Products(int Must_Produced_Products) {
		this.Must_Produced_Products = Must_Produced_Products;
	}

	@Override
	public String toString() {
		String st = "ShiftSupervisor: " + "\n" + "Name: " + Employee_name + "\n" + "Number: " + Employee_Number + "\n"
				+ "Hire date: " + Hire_date + "\n" + "Address{{{" + "\n" + Address + "}}}" + "\n" + "Monthly Salary: ";
				st+= Monthly_Salary + "\n" + "Produced Products: " + Produced_Products + "\n" + "Must Produced Products: "
				+ Must_Produced_Products;
				if (Produced_Products >= Must_Produced_Products) { // if Condition mets, ask user to enter bonus value
					st+="\n"+">>>Condition fulfilled, Since produced > must produced<<<";
					this.bonus = input.nextInt();

				} else {// if conditions didn't met, set bonus to zero
					st+="\n"+"Condition didn't fulfilled"+"\n"+">>>>>>>>>>>>No Bonus<<<<<<<<<<<<";
					bonus = 0;
				}
				st+= "\n"+">>Bonus = "+bonus+"\n" +"Total Salary: " + getTotalSalary() + "";
		return st;
	}
	public double getTotalSalary() {// adding monthly salary to bonus value and return it to be printed
		return Monthly_Salary + bonus;
		
	}
	public double getType() {// this method is to identify type of worker, to print the correct statement for bonus.
		double Type = 2;
		return Type;
	}
}