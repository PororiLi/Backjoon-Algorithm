import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2742 {
    // public static void main(String[] args) throws IOException{//BufferedReader는 예외처리 기본
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     int n = Integer.parseInt(st.nextToken());
        
    //     for(int i = 0; i < n; i++){
    //         System.out.println(n-i);
    //     }
    // }

    public static void main(String[] args) {// BufferedReader는 예외처리 기본
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                System.out.println(n - i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
