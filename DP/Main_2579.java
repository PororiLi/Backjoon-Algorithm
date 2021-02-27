// package DP;

// import java.io.*;


// public class Main_2579 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());
//         int grade[] = new int[n+1];
//         int dp[] = new int[n+1];

//         for(int i = 1; i<n+1; i++) {
//             grade[i] = Integer.parseInt(br.readLine());
//         }
//         //bottomUp
//         dp[0] = 0;
//         dp[1] = grade[1];
//         if(n>1){
//             dp[2] = grade[1] + grade[2];
//         }

//         for(int i = 3; i<n+1; i++) {
//             dp[i] = Math.max(dp[i-2]+grade[i], dp[i-3]+grade[i-1]+grade[i]);
//         }
//         bw.write(String.valueOf(dp[n]));
//         bw.flush();

//         br.close();
//         bw.close();

//     }

// }
