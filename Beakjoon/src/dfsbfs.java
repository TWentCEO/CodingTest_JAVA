import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfsbfs {
    static int[][] graph;
    static int[] visited;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int v){
        visited[v] = 1;
        sb.append(v+ " ");
        for(int i = 1; i <= N; i++){
            if(visited[i]==0 && graph[v][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<Integer>();
        visited[v] = 1;
        q.offer(v);
        while(!q.isEmpty()){
            int dot = q.poll();
            sb.append(Integer.toString(dot)+ " ");
            for(int i = 1; i <= N; i++){
                if(visited[i]==0 && graph[dot][i]==1){
                    q.offer(i);
                    visited[i] = 1;
                }
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new int[N+1][N+1];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        visited = new int[N+1];
        dfs(v);
        System.out.println(sb);
        sb = new StringBuilder();
        visited = new int[N+1];
        bfs(v);
    }
}
