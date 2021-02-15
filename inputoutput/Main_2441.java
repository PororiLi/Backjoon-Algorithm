// import java.io.*;
// import java.lang.StringBuilder;

// public class Main_2441 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());

//         for(int i = n; i>0 ; i--) {
//             for (int j = n - i; j > 0; j--) {
//                 sb.append(" ");
//             }
//             for(int k = i; k>0; k--){
//                 sb.append("*");
//             }
//             System.out.println(sb);
//             sb.setLength(0);//append 원하는 것을 출력한 이후에는 비워주기
//         }
//         br.close();
//     }
// }
