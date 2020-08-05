package main;

import java.util.Scanner;

import generateNames.generateName;
import generateNames.supportedCountries;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String countryName, gender;
		System.out.println("Please Enter One Of These Countires By Enter The Following Format 'XX_XX'"
				+ "\nThe First Two Letter Is The Language for The Generating Name \n"
				+ "And The Second Tow Letter For The Country");
		supportedCountries sc = new supportedCountries();
		sc.printCountries();
		System.out.println("Enter Country :");
		countryName = in.nextLine();
		System.out.println("Select Gender :");
		gender = in.nextLine();
		gender = gender.toLowerCase();
		generateName gn = new generateName();
		gn.generateFakeName(countryName,gender);
	}

}
