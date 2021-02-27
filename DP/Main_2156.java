// package DP;

// import java.io.*;


// public class Main_2156 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());
//         int amount[] = new int[n+1];
//         long dp[] = new long[n+1];

//         amount[0] = 0;

//         for(int i = 1; i<n+1; i++) {
//             amount[i] = Integer.parseInt(br.readLine());
//         }

//         dp[0] = 0;
//         dp[1] = amount[1];
//         if(n>1) {
//             dp[2] = amount[1] + amount[2];

//         }

//         for(int i = 3; i<n+1; i++) {
//             dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]+amount[i], dp[i-3]+amount[i-1]+amount[i]));
//         }
//         bw.write(String.valueOf(dp[n]));

//         bw.flush();
//         bw.close();
//         br.close();
//     }
// }
