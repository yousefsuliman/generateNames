package generateNames;


/**
 * 
 * @author yousef suliman 
 * This class contains the an array of the supported country for generating the fake name 
 * It have a constructor that decelerate the array and method print to print the countries for the user to pick one of them 
 * It called from main class in main PACKAGE
 */
public class supportedCountries {

	String[] countries;
	public supportedCountries() {
		countries = new String[] { "AT", "BG","CH",
				"CN", "CZ", "DE","DK","ES", "FI", "FR","GB", "GE", "GH", "GR", "HR", "HU",
				"ID", "IL", "IN", "IR", "IT", "JO","JP", "KR","LB", "LT", "LV", "MX", "NL",
				"NO", "NP", "NZ", "PL", "PS", "PT","QC", "RO", "RU", "SA", "SE","SY",
				"TH", "TR", "TW", "UA","US" };
	}
/**
 * method printCountries for print the countries
 */
	public void printCountries() {
		for (int i = 0; i < countries.length; i++) {
			if (i % 7 == 0)
				System.out.println();
			System.out.print(countries[i] + " || ");
		}
		System.out.println();System.out.println();
	}

}