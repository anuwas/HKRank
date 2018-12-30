package nestedlogic;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] fixedDateArr = new int[3];
		int[] returnDateArr = new int[3];
		int T =2;
		while(T-->0) {
			String input = sc.nextLine();
			if(T==1) {				
				returnDateArr = Arrays.stream(sc.nextLine().split(" "))
					    .mapToInt(Integer::parseInt)
					    .toArray();
				for(int i=0;i<returnDateArr.length;i++) {
					System.out.println(returnDateArr[i]);
				}
				
			}else {
				fixedDateArr = Arrays.stream(sc.nextLine().split(" "))
					    .mapToInt(Integer::parseInt)
					    .toArray();
			}
		}
		
		
	}

}
