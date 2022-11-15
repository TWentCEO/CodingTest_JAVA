/*
 * 차세대 영농인 한나는 강원도 고랭지에서 유기농 배추를 재배하기로 하였다.
 * 농약을 쓰지 않고 배추를 재배하려면 배추를 해충으로부터 보호하는 것이 중요하기 때문에,
 * 한나는 해충 방지에 효과적인 배추흰지렁이를 구입하기로 결심한다. 
 * 이 지렁이는 배추근처에 서식하며 해충을 잡아 먹음으로써 배추를 보호한다. 
 * 특히, 어떤 배추에 배추흰지렁이가 한 마리라도 살고 있으면 이 지렁이는 인접한 다른 배추로
 * 이동할 수 있어, 그 배추들 역시 해충으로부터 보호받을 수 있다. 
 * 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우에 서로 인접해있는 것이다.
 * 
 * 한나가 배추를 재배하는 땅은 고르지 못해서 배추를 군데군데 심어 놓았다. 
 * 배추들이 모여있는 곳에는 배추흰지렁이가 한 마리만 있으면 되므로 서로 인접해있는 배추들이
 * 몇 군데에 퍼져있는지 조사하면 총 몇 마리의 지렁이가 필요한지 알 수 있다. 
 * 예를 들어 배추밭이 아래와 같이 구성되어 있으면 최소 5마리의 배추흰지렁이가 필요하다. 
 * 0은 배추가 심어져 있지 않은 땅이고, 1은 배추가 심어져 있는 땅을 나타낸다.
 * 
 */
import java.util.*;
import java.io.*;

public class baekjoon1012 {
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1}; 
    static int[][] map;
    static boolean[][] check;
    static int cnt;
    static int T;
    static int N, M, K;

    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        for(int test_case = 0; test_case < T; test_case++){
            cnt=0;
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            check = new boolean[N][M];
            
            for(int i = 0; i < K; i++){
                st = new StringTokenizer(bf.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(!check[i][j] && map[i][j]==1){
                        cnt++;
                        dfs(i, j);
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y){

        check[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                if(!check[nx][ny] && map[nx][ny]==1){
                    dfs(nx,ny);
                }
            }
        }

    }
}
