import java.util.Scanner;

public class Pro81301 {
    public static void main(String[] args) {
        Pro81301 T = new Pro81301();
        Scanner kb =  new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));

    }

    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }
}
