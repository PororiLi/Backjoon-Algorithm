// import java.util.Scanner;
// /**
//  * 숫자가 너무 길고 한줄씩 무조건 일때는 string으로 받아 짤라서 처리하기
//  */

// public class Main_11720 {
//     public static void main(String[] args) {
//         int n;
//         String num;

//         int sum = 0;

//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         sc.nextLine();
//         num = sc.next();
//         String[] num_ar = num.split("");

//         while(n != 0){
//             sum += Integer.parseInt(num_ar[n-1]);
//             n--;
//         }
//         System.out.println(sum);        

//     }
// }
