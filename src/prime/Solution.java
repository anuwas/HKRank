package prime;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<String> numbers = new ArrayList<>();
        while (T-- > 0) {
            int ele = sc.nextInt();
            int j = 0;
            if(ele==1){
                numbers.add("Not prime");
            }else{
                for (int i = 2; i <= Math.sqrt(ele); i++) {
                    if (ele % i == 0) {
                        j += 1;
                        numbers.add("Not prime");
                        break;
                    }
                }
                if (j == 0) {
                    numbers.add("Prime");
                }
            }

        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
