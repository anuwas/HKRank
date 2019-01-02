package nestedlogic;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] fixedDateArr = new int[3];
		int[] returnDateArr = new int[3];
		int output = 0;
		int T =2;
		while(T-->0) {
			if(T==1) {				
				returnDateArr = Arrays.stream(sc.nextLine().split(" "))
					    .mapToInt(Integer::parseInt)
					    .toArray();				
			}else {
				fixedDateArr = Arrays.stream(sc.nextLine().split(" "))
					    .mapToInt(Integer::parseInt)
					    .toArray();
			}
		}
		for(int i = 0; i<returnDateArr.length;i++) {
			if(i==0 && (returnDateArr[i]-fixedDateArr[i])>0) {
				if(returnDateArr[2]==fixedDateArr[2] && returnDateArr[1]==fixedDateArr[1]) {
					output = (returnDateArr[i]-fixedDateArr[i])*15;
				}
			}
			if(i==1 && (returnDateArr[i]-fixedDateArr[i])>0) {
				if(returnDateArr[2]==fixedDateArr[2]) {
					output = (returnDateArr[i]-fixedDateArr[i])*500;
				}
				
			}
			if(i==2 && (returnDateArr[i]-fixedDateArr[i])>0) {
				output = 10000;
			}
		}
		System.out.println(output);
		
	}

}
