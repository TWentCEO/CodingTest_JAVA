import java.util.Scanner;
  
class Qa9 {
  
  public int solution(String s){
    int answer = 0;	
  	for(char x : s.toCharArray()){
    	if(x>=48 && x<=57) answer = answer * 10 + (x-48);
    }
    return answer;
  }
  
  public static void main(String[] args){
    Qa9 T = new Qa9();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}