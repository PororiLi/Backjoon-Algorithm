package DP;

import java.io.*;


public class Main_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(bottomUp(n)));
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static long topDown(int n) {//메모리 초과
        long[] pArray = new long[n+1];
        
        if(n == 0) {
           return pArray[0] = 0;
        }
        if(n == 1) {
            return pArray[1] = 1;
        }

        pArray[n] = topDown(n-1)+topDown(n-2);
        return pArray[n];
    }

    public static long bottomUp(int n) {//long으로 해야 함 왜냐하면 2진수의 경우를 구하는 것이기때문에 길이가 매우 김.
        if(n == 0) {
            return 0;
        }
        long[][] pArray = new long[n+1][2];
        pArray[1][0] = 0;
        pArray[1][1] = 1;

        for(int i = 2; i<=n; i++) {
            pArray[i][0] = pArray[i-1][0]+pArray[i-1][1];
            pArray[i][1] = pArray[i-1][0];
        }
        return pArray[n][0]+pArray[n][1];
    }
}
