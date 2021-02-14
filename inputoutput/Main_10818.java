// import java.io.*;
// import java.util.StringTokenizer;

// public class Main_10818 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int n = Integer.parseInt(st.nextToken());

//         int min = 0;
//         int max = 0;

//         if(n > 1){

//             int[] nArray = new int[n];
//             String strs[] = br.readLine().split(" ");
            
//             for(int i = 0; i<n; i++){
//                 nArray[i] = Integer.parseInt(strs[i]);
//             }

      
            
//             for (int i = 0; i < n; i++) {
               
//                if (i == 0 ) {
//                     if (nArray[i]< nArray[i + 1]) {
//                         max = nArray[i + 1];
//                         min = nArray[i];
//                     } else {
//                         max = nArray[i];
//                         min = nArray[i + 1];
//                     }
//                 } else {
//                     if (nArray[i] < min) {
//                         min = nArray[i];
//                     } else if (nArray[i] > max) {
//                         max = nArray[i];
//                     }
//                 }
//             }

//             bw.write(min + " " + max);

//             br.close();
//             bw.flush();
//             bw.close();
//         }else if (n == 1){
//             min = Integer.parseInt(br.readLine());
//             max = min;
//             System.out.println(min+"\s"+max);
//         }
//     } 
// }

// // \s 공백 에러 나는 경우도 있음. 1인 경우의 반례를 생각해주지 못함.