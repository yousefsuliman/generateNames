package main;

import java.util.Scanner;

import generateNames.generateName;
import generateNames.supportedCountries;
/**
 * 
 * @author yousef suliman 
 * Main class the base class of the application it's create an object of the following classes:
 * 1-supportedCountries class from generateName package //2-generateName class from generateName package
 * it take the country Name and gender from the user and send them as parameters for the method 
 * generateFakeName from class generateName 
 */
public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String countryName, gender; //get the input from user as string  
		System.out.println("Please Enter One Of These Countires By Enter The Following Format 'XX'");
		supportedCountries sc = new supportedCountries(); //crate object from class supportedCountries named sc 
		sc.printCountries();// print the Provided countries 
		System.out.println("Enter Country :");
		countryName = in.nextLine();
		countryName=countryName.toUpperCase(); //change the user input to upperCase to avoid errors in the generateName Class 
		System.out.println("Select Gender :");
		gender = in.nextLine();
		gender = gender.toLowerCase(); //change the user input to lowerCase to avoid errors in the generateName Class
		generateName gn = new generateName();
		gn.generateFakeName(countryName,gender);//call method generateFakeName with parameter countryName,gender
	}

}
	