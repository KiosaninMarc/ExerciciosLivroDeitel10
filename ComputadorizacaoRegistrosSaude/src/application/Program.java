package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.HealthProfile;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITALIZATION OF HEALTH RECORDS");
		System.out.println("=======================================================");
		System.out.print("Firts Name: ");
		String first = sc.nextLine();
		System.out.print("Last Name: ");
		String last = sc.nextLine();
		System.out.print("Gender: ");
		String gender = sc.nextLine();
		System.out.print("Day of birth: ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.print("Month of birth: ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.print("Year of birth: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("Patient weight(peso): ");
		Double weight = sc.nextDouble();
		System.out.print("Patient height(altura): ");
		Double height = sc.nextDouble();
		
		HealthProfile hp = new HealthProfile(first, last, gender, day, month, year, weight, height);
		
		System.out.println("=======================================================");
		System.out.println("PATIENT DATA:");
		System.out.println("_______________________________________________________");
		System.out.println("FULL NAME: " + hp.getFirstName() + " " + hp.getLastName());
		System.out.println("GENDER: " + hp.getGender());
		System.out.println("BIRTH DATE: " + hp.getDay() + "/" + hp.getMonth() + "/" + hp.getYear());
		System.out.println("PATIENT WEIGHT: " + hp.getWeightPerson());
		System.out.println("PATIENT HEIGHT: " + hp.getHeightPerson());
		
		System.out.println("=======================================================");
		System.out.println("RESULT OF THE PHISICAL ANALYSIS:");
		System.out.println("_______________________________________________________");
		System.out.println("Age: " + hp.age());
		String IMC;
		System.out.println("IMC: " + String.format("%.2f", hp.imc()));
		if (hp.imc() < 18.5) {
			IMC = "UNDERWEIGHT";
		}else if (hp.imc() >= 18.5 && hp.imc() < 24.9) {
			IMC = "NORMAL";
		}else if (hp.imc() >= 25.0 && hp.imc() < 29.9) {
			IMC = "OVERWEIGHT";
		}else {
			IMC = "OBESE";
		}
		System.out.println("IMC RESULT: " + IMC);
		System.out.println(hp.fcm() + " BPM - MAXIMUM HEART RATE");
		System.out.println(hp.fca() + " BPM - TARGET HEART RATE SET TO 75% OF MAXIMUM");
		
		sc.close();
	}

}
