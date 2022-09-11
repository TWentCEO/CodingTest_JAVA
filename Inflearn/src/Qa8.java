import java.util.Scanner;
  
class Qa8 {
  
  public String solution(String s){
    String answer = "NO";
  	
    s = s.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(s).reverse().toString();
    
    if(s.equals(tmp)) answer = "YES";
    return answer;
  }
  
  public static void main(String[] args){
    Qa8 T = new Qa8();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(T.solution(str));
  }
}