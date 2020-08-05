package generateNames;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class generateName {
	String fullName = null, firstName = null, lastName = null;
	String[] name;

	public void generateFakeName(String countryName, String gender) {

		try {
			String s = null;
			String cmd = "python generate.py " + countryName + " " + gender;
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((s = in.readLine()) != null) {
				fullName = s;
				System.out.println(s);
			}
			name = fullName.split(" ");
			firstName=name[0];
			lastName=name[1];

		} catch (Exception e) {
			e.printStackTrace();
		}
//		databaseConnection dc=new databaseConnection();
//		dc.insertData(firstName,lastName,countryName,gender);
	}
}
