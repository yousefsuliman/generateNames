package generateNames;

public class supportedCountries {

	String[] countries;

	public supportedCountries() {
		countries = new String[] { "ar_PS palestine", "ar_SA Saudi Arabia", "bg_BG Bulgaria", "cs_CZ Czech",
				"de_AT Austria", "de_CH Switzerland", "de_DE Germany", "dk_DK Denmark", "el_GR Greece",
				"en_GB United Kingdom", "en_NZ New Zealand", "en_TH Thailand", "en_US United States", "es_CA Catalan",
				"es_MX Mexican", "et_EE Estonia", "fa_IR Iran", "fi_FI Finland", "fr_CH Switzerland", "fr_FR France",
				"he_IL Israel", " hi_IN India", "hr_HR Croatia", "hu_HU Hungary", "hy_AM Armenia", "id_ID Indonesia",
				"it_IT Italy", "ja_JP Japan", "ka_GE Georgia", "ko_KR South Korea", "lt_LT Lithuania", "lv_LV Latvia",
				"ne_NP Nepal", "nl_NL Netherlands", "no_NO Norway", "pl_PL Poland", "pt_PT Portugal", "ro_RO Romania",
				"ru_RU Russia", "sl_SI Slovenia", "sv_SE Sweden", "ta_IN India", "th_TH Thailand", "tr_TR Turkey",
				"tw_GH Ghana", "uk_UA Ukraine", "zh_CN China", "zh_TW Taiwan" };
	}

	public void printCountries() {
		for (int i = 0; i < countries.length; i++) {
			if (i % 9 == 0)
				System.out.println();
			System.out.print(countries[i] + " // ");
		}
		System.out.println();
	}

}