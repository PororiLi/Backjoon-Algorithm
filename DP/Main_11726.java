// package DP;

// import java.io.*;

// public class Main_11726 {
//     public static void main (String[] agrs) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());

        
//         // bw.write(topDown(n));
//         // bw.write(bottomUp(n));
//         System.out.println(topDown(n));
//         System.out.println(bottomUp(n));

//         br.close();
//     }
//     //함수는 클래스 안에 선언
//     // bottom up
//     public static int bottomUp(int n) {//은 시간초과..!
//         int dp[] = new int[n+1];
//         dp[0] = 1;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//             dp[i] %= 10007;
//         }

//         return dp[n];
//     }

//     // top down
//     public static int topDown(int n) {//top down이 더 빨랐음.
//         int dp[] = new int[n+1];
//         if(n == 0){
//             dp[0] = 1;
//             return dp[0];
//         }
//         if(n==1){
//             dp[1] = 1;
//             return dp[1];
//         }

//         dp[n] = topDown(n - 2) + topDown(n - 1);
//         dp[n] %= 10007;

//         return dp[n];
//     }
// }

