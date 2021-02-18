package DP;

import java.io.*;
import java.util.StringTokenizer;


public class Main_9095 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(sb.nextToken("\n"));

        while(count>0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(topDown(n));
            System.out.println(bottomUp(n));
            count --;

        }
        br.close();
    }

    public static int topDown(int n) {
        int dp[] = new int[n+1];
        if(n==0){
            dp[n] = 1;
            return dp[n];
        }
        if(n==1) {
            dp[n] = 1;
            return dp[n];
        }
        if(n==2) {
            dp[n] = 2;
            return dp[n];
        }
        dp[n] = topDown(n-1)+topDown(n-2)+topDown(n-3);
        return dp[n];
    }

    public static int bottomUp(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<= n; i++) {
            System.out.println("!");
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        
        }
        return dp[n];
    }
}
