package generateNames;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import database.databaseConnection;

public class generateName {
	public void generateFakeName(String countryName, String gender) {
		String fullName = null, firstName = null, lastName = null;
		String[] name;
		try {
			String s = null;
			String cmd="python3 /home/student/PycharmProjects/generateName/main.py "+ countryName+" "+gender;
			Process p = Runtime.getRuntime().exec(cmd);	
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((s = in.readLine()) != null) {
				fullName = s;
			}
			System.out.println(fullName);
			name = fullName.split(" ");
			firstName=name[0];
			lastName=name[1];
		} catch (Exception e) {
			e.printStackTrace();
		}
		databaseConnection dc=new databaseConnection();
		dc.insertData(firstName,lastName,countryName,gender);
	}
}
