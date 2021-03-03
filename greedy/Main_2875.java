// package greedy;

// // import java.io.*;
// // import java.util.Scanner;

// // public class Main_2875 {
// //     public static void main(String[] agrs) throws IOException {
// //         Scanner sc = new Scanner(System.in);
// //         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// //         int girl = sc.nextInt();
// //         int boy = sc.nextInt();
// //         int intern = sc.nextInt();

// //         for(int i = girl/2; i>0; i--) {
// //             if(intern <= (girl+boy)-(2*i+i) && boy >= i) {
// //                 bw.write(String.valueOf(i));
// //                 bw.flush();
// //                 bw.close();
// //                 return;
// //             }
// //         }
// //         bw.write(String.valueOf(0));
// //         bw.flush();
// //         bw.close();
// //     }
// // }

// import java.util.*;

// public class Main_2875 {    //다른분꺼
    
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int k = sc.nextInt();

//         int team = 0;
//         if (n + m > k) {
//             team = n / 2 < m ? n / 2 : m;
//             k -= (n + m) - team * 3; // rest 제외
//             if (k > 0) team -= (k + 2) / 3;
//         }
//         System.out.println(team);
//     }
// }
