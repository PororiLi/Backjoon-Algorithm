// package graph;

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class Main_1260 {//걍 따라 해서 품.
//     static int[][] check;   //간선 연결상태
//     static boolean[] checked;   //확인 여부
//     static int n;   //정점 갯수
//     static int m;   //간선 갯수
//     static int start;   //시작정점
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         n = sc.nextInt();
//         m = sc.nextInt();
//         start = sc.nextInt();

//         check = new int[1001][1001];
//         checked = new boolean[1001];

//         for(int i = 0; i<m; i++) {
//             int x = sc.nextInt();
//             int y = sc.nextInt();

//             check[x][y] = check[y][x] = 1;
//         }
//         dfs(start);

//         checked = new boolean[1001];
//         System.out.println();

//         bfs();

//     }

//     public static void dfs(int i) {
//         checked[i] = true;
//         System.out.print(i + " ");

//         for(int j = 1; j<=n; j++) { //가까운 곳에 위치한 값 부터 확인하고 만약 체크가 안되어있다면 재귀 시켜 체크 반복
//             if(check[i][j] == 1&& checked[j] == false) {
//                 dfs(j);
//             }
//         }
//     }

//     public static void bfs() {
//         Queue<Integer> queue = new LinkedList<Integer>();
//         queue.offer(start);
//         checked[start] = true;
//         System.out.print(start + " ");

//         while(!queue.isEmpty()) {
//             int tmp = queue.poll();

//             for(int j = 1; j<=n; j++) {
//                 if(check[tmp][j] == 1  && checked[j] == false) {
//                     queue.offer(j);
//                     checked[j] = true;
//                     System.out.print(j + " ");
//                 }
//             }
//         }
//     }
// }