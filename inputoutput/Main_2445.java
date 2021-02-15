// import java.io.*;
// import java.lang.StringBuilder;


// public class Main_2445 {//하는중
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();// sb와 bw는 같이 쓸수 없음.

//         int n = Integer.parseInt(br.readLine());

//         for(int i = 1; i<n+1; i++) {
//             for(int j = 1; j<i+1; j++) {
//                 sb.append("*");
//             }
//             for(int k = n-i; k>0; k--) {
//                 sb.append(" ");
//             }
//             for (int k = n - i; k > 0; k--) {
//                 sb.append(" ");
//             }
//               for(int j = 1; j<i+1; j++) {
//                 sb.append("*");
//             }
//             System.out.println(sb);
//             sb.setLength(0);
            
//         }
//         for (int i = 1; i < n + 1; i++) {
//             for (int j = n-i; j > 0; j--) {
//                 sb.append("*");
//             }
//             for (int k = i; k > 0; k--) {
//                 sb.append(" ");
//             }
//              for (int k = i; k > 0; k--) {
//                 sb.append(" ");
//             }
//             for (int j = n-i; j > 0; j--) {
//                 sb.append("*");
//             }
//             System.out.println(sb);
//             sb.setLength(0);

//         }
//         br.close();

//     }
// }
