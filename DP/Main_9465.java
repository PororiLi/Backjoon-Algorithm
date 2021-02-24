// package DP;

// import java.io.*;
// import java.util.StringTokenizer;
// import java.util.Arrays;
// import java.util.Collections;

// public class Main_9465 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int t = Integer.parseInt(br.readLine());

//         while(t > 0) {
//             int n = Integer.parseInt(br.readLine());
//             int[][] nArray = new int[2][n+1];
//             int[][] cost = new int[2][n+1];
            
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             StringTokenizer st2 = new StringTokenizer(br.readLine());

//             for(int i = 1; i <= n; i++) {
//                 cost[0][i] = Integer.parseInt(st.nextToken(" "));
//                 cost[1][i] = Integer.parseInt(st2.nextToken(" "));
//             }
            
//             nArray[0][1] = cost[0][1];
//             nArray[1][1] = cost[1][1];


//             for(int i = 2; i<=n; i++) {//0번째 인덱스는 없는 셈 치고 1번째부터 다루기. 규칙을 단순화 하기
//                 nArray[0][i] = Math.max(nArray[1][i-1], nArray[1][i-2])+cost[0][i];
//                 nArray[1][i] = Math.max(nArray[0][i-1], nArray[0][i-2])+cost[1][i];
//             }
//             System.out.println(Math.max(nArray[0][n], nArray[1][n]));

//             t--;
//         }
//         br.close();

//     }

// }
