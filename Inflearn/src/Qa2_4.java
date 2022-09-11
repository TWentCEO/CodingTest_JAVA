import java.util.ArrayList;
import java.util.Scanner;

class Qa2_4 {

    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        answer.add(1);
        answer.add(1);
        for (int i = 0 ; i < n-2 ; i++){
            sum = answer.get(i) + answer.get(i+1);
            answer.add(sum);
        }
        
        return answer;
    }

    public static void main(String[] args){
        Qa2_4 T = new Qa2_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
