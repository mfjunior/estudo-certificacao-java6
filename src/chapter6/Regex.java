package chapter6;

import java.io.BufferedWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {	
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		System.out.println(args[0]);
		boolean b=false;
		while(b=m.find()) {
			System.out.println(m.start() + m.group());
		}
		
		
	}
}
