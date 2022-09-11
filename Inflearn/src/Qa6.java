import java.util.Scanner;
  
class Qa6 {
  public String solution(String str){
    String answer = "";
    for(int i = 0; i < str.length(); i++){
      if (str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
    }
    return answer;
  }
  public static void main(String[] args){
    Qa6 T = new Qa6();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
  }
}