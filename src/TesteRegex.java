import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TesteRegex {
	public static void main(String[] args) {
		String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
		String s = "Os e-mails são aaaaa@abc.com.br and patt34y@xyz.com cadsc cas cad cdsas csad cads  d ds mfjeng@gmail.com";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			System.out.println("The e-mail id is: " + matcher.group());
		}
		
	}
}
