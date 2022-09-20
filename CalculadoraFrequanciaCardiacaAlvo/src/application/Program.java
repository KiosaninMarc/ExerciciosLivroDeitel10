package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.HeartRates;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MAXIMUM HEART RATE AND TARGET HEART RATE TESTS");
		System.out.println("_________________________________________________");
		System.out.print("Enter your first name: ");
		String first = sc.nextLine();
		System.out.print("Enter your last name: ");
		String last = sc.nextLine();
		System.out.print("Enter your Birth Day: ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Birth Month: ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Birth Year: ");
		int year = sc.nextInt();
		sc.nextLine();
		
		HeartRates hr = new HeartRates(first, last, day, month, year);
		
		System.out.println("=================================================");
		System.out.println("PATIENT INPUT DATA:");
		System.out.println("Full name: " + hr.getFirstName() + " " + hr.getLastName());
		System.out.println("Birth date: " + hr.getDay() + "/" + hr.getMonth() + "/" + hr.getYear());
		System.out.println("Age: " + hr.age());
		System.out.println("_________________________________________________");
		System.out.println("MAXIMUM HEART RATE:");
		System.out.println(hr.fcm() + " beats per minutes");
		System.out.println("_________________________________________________");
		System.out.println("TARGET HEART RATE SET TO 70% OF MAXIMUM");
		System.out.println(hr.fca() + " beats per minutes");
		
		

		sc.close();
	}

}
