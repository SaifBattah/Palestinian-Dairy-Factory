import java.util.*;

public class ProductionWorker extends Employee {

	protected int Shift;
	protected double Hourly_pay_rate;
	protected int Number_of_hours_per_month;
	protected double Salary;

	public ProductionWorker() {
		super();
	}

	public ProductionWorker(String Employee_name, String Employee_Number, Date Hire_date, Addresses Address, int Shift,
			double Hourly_pay_rate, int Number_of_hours_per_month) {
		super(Employee_name, Employee_Number, Hire_date, Address); // to get the values from Employee Class
		this.Shift = Shift;
		this.Hourly_pay_rate = Hourly_pay_rate;
		this.Number_of_hours_per_month = Number_of_hours_per_month;
	}

// Setters And Getters
	public int getShift() {
		return Shift;
	}

	public void setShift(int Shift) {
		this.Shift = Shift;
	}

	public double getHourly_pay_rate() {
		return Hourly_pay_rate;
	}

	public void setHourly_pay_rate(double Hourly_pay_rate) {
		this.Hourly_pay_rate = Hourly_pay_rate;
	}

	public int getNumber_of_hours_per_month() {
		return Number_of_hours_per_month;
	}

	public void setNumber_of_hours_per_month(int Number_of_hours_per_month) {
		this.Number_of_hours_per_month = Number_of_hours_per_month;
	}

	@Override
	public String toString() {
		String st = "Production Worker: " + "\n" + "Name: " + Employee_name + "\n" + "Number: " + Employee_Number + "\n"
				+ "Hire date: " + Hire_date + "\n" + "Address{{{" + "\n" + Address + "}}}" + "\n" + "Shift: ";
		if (Shift == 1) { // if shift = 1 , then print that this shift is Day shift
			st += "Day Shift";
		} else if (Shift == 2) { // if shift = 2 , then print that this shift is Night shift
			st += "Night Shift";
		}
		st += "\n" + "Hourly pay rate: " + Hourly_pay_rate + "\n" + "Number of worked hours: "
				+ Number_of_hours_per_month + "\n" + "Total Salary=" + getTotalSalary() + "";
		return st;
	}
	public double getTotalSalary() {
		if (Shift == 1) {
			// month = 26 workdays , each day should at lease 8 hours, so monthly 26*8 = 208hrs
			if (Number_of_hours_per_month <= 208) { // if he works less than or equal required working hours
				Salary = Number_of_hours_per_month * Hourly_pay_rate;
			} else if (Number_of_hours_per_month > 208) {// if he works extra time, then calculate the bonus salary
															// adding it to basic salary
				Salary = (208 * Hourly_pay_rate) + ((Number_of_hours_per_month - 208) * Hourly_pay_rate * 1.25);
			}
		} else if (Shift == 2) {
			// month = 26 workdays , each day should at lease 7 hours, so monthly 26*7 = 182hrs
			if (Number_of_hours_per_month <= 182) {// if he works less than or equal required working hours
				Salary = Number_of_hours_per_month * Hourly_pay_rate;
			} else if (Number_of_hours_per_month > 182) {// if he works extra time, then calculate the bonus salary
															// adding it to basic salary
				Salary = (182 * Hourly_pay_rate) + ((Number_of_hours_per_month - 182) * Hourly_pay_rate * 1.5);
			}
		} else {
			System.out.println("Invalid Shift Value, it should be either 1 or 2"); // if the user enter a value that is
																					// not 1 or 2
		}
		return Salary;
	}
	public double getType() { // this method is to identify type of worker, to print the correct statement for bonus.
		double Type = 1;
		return Type;
	}
}
