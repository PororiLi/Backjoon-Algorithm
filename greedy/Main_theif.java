import java.util.ArrayList;

/*https://programmers.co.kr/learn/courses/30/lessons/42862
*  프로그래머스 그리디> 체육복 
*/

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;
        ArrayList<String> re_list = new ArrayList<String>();
        
        for(int re : reserve) {
            re_list.add(Integer.toString(re));
            for(int lo : lost) {
                if(answer < n) {
                    if(re_list.contains(Integer.toString(lo))) {
                        answer++;
                        re_list.remove(Integer.toString(lo));
                    } else if(re_list.contains(Integer.toString(lo+1))) {
                        answer++;
                        re_list.remove(Integer.toString(lo+1));
                    } else if(re_list.contains(Integer.toString(lo-1))) {
                        answer++;
                        re_list.remove(Integer.toString(lo-1));
                    }
                }
            
            } 
        }
        
        return answer;
    }
}