// package DP;

// import java.io.*;


// public class Main_2133 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());

//         if(n%2 == 0) {
//             int dp[] = new int[n+1];
//             if(n>=2) {
//                 dp[0] = 1;
//                 dp[2] = 3;  
//             }

//             for(int i = 4; i<= n; i += 2) {
//                 dp[i] = dp[2]*dp[i-2];
//                 for(int k = 4; k<=i; k += 2) {
//                     dp[i] += 2*dp[i-k];
//                 }
//             }
//             bw.write(String.valueOf(dp[n]));

//         } else {
//             bw.write(String.valueOf(0));
//         }
//         bw.flush();
//         bw.close();
//         br.close();
//     } 
// }
