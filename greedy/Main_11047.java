// package greedy;

// import java.io.*;
// import java.util.Arrays;

// public class Main_11047 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         String[] condition = br.readLine().split(" ");

//         int coin = Integer.parseInt(condition[0]);
//         int k = Integer.parseInt(condition[1]);

//         int cValue[] = new int[coin];
//         for(int i =0; i<coin; i++) {
//             cValue[i] = Integer.parseInt(br.readLine());
//         }
//         Arrays.sort(cValue);
      

//         int amount = 0;
//         while(amount<k) {
//             for(int i = coin-1; i>=0; i--) {    //루프 조건 잘보기
//                 if(cValue[i] <= k) {
//                     amount += k/cValue[i];
//                     k = k%cValue[i];
//                 }
//             }
//         }

//         bw.write(String.valueOf(amount));
//         bw.flush();
//         bw.close();
//         br.close();
//     }
// }
