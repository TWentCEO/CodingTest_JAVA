import java.util.ArrayList;
import java.util.Scanner;

class Qa2_3 {
    public ArrayList<String> solution(int n, int[]A, int[]B){
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0 ; i < n ; i ++){
            if((A[i] - B[i]) == 1 || (A[i] - B[i])== -2) answer.add("A");
            else if((A[i]-B[i]==-1) || (A[i]-B[i])== 2) answer.add("B");
            else answer.add("D");
        }

        return answer;
    }

    public static void main(String[] args){
        Qa2_3 T = new Qa2_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr1 = new int[n], arr2 = new int[n];

        for (int i = 0 ; i < n; i++){
            arr1[i] = kb.nextInt();
        }
        
        for (int i = 0 ; i < n; i++){
            arr2[i] = kb.nextInt();
        }

        for(String x: T.solution(n, arr1, arr2)){
            System.out.println(x);
        }
    }
}
