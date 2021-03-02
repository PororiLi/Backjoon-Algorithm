// package binarySearch;

// import java.io.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.StringTokenizer;
// import java.util.Collections;

// public class Main_1654 {
//     public static void main(String[] agrs) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

//         int k = Integer.parseInt(st.nextToken(" "));
//         int n = Integer.parseInt(st.nextToken(" "));


//         // ArrayList<Long> lan = new ArrayList<Long>(); // ArrayList 가 정렬 속도는 더 빠르지만 객체 접근 속도는  Array가 더 빠름
//         long lan[] = new long[k];

//         for(int i= 0; i<k; i++) {
//             // lan.add((long) Integer.parseInt(br.readLine()));
//             lan[i] = Integer.parseInt(br.readLine());
//         }
//         br.close();

//         // Collections.sort(lan);
//         Arrays.sort(lan);

//         long min = 1;
//         long middle = 0;
//         // long max = lan.get(k-1);
//         long max = lan[k-1];

//         while(max >= min) {
//              middle = (min+max)/2;
//              int count = 0;

//              for(int i = 0; i<k; i++) {
//                 // count += lan.get(i)/middle;
//                 count += lan[i] /middle;
//              }

//              if (count < n) {
//                  max = middle - 1;

//              } else if(count >= n) {
//                  min = middle + 1;
//              }          
//         }
//         System.out.println(max);
//     }
// }
