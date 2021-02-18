// import java.io.*;
// import java.lang.StringBuilder;

// public class Main_10992 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int n = Integer.parseInt(br.readLine());

//         for (int i = 1; i < n; i++) {
//             sb.append(" ".repeat(n - i)).append("*").append(i>1? " ".repeat(2*(i-1)-1) :"").append(i==1? "":"*").append("\n");//append 사용하면 간단하고 빠르게 풀수 있다.
//         }
//         sb.append("*".repeat(2*n-1)).append("\n");
//         System.out.println(sb);

//         br.close();
//     }
// }
