import java.util.Scanner;

class Qa11{

    public String solution(String str){
        String answer = "";
        str = str+" ";
        int cnt = 1;
        for(int i=0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt += 1;
            }else{
                answer += str.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Qa11 T = new Qa11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
