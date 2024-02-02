package files;

public class key {
	
	private String stock_number;
	private String year;
	private String make;
	private String model;
	private String date;
	private String person;
	
	public String getStock_number() {
		return stock_number;
	}
	public void setStock_number(String stock_number) {
		this.stock_number = stock_number;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "key [stock_number=" + stock_number + ", year=" + year + ", make=" + make + ", model=" + model
				+ ", date=" + date + ", person=" + person + "]";
	}

	
}
