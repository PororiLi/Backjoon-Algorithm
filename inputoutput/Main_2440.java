// import java.io.*;
// import java.lang.StringBuilder;


// public class Main_2440 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();

//         //출력 값이 많은 문자열을 다룰때에는 메모리에 새로 생성 되는 것이 아니라 값을 append 하는 stringBuilder나 StringBuffer 사용하기.
//        int n = Integer.parseInt(br.readLine());

//        for(int i = 0; i<n; i++){
//            for(int j = n-i; j>0; j--){
//                sb.append("*");
//         }
//            System.out.println(sb);
//            sb.setLength(0);
//        }
//        br.close();
//    } 
// }  

// // import java.io.*;

// // public class Main {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// //         int n = Integer.parseInt(br.readLine());

// //         for (int i = 0; i < n; i++) {
// //             for (int j = n - i; j > 0; j--) {
// //                 bw.write("*");
// //             }
// //             bw.write("\n");
// //         }
// //         bw.close();
// //         br.close();
// //     }
// // }
