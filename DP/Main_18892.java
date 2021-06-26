import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_18892 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input_nk[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input_nk[0];
        int k = input_nk[1];
        int input_a[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(input_a[0]);

        String lis_mem[][] = new String[n][n];
        
        for(int i=n-1; i>=0; i--) {
            ArrayList<String> is_mem  = new ArrayList<String>();
            int lis_length = 0;
            for(int j=i+1; j<n; j++) {
                int lis_len_of_j = lis_mem[j][0].split(" ").length;
                if(input_a[i] < input_a[j] && lis_length <= lis_len_of_j + 1) {
                    if(lis_length < lis_len_of_j + 1) {
                        is_mem.clear();
                        lis_length = lis_len_of_j + 1;
                    }
                    for(String lis : lis_mem[j]) {
                        if(lis == null) {
                            break;
                        }
                        is_mem.add(Integer.toString(input_a[i]) + " " + lis);
                        System.out.println(is_mem);
                    }

                }
            }

            if(is_mem.isEmpty()) {
                lis_mem[i][0] = Integer.toString(input_a[i]) + " ";;
                System.out.println("is_mem size: 0, " + Integer.toString(input_a[i]));
            }
            else {
                int lis_mem_i = 0;
                System.out.println("is_mem size:" + is_mem.size());
                for(String lis : is_mem){
                    lis_mem[i][lis_mem_i++] = lis;
                }
            }
        }
        int lis_length = 0;
        ArrayList<String> total_lis = new ArrayList<String>();
        int i = 0;
        for(String[] lis_i : lis_mem) {
            for(String lis_j : lis_i) {
                if(lis_j == null) {
                    break;
                }
                System.out.print(lis_j);
                if(lis_length <= lis_j.split(" ").length) {
                    total_lis.add(lis_j);
                    // System.out.println("total_lis" + total_lis[i]);
                    i++;
                    lis_length = lis_j.split(" ").length;
                }
            }
            System.out.println();
        }

        // String temp_total[] = total_lis;
        // int in = temp_total.length-1;
        // System.out.println(in);
        // i = 0;
        // for(String temp : temp_total) {
        //     if(in>0 && temp != null) {
        //         total_lis[in]  = temp;
        //         in--;
        //     }
        //     System.out.println("total_lis reArrange : " + total_lis[i++]);

        // }
        System.out.println("total_lis.length-k : "+ (total_lis.size()-k));
        if(k <= total_lis.size()) {
            System.out.println(total_lis.get(total_lis.size()-k).substring(0,5));
        } else {
            System.out.println("-1");
        }
    }
}
