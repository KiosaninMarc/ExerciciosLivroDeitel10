package model.entities;

public class HealthProfile {

	private String firstName;
	private String lastName;
	private String gender;
	private Integer day;
	private Integer month;
	private Integer year;
	private Double weightPerson;
	private Double heightPerson;
	
	//Constructors
	public HealthProfile() {
	}

	public HealthProfile(String firstName, String lastName, String gender, Integer day, Integer month, Integer year, Double weightPerson, Double heightPerson) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
		this.weightPerson = weightPerson;
		this.heightPerson = heightPerson;
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

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
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

	public Double getWeightPerson() {
		return weightPerson;
	}

	public void setWeightPerson(Double weightPerson) {
		this.weightPerson = weightPerson;
	}

	public Double getHeightPerson() {
		return heightPerson;
	}

	public void setHeightPerson(Double heightPerson) {
		this.heightPerson = heightPerson;
	}
	
	//Methods
	public Integer age() {
		return 2022 - year;
	}
	
	public Integer fcm() {
		return 220 - age();
	}
	
	public Double fca() {
		return fcm() * 0.75;
	}
	
	public Double imc() {
		return weightPerson / Math.pow(heightPerson, 2);
	}
	
	
	
	
	
	
	
}
