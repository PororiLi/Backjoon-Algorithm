import java.io.*;
import java.util.StringTokenizer;

public class Main_10818 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] n_array = new int[n];
        br.readLine();


        for (int i = 0; i<n; i++) {
            n_array[i] = Integer.parseInt(st.nextToken());//여기가 문제
        }

        int min = 0;
        int max = 0;
        for (int i = 0; i<n; i++) {
            if(i == 0){
                if (n_array[i] < n_array[i + 1]) {
                    max = n_array[i+1];
                    min = n_array[i];
                }else{
                    max = n_array[i];
                    min = n_array[i+1];
                }
            } else {
                if (n_array[i] < min){
                    min = n_array[i];
                } else if(n_array[i] > max){
                    max = n_array[i];
                }
            }
        }

        bw.write(min+" "+max);
        
        br.close();
        bw.flush();
        bw.close();

    }
}
