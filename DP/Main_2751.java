package DP;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main_2751 {//시간초과
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> nList = new ArrayList<>();

        while(n>0) {
            nList.add(Integer.parseInt(br.readLine()));
            n--;
        }
        
        Collections.sort(nList);
        for(int i = 0; i<nList.size(); i++) {
            bw.write(String.valueOf(nList.get(i))+"\n");
            bw.write(nList.get(i));

        }
        bw.flush();
        bw.close();
        br.close();
    }
}