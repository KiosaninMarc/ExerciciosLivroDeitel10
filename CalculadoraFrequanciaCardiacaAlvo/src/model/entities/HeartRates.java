package model.entities;

public class HeartRates {

	private String firstName;
	private String lastName;
	private Integer day;
	private Integer month;
	private Integer year;
	
	//Constructors
	public HeartRates() {
	}
	
	public HeartRates(String firstName, String lastName, Integer day, Integer month, Integer year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	//Methods	
	public int age() {
		return 2022 - year;
	}
	
	public int fcm() {
		return 220 - age();
	}
	
	public double fca() {
		return fcm() * 0.75;
	}
}
