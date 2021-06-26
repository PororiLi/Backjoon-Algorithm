import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String numberStr[] = new String[numbers.length];
        
        for(int i = 0; i<numbers.length; i++) {
            numberStr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(numberStr, new Comparator<String>() { 
            @Override public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2); 
            }
        });

        
        for(String numStr : numberStr) {
            answer += numStr;
        }
        return answer;
    }
}