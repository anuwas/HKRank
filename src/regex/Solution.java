package regex;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	//Map<String,String> names = new HashMap<>();
    	List<String> namesList = new ArrayList<>();
    	String myRegExString = "[a-zA-Z]+.@gmail.com$";
    	Pattern p = Pattern.compile(myRegExString);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
  

            String emailID = firstNameEmailID[1];
            //names.put(firstName, emailID);
            namesList.add(firstName+"-"+emailID);
            
        }
        
        scanner.close();
        /*names.forEach((key,value) -> {
        	Matcher m = p.matcher(value);
        	if( m.find() ) {
    		    // Print the match
        		System.out.println("Key : " + key + " Value : " + value);
    		}
            

        });*/
        Collections.sort(namesList);
        namesList.forEach((names)->{
        	String[] nameArr = names.split("-");
        	Matcher m = p.matcher(nameArr[1]);
        	if( m.find() ) {
    		    // Print the match
        		System.out.println(nameArr[0]);
    		}
        });
        
    }
    /*

     * input
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

output
julia
julia
riya
samantha
tanya
     */
}
