// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.util.StringTokenizer;

// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;

// public class Main_8393 {
//     public static void main(String[] agrs){
//         try {
//             // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             // StringTokenizer st = new StringTokenizer(br.readLine());
//             // int n = Integer.parseInt(st.nextToken());
//             // int sum = 0;

//             // for (int i = 1; i<n+1; i++) {
//             //     sum += i;
//             // }
//             // System.out.println(sum);

//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             int n = Integer.parseInt(st.nextToken());
//             int sum = 0;

//             for (int i = 1; i<n+1; i++) {
//             sum += i;
//             }
//             bw.write(String.valueOf(sum));

//             br.close();
//             bw.flush();
//             bw.close();

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
