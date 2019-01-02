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
    	List<String> names = new ArrayList<>();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            names.add(firstName);

            String emailID = firstNameEmailID[1];
            
            
        }
        Collections.sort(names);
        scanner.close();
        System.out.println(names);
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
