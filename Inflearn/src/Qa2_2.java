import java.util.Scanner;

class Qa2_2 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Qa2_2 T = new Qa2_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));

    }
    
}
