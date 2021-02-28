package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11724 {
    static int graph[][];
    static int visit[];
    static int n;//정점의 갯수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n+1][n+1];
        visit = new int[n+1];

        for(int i = 1; i<=m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph[x][y] = graph[y][x] = 1;
        }

        int cnt = 0;
        for(int i = 1; i<=n; i++) {
            if(visit[i] == 0){
                bfs(i);
                cnt++;
                // dfs(i, cnt);
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int i , int cnt) {
        visit[i] = cnt;
        for(int j = 1; j<=n; j++) {
            if(graph[i][j] == 1 && visit[j] == 0){
                dfs(j, cnt);
            }
        }
    }
    
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = 1;

        while (!q.isEmpty()) {
            int v = q.poll();

            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && visit[i] == 0) {
                    q.add(i);
                    visit[i] = 1;
                }
            }
        }
    }

}

//참고
// import java.util.Scanner;

// public class Main_11724 {
//     private static int[] visit;
//     private static int[][] graph;
    
//     private static void DFS(int x, int n, int cnt) {
//         visit[x] = cnt;
//         for (int i = 0; i < n; i++) {
//             if (graph[x][i] == 1 && visit[i] == 0) {
//                 DFS(i, n, cnt);
//             }
//         }
//     }
    
//     public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         graph = new int[n+1][n+1];
//         visit = new int[n+1];

//         for (int i = 0; i < m; i++) {
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//             graph[x][y] = graph[y][x] = 1;
//         }
//         int cnt = 0;
//         for (int i = 0; i < n; i++) {
//             if (visit[i] == 0) {
//                 cnt++;
//                 DFS(i, n, cnt);
//             }
//         }
//         System.out.println(cnt);        
//     }
// }
