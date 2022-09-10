import java.util.Scanner;

import java.util.*;

class Qa3{
    public String solusion(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;
        
        String[] s = str.split(" ");

        for(String x : s){
            int len = x.length();
            if (max < len){
                max = len;
                answer = x;
            }     
        }
        return answer;
    }

    public static void main(String[] args){
        Qa3 T = new Qa3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solusion(str));
    }
}