// package DP;
//not solved
// import java.io.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.StringTokenizer;


// public class Main_11053 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(br.readLine());
//         ArrayList<Integer> aList = new ArrayList<>();
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int count[] = new int[n];

//         while(n > 0) {
//             aList.add(Integer.parseInt(st.nextToken(" ")));
//             n--;
//         }

//         Collections.sort(aList);
     

//         count[0] = aList.get(0);
        
//         for(int i = 1; i < n; i++) {
//             if(aList.get(i) > count[i-1]) {
//                 count[i] = aList.get(i);
//             }
//         }
//         System.out.println(count.length);
//     }
// }
