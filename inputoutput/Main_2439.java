// import java.io.*;

// public class Main_2439 {
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = Integer.parseInt(br.readLine());

//         for(int i = 1; i<n+1; i++){
//             int j = n - i;  
//             while(j > 0){
//                    bw.write(" ");
//                    j--;
//             }
//             for(j = 1; j<i+1; j++){
//                 bw.write("*");
//             }
//             bw.write("\n");
//         }

//         br.close();
//         bw.flush();
//         bw.close();
//     }
// }
