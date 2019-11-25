package chapter6;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class TrabalhandoComDatas {
	
	public static void main(String[] args) {			
		Calendar c = Calendar.getInstance();		
				
		// US		
		Locale locUS = new Locale("en","US");
		// Calendar c = Calendar.getInstance();
		Date d1 = c.getTime();		
		DateFormat dfUS = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT ,locUS);
		System.out.println("US Full    " + dfUS.format(d1));
		
		// Italy
		Locale locIT = new Locale("it","IT");
		// Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy: " + dfIT.format(d2));

		// Portugal
		Locale locPT = new Locale("pt");		
		// Calendar c = Calendar.getInstance();
		Date d3 = c.getTime();
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Portugal: " + dfPT.format(d3));
		
		// Brasil
		Locale locBR = new Locale("pt","BR");
		// Calendar c = Calendar.getInstance();
		Date d4 = c.getTime();
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brasil: " + dfBR.format(d4));
		
		// Índia
		Locale locIN = new Locale("hi","IN");
		// Calendar c = Calendar.getInstance();
		Date d5 = c.getTime();
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.SHORT, locIN);
		System.out.println("Índia: " + dfIN.format(d5));
		
		// Japão
		Locale locJA = new Locale("ja");
		// Calendar c = Calendar.getInstance();
		Date d6 = c.getTime();
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.SHORT, locJA);
		System.out.println("Japão: " + dfJA.format(d6));
		
		
		Calendar calendar = Calendar.getInstance();		
		calendar.set(2010,02,23);
		//Date date = calendar.getTime();
		
		Locale locDK = new Locale("da","DK");
		System.out.println("Default: " + locIT.getDisplayCountry());		
		System.out.println("Local: " + locIT.getDisplayCountry(locIT));
		System.out.println("Local: " + locIT.getDisplayLanguage(locUS));				
		
		System.out.println("Default: " + locDK.getDisplayCountry());
		System.out.println("Local: " + locDK.getDisplayCountry(locDK));
		System.out.println("Default: " + locBR.getDisplayCountry());
		System.out.println("Local: " + locBR.getDisplayLanguage());		
		
		System.out.println("cdascadsckjlnhcdskjladklndsklnkln ");
	}
}
						