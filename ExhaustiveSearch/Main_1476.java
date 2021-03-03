// package ExhaustiveSearch;

// import java.util.Scanner;

// public class Main_1476 {
//     public static void main(String[] agrs) {    //완전 탐색은 걍 브루투 포싱이라 생각하기 다 때려 맞춰 해보는 탐색
//         Scanner sc = new Scanner(System.in);

//         int e = sc.nextInt();
//         int s = sc.nextInt();
//         int m = sc.nextInt();

//         int cE = 1;
//         int cS = 1;
//         int cM = 1;
//         int cnt = 1;
//         while(cE != e || cS != s || cM != m) {
//             cnt++;
//             cE++;
//             if(cE > 15) {
//                 cE = 1;
//             }
//             cS++;
//             if(cS > 28) {
//                 cS = 1;
//             }
//             cM++;
//             if(cM > 19) {
//                 cM = 1;
//             }
//         }
//         System.out.println(cnt);
//     }
// }