import java.util.*;

class Qa4 {
    public ArrayList<String> solusion(int n,String[] str){
        ArrayList<String> answer = new ArrayList<>();

        // 리버스 사용
        // for(String x : str){
        //     String tmp = new StringBuilder(x).reverse().toString();
        //     answer.add(tmp);
        // }

        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Qa4 T = new Qa4();
        Scanner kb = new Scanner(System.in);
        int idx = kb.nextInt();
        String[] str = new String[idx];
        for(int i=0; i<idx; i++){
            str[i] = kb.next();
        }
        for(String x : T.solusion(idx, str)){
            System.out.println(x);
        }
    }
    
}
