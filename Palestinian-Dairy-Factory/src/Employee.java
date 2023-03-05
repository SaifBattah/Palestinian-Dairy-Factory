import java.util.*;

public class Employee {
	protected String Employee_name;
	protected String Employee_Number;
	protected Date Hire_date;
	protected Addresses Address;// type Addresses, inherates in subclass
	public double TotalSalary;
	public double Type;
	public Employee() {
		Hire_date = new Date();
	}

	public Employee(String Employee_name, String Employee_Number, Date Hire_date, Addresses Address) {
		this.Employee_name = Employee_name;
		setEmployee_Number(Employee_Number); // method to check if Number is accepted or not
		this.Hire_date = Hire_date;
		this.Address = Address;
	}

// setters and getters for Employee Parameters
	public void setHire_date(Date Hire_date) {
		this.Hire_date = Hire_date;
	}

	public Addresses getAddress() {
		return Address;
	}

	public void setAddress(Addresses Address) {
		this.Address = Address;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String Employee_name) {
		this.Employee_name = Employee_name;
	}

	public String getEmployee_Number() {
		return Employee_Number;
	}

	public void setEmployee_Number(String Employee_Number) {
		if (isEmpNumberValid(Employee_Number)) { // if boolean true, print number and continue
			this.Employee_Number = Employee_Number;
		} else { // if boolean false, print this message and continue
			this.Employee_Number = "Invalid Employee Number. Enter A Valid Value Please";
		}
	}

	public Date getHire_date() {
		return Hire_date;
	}

	private boolean isEmpNumberValid(String Employee_Number) { // method to check if number equal "XXX-L" or not
		if (Employee_Number.length() != 5) { // if number great or less than 5 , will return boolean false
			return false;
		} else {// if number equals 5 , continue checking to see if it equal "XXX-L"
			for (int i = 0; i < 3; i++) {// 3 loops for first 3 digits
				if (Employee_Number.charAt(i) < '0' && Employee_Number.charAt(i) > '9') {// check if digit is in range
																							// of 0-9
					return false; // if one digit is found to be out of range, return false
				}

			}
			if (Employee_Number.charAt(3) != '-') {// check the hash if exists or not
				return false;
			}

			if (Employee_Number.charAt(4) < 'A' || Employee_Number.charAt(4) > 'M') { // check the last digit if its in
																						// range of A-M
				return false;
			}

			return true; // if the Number Meets the requirements then print the Number, because its true

		}
	}

	@Override
	public String toString() {
		return "Employee [Employee_name=" + Employee_name + ", Employee_Number=" + Employee_Number + ", Hire_date="
				+ Hire_date + ", Address=" + Address + "]";
	}
	public double getTotalSalary() {
		return TotalSalary;
	}
	public double getType() {// this method is to identify type of worker, to print the correct statement for bonus.
		return Type;
	}
}