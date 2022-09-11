import java.util.Scanner;
  
public class Qa10 {
  public int[] solution(String s ,char c){
  	int[] answer = new int[s.length()];
    int p = 1000;

    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == c){
      	p = 0;
        answer[i]=p;
      } else {
        p++;
        answer[i]=p;
      }
    }
    for (int j = s.length()-1; 0 <= j; j--){
      if (s.charAt(j) == c){
      	p = 0;
      }
      else{
        p++;
        answer[j] = Math.min(answer[j], p);
      }
    }
    return answer;
  }
  
  public static void main(String[] args){
    Qa10 T = new Qa10();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    for(int x: T.solution(str,c)){
    	System.out.print(x+" ");
    }
    return ;
  }
}