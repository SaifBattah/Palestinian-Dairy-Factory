public class Addresses {
	private String Street;
	private String State;
	private String City;
	private String Zip_Code;

	public Addresses() {
	}

	public Addresses(String Street, String State, String City, String Zip_Code) {
		this.Street = Street;
		this.State = State;
		this.City = City;
		this.Zip_Code = Zip_Code;
	}

//setters and getters
	public String getStreet() {
		return Street;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getZip_Code() {
		return Zip_Code;
	}

	public void setZip_Code(String Zip_Code) {
		this.Zip_Code = Zip_Code;
	}

	@Override
	public String toString() {
		return "Street: " + Street + "\n" + "State: " + State + "\n" + "City: " + City + "\n" + "Zip Code: " + Zip_Code
				+ "";
	}

}
