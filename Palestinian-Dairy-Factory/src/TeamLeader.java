import java.util.*;

class TeamLeader extends ProductionWorker {

	Scanner input = new Scanner(System.in);
	private double bonus;
	private double Required_Training_Hours;
	private double Training_Hours_Attended;
	private double Bonus_achieved;

	public TeamLeader() {
		super();
	}

	public TeamLeader(String Employee_name, String Employee_Number, Date Hire_date, Addresses Address, int Shift,
			double Hourly_pay_rate, int Number_of_hours_per_month, double Required_Training_Hours,
			double Training_Hours_Attended) {
		super(Employee_name, Employee_Number, Hire_date, Address, Shift, Hourly_pay_rate, Number_of_hours_per_month); // extract employee informations from Employee Class
		this.Required_Training_Hours = Required_Training_Hours;
		this.Training_Hours_Attended = Training_Hours_Attended;
	}

//setters and getters
	public double getRequired_Training_Hours() {
		return Required_Training_Hours;
	}

	public void setRequired_Training_Hours(double Required_Training_Hours) {
		this.Required_Training_Hours = Required_Training_Hours;
	}

	public double getTraining_Hours_Attended() {
		return Training_Hours_Attended;
	}

	public void setTraining_Hours_Attended(double Training_Hours_Attended) {
		this.Training_Hours_Attended = Training_Hours_Attended;
	}

	@Override
	public String toString() {
		String st= "TeamLeader: " + "\n" + "Name: " + Employee_name + "\n" + "Number: " + Employee_Number + "\n"
				+ "Hire date: " + Hire_date + "\n" + "Address: " + Address + "\n" + "Required Training Hours: "
				+ Required_Training_Hours + "\n" + "Training Hours Attended: " + Training_Hours_Attended + "\n";
		st += "Enter Bonus Value for TeamLeader";
			this.bonus = input.nextInt();
			st += "Shift: ";
		if (Shift == 1) { // if shift = 1 , then print that this shift is Day shift
			st += "Day Shift";
		} else if (Shift == 2) { // if shift = 2 , then print that this shift is night shift
			st += "Night Shift";
		} else {
			st += "Invalid Input";
		}

		st += "\n" + "Hourly pay rate: " + Hourly_pay_rate + "\n" + "Number of worked hours: "
				+ Number_of_hours_per_month + "\n"+ "TotalSalary: " + getTotalSalary() + "";

		return st;
	}
	public double getTotalSalary() {
		Bonus_achieved = (bonus * Training_Hours_Attended / Required_Training_Hours); // calculating Bonus Achieved thismonth according to done hours of training
		double Salary = super.getTotalSalary() + Bonus_achieved; // here we calculate total salary using super class then add bonus from this class.
		return Salary;
	}
	public double getType() {// this method is to identify type of worker, to print the correct statement for bonus.
		double Type = 3;
		return Type;
	}
}
