// package DP;

// import java.io.*;

// public class Main_11057 { 
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));///br로 입력받은 수를 Integer 변환 할때 100이상의 수를 받으니 값이 이상해짐.. 왜..?

 
//         int n = Integer.parseInt(br.readLine());

//         System.out.println(n);

//         int dp[][] = new int[n + 1][10];
//         int sum = 0;

//         for (int i = 0; i <= 9; i++) {
//             dp[1][i] = 1;
//         }

//         // 오르막 갯수
//         for (int i = 2; i <= n; i++) {
//             for (int k = 0; k <= 9; k++) {
//                 for (int j = 0; j <= k; j++) {
//                     dp[i][k] += dp[i - 1][j];
//                 }
//             }
//         }
//         // 합 해야 ㄹㅇ 갯수 나옴
//         for (int i = 0; i <= 9; i++) {
//             sum += dp[n][i];
//         }

//         System.out.println(sum%10007);
//         br.close();
//     }

//     public static int bottomUp(int n) {
//         int dp[][] = new int[n+1][10];
//         int sum = 0;
     
//         for(int i = 0; i<=9; i++){
//             dp[1][i] = 1;
//         }
        
//         //오르막 갯수
//         for(int i = 2; i<=n; i++) {
//             for(int k =0; k<=9;k++){
//                 for (int j = 0; j <= k; j++) {
//                     dp[i][k] += dp[i - 1][j];
//                 }
//                 dp[i][k] %= 10007;
//             }
//         }
//         //합 해야 ㄹㅇ 갯수 나옴
//         for(int i=0; i<=9; i++) {
//            sum += dp[n][i];
//         }
        
//         return sum%10007;
//     }
// }
// // package DP;

// // import java.util.*;
// // import java.math.*;
// // public class Main_11057 {
	
// // 	static int dp[][] ;
	
// // 	public static void main(String[] args)   {
// // 		Scanner sc = new Scanner(System.in);
		
// // 		int n= sc.nextInt();
		
// // 		dp = new int [n+1][10]; 
		
// //         // 초기값은 n이 1일 경우 모두 1로 초기화 한다.
// // 		dp[1][0] = dp[1][1] =dp[1][2] = dp[1][3] =dp[1][4] = dp[1][5] =dp[1][6] = dp[1][7] =dp[1][8] = dp[1][9] =1;
		
// // 		for(int i=2;i<=n;i++) { //  2부터 n까지 반복
// // 			for(int j=0;j<10;j++) { // 0 ~ 9를 탐색하는데,
// // 				for(int k=0;k<=j;k++) { // j를 기준으로 0부터 j까지 탐색
// // 					dp[i][j] += dp[i-1][k]; // k로 탐색한 값을 j에 누적 
// // 				}
// // 				dp[i][j] %= 10007; // 데이터 타입 범위를 위해 나머지 연산 후 저장한다.
// // 			}
			
// // 		}
		
// // 		int sum = 0;
// // 		for(int i=0;i<10;i++) { // n번 째 행의 경우들을 모두 더한다.
// // 			sum+=dp[n][i]; // 더하는 과정에서 값이 또 커질 수 있으므로
// // 		}
		
// // 		System.out.println(sum % 10007); // 더한 값 역시 나머지 연산을 수행한다.
		
		
		
		
// // 	}
	
// // }