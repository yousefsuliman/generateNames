package main;

import java.util.Scanner;

import generateNames.generateName;
import generateNames.supportedCountries;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String countryName, gender;
		System.out.println("Please Enter One Of These Countires By Enter The Following Format 'XX'");
		supportedCountries sc = new supportedCountries();
		sc.printCountries();
		System.out.println("Enter Country :");
		countryName = in.nextLine();
		countryName=countryName.toUpperCase();
		System.out.println("Select Gender :");
		gender = in.nextLine();
		gender = gender.toLowerCase();
		generateName gn = new generateName();
		gn.generateFakeName(countryName,gender);
	}

}
	