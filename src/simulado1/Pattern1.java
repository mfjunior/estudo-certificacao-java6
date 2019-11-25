package simulado1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
	public static void main(String[] args) throws Exception{
		Pattern p = Pattern.compile("My");
		Matcher m = p.matcher("My Dad And My Mom");
		StringBuffer s = new StringBuffer();
		
		boolean found = m.find();

		while(found) {
			m.appendReplacement(s,"Our" );
			//System.out.println(s);
			//System.out.println(m.group());
			found = m.find();
		}
		
		m.appendTail(s);
		
		System.out.println(s);
	}
}
