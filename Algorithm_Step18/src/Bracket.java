import java.util.Scanner;
import java.util.Stack;
 
public class Bracket {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(check(sc.next()));
		}
		sc.close();
	}
 
	public static String check(String s) {
 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
 
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(c);
			}
			else if (stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		if (stack.empty()) {
			return "YES";
		} 
		else {
			return "NO";
		}
	}
}