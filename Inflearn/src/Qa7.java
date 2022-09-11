import java.util.Scanner;
  
class Qa7 {
  public String solution(String str){
  	String answer = "YES";
    str = str.toUpperCase();
    int len = str.length();
    for (int i = 0; i<len/2; i++){
    	if(str.charAt(i) != str.charAt(len-1-i)) return "NO";
    }
    return answer;
  }
  public static void main(String[] args){
    Qa7 T = new Qa7();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));
  }
}