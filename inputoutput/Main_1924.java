// import java.io.BufferedReader;
// import java.io.IOException;
// import java.util.Arrays;
// import java.util.StringTokenizer;
// import java.util.stream.IntStream;
// import java.io.InputStreamReader;

// public class Main_1924 {
//     public static int i = 1;
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int m = Integer.parseInt(st.nextToken(" "));
//         int d = Integer.parseInt(st.nextToken(" "));

        
//         int[] thirtyOne = new int[]{1, 3, 5, 7, 8, 10, 12};
//         int[] thirty = new int[]{4, 6, 9, 11};
//         String day[] = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

//         if(m == 1){
//             return;
//         }else{
//             for (i = 1; i < m; i++) {
//                 if (IntStream.of(thirtyOne).anyMatch(x -> x == i)) {// 숫자 특정값이 array 에 있는 지 확인
//                      d += 31;
//                 } else if (IntStream.of(thirty).anyMatch(x -> x == i)) {
//                     d += 30;

//                 } else {
//                     d += 28;
//                 }
//             }
//             System.out.println(day[(d-1) % 7]);
//             return;
//         }
//     }
// }
