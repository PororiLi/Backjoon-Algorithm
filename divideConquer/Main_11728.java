package divideConquer;

import java.io.*;
import java.util.*;

public class Main_11728 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int sizeA = sc.nextInt();
        int sizeB = sc.nextInt();
        // int[] arrAB = new int[sizeA+sizeB]; //얘가 더 빠름.
        ArrayList<Integer> abList = new ArrayList<Integer>();
        
        for(int i = 0; i<sizeA+sizeB; i++) {
            // arrAB[i] = sc.nextInt();
            abList.add(i, sc.nextInt());
        }
        // Arrays.sort(arrAB);
        Collections.sort(abList);
        for(int i = 0; i<sizeA+sizeB; i++) {
            // sb.append(arrAB[i]).append(" ");
            sb.append(abList.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
