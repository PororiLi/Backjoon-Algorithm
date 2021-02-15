// import java.io.*;
// import java.lang.StringBuilder;


// public class Main_2446 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());
        
//         for(int i = 1; i<n+1; i++) {
//             for(int k = i-1; k>0; k--) {
//                 sb.append(" ");
//             }
//             for(int j = 2*(n-i)+1; j >0; j--) {
//                 sb.append("*");
//             }
//             System.out.println(sb);
//             sb.setLength(0);
//         }
//         for(int i = 1; i<n;i++){
//             for (int k = n-i; k > 1; k--) {
//                 sb.append(" ");
//             }
//             for (int j = 1; j < 2 * (i+1); j++) {
//                 sb.append("*");
//             }           
//             System.out.println(sb);
//             sb.setLength(0);
//         }
//         br.close();
//     }
// }//내풀이

// // import java.io.*;

// // class Main {//3항 방정식 이용해서 푼 사람.
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         int N = Integer.parseInt(br.readLine());
// //         int M = N * 2 - 1;

// //         int i;
// //         StringBuilder sb = new StringBuilder();
// //         for (i = 0; i < M; ++i)
// //             sb.append(" ".repeat(i < N ? i : M - i - 1)).append("*".repeat(i < N ? M - (i * 2) : (i * 2) + 2 - M))
// //                     .append("\n");

// //         System.out.print(sb);
// //         br.close();
// //     }
// // }
