package bitwise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        int t = scanner.nextInt();
        int[] numArray = new int[t];
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int i = n-1;
            int max  =0;
            while(i-->0) {
            	for(int j=(i+1);j<=n;j++) {
            		int andg = i&j;
    				if(andg>max && andg<k) {
    					max = andg;
    				}
    			}
            }
			numArray[tItr]=max;
        }

        scanner.close();
        for(int i = 0; i< numArray.length; i++){

        	System.out.println(numArray[i]);

        	}
        
    }

}
