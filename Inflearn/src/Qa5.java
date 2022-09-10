import java.util.*;

class Qa5 {
    public String solusion(String str){
        String answer = "";
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;   
    }

    public static void main(String[] args){
        Qa5 T = new Qa5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solusion(str));
    }
    
}
