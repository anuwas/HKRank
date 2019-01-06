package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	public static void main(String[] args) {
		// This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
		String myRegExString = "[a-zA-Z]+.@gmail.com$";

		// This is the string we will check to see if our regex matches:
		String myString = "gmail@gmail.com";
		
		// Create a Pattern object (compiled RegEx) and save it as 'p'
		Pattern p = Pattern.compile(myRegExString);

		// We need a Matcher to match our compiled RegEx to a String
		Matcher m = p.matcher(myString);

		// if our Matcher finds a match
		if( m.find() ) {
		    // Print the match
		    System.out.println( m.group() );
		}
	}
}
