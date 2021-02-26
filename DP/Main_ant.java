// package DP;

// import java.io.*;
// import java.util.StringTokenizer;


// public class Main_ant {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//         int n = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int kArray[] = new int[n+1];

//         for(int i = 1; i<=n; i++) {
//             kArray[i] = Integer.parseInt(st.nextToken(" "));
//         }
//         kArray[0] = 0;

//         for(int i = 2; i<n+1; i++) {
//             kArray[i] += kArray[i-2];
//         }
//         System.out.println(Math.max(kArray[n], kArray[n - 1]));
//     }
// }
