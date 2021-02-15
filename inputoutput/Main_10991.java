// import java.io.*;
// import java.lang.StringBuilder;

// public class Main_10991 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());
    
//         for(int i=1; i<n+1; i++){
//             // for(int j=n-i;j>0; j--) {
//             //     sb.append(" ");
//             // }
//             // for(int k = i; k>0; k--) {
//             //     sb.append("*");
//             //     sb.append(" ");
//             // }
//             sb.append(" ".repeat(n-i));//append는 원하는 글자를 반복 할 수도 있다.
//             sb.append("* ".repeat(i));
//             sb.append("\n");

//             System.out.print(sb);
//             sb.setLength(0);
//         }    
//         br.close();
//     }
// }
