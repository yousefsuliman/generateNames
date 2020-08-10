package generateNames;

public class supportedCountries {

	String[] countries;

	public supportedCountries() {
		countries = new String[] { "AM","AT", "BG", "BR", "CA","CH",
				"CN", "CZ", "DE","DK", "EE", "ES", "FI", "FR","GB", "GE", "GH", "GR", "HR", "HU",
				"ID", "IL", "IN", "IR", "IT", "JO","JP", "KR", "LT", "LV", "MX", "NL",
				"NO", "NP", "NZ", "PL", "PS", "PT","QC", "RO", "RU", "SA", "SE", "SI",
				"TH", "TR", "TW", "UA","US" };
	}

	public void printCountries() {
		for (int i = 0; i < countries.length; i++) {
			if (i % 7 == 0)
				System.out.println();
			System.out.print(countries[i] + " || ");
		}
		System.out.println();System.out.println();
	}

}