// import java.io.*;
// import java.lang.StringBuilder;

// public class Main_2442 {
//     public static void main(String[] agrs) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());

//         for(int i = 1; i<n+1;i++){
//             for(int j = n-i; j>0; j--){
//                 sb.append(" ");
//             }
//             for(int k = n; k>n-1-2*(i-1);k--){
//                 sb.append("*");
//             }
//             System.out.println(sb);
//             sb.setLength(0);
//         }
//         br.close();

//     }
// }
