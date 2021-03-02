// package binarySearch;

// import java.io.*;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.StringTokenizer;
// import java.util.Collections;

// public class Main_2805 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st1 = new StringTokenizer(br.readLine());

//         int n = Integer.parseInt(st1.nextToken(" "));
//         int m = Integer.parseInt(st1.nextToken(" "));

//         StringTokenizer st2 = new StringTokenizer(br.readLine());
//         // ArrayList<Long> tree = new ArrayList<Long>();//  느리다.. 겁나 큰 갯수를 정렬하는거 아니면 쓰지 말자..
//         long[] tree = new long[n];
        
//         for(int i = 0; i<n; i++) {
//             // tree.add((long)Integer.parseInt(st2.nextToken(" ")));
//             tree[i] = Integer.parseInt(st2.nextToken(" "));
//         }
//         // Collections.sort(tree);
//         Arrays.sort(tree);
//         br.close();

//         long min = 0;
//         // long max = tree.get(n-1);
//         long max = tree[n-1];
//         long middle = 0;

//         while(max >= min) {
//             middle = (min+max)/2;
//             long allHeight = 0;

//             for(int i = 0; i<n; i++) {
//                 // allHeight += (tree.get(i) > middle? tree.get(i) - middle : 0);
//                 allHeight += (tree[i] > middle ? tree[i] - middle : 0);

//             }
//             if(allHeight >= m) {
//                 min = middle+1;
//             }
//             else if (allHeight < m) {
//                 max = middle -1 ;
//             }

//         }
//         System.out.println(max);
//     }
// }


////시간초과때문에 겁나 힘들었음. 결론 if 너무 많이 사용하지 말기. arrays가 정렬 이외의 속도면에서는 훨 나음.
////이분탐색 min = middle -1, max = middle -1 로 해줘서 탐색하기.