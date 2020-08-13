package generateNames;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import database.databaseConnection;

/**
 * @author yousef suliman 
 * this Class Called from Main Class and It Call The databaseConnection Class to 
 * save the output 
 * It have a method generate Fake name only and it called from the main class in main PACKAGE
 */
public class generateName {
	
	/**
	 * @author yousef suliman
	 * @param countryName
	 * @param gender
	 * This method create a process to call Python script to generate
	 * first and last name according to the parameter countryName and gender 
	 * and call the database function insertData to store the output.  
	 */
	public void generateFakeName(String countryName, String gender) {
		String fullName = null, firstName = null, lastName = null; //declaration variables full name first and last  
		try {
			String readline = null;
			String cmd="python3 /home/student/git/generateNames/main.py "+ countryName+" "+gender; //create a command
			Process p = Runtime.getRuntime().exec(cmd); //execute the command by creating a process	
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream())); //read the output line by line to store the name in their variables 
			System.out.println(fullName=in.readLine());
			firstName=in.readLine();
			lastName=in.readLine();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		databaseConnection dc=new databaseConnection(); //create object from class databaseConnection named dc
		dc.insertData(firstName,lastName,countryName,gender);//call the method insert data
	}
}
