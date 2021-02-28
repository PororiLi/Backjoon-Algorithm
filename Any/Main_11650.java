// package Any;

// import java.io.*;
// import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Collections;
// import java.util.Comparator;


// public class Main_11650 {
//     public static void main(String[]  agrs) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//         int n = sc.nextInt();
//         ArrayList<Point> pList = new ArrayList<>();

//         while(n > 0) {
//             pList.add(new Point(sc.nextInt(), sc.nextInt()));
//             n--;
//         }
//         sc.close();

//         Collections.sort(pList, new Comparator<Point>() {//사용자 정의 타입을 정렬하기 위해 comparator를 재정의
//             @Override
//             public int compare(Point o1, Point o2) {
//                 if (o1.x < o2.x) {
//                     return -1;//작으면 음수를 리턴
//                 } else if (o1.x > o2.x) {
//                     return 1;//크면 양수 리턴                    
//                 } else if (o1.x == o2.x) {
//                     if (o1.y > o2.y) {
//                         return 1;
//                     } else {
//                         return -1;
//                     }
//                 }
//                 return 0;//같으면 0
//             }

//         });

//         for(int i = 0; i<pList.size(); i++) {
//             bw.write(pList.get(i).x+" "+pList.get(i).y+"\n");
//         }
//         bw.flush();
//         bw.close();
//     }
// }

// class Point {
//     int x;
//     int y;
//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
//     public int getX() {
//         return this.x;
//     }
//     public int getY() {
//         return this.y;
//     }
// }
