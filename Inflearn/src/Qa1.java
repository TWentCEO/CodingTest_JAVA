import java.util.*;

class Qa1 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }
        // for(int i = 0; i <str.length(); i++){
        //     if(str.charAt(i)==t) answer++;
        // }

        return answer;
    }
    public static void main(String[] args) {
        Qa1 T = new Qa1();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
