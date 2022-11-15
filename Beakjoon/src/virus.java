import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class virus {
    
    static int[][] graph;
    static int[] visited;
    static int N;
    static int result = 0;

    public static void dfs(int v){
        visited[v] = 1;
        for(int i = 1; i <= N; i++){
            if(visited[i] == 0 && graph[v][i] == 1){
                result++;
                dfs(i);
                visited[i] = 1;
            }
        }
    }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        visited = new int[N+1];
        dfs(1);
        System.out.print(result);
    }
}
