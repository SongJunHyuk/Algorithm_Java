import java.util.*;
public class ShortestDistance {

	public int[] solution (String s, char t) {
		int [] answer = new int[s.length()];
		int p = 1000;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		p= 1000;
		for(int i = s.length()-1; i>= 0 ; i--) {
			if(s.charAt(i) == t) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		ShortestDistance SD = new ShortestDistance();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int x : SD.solution(str, c)) {
			System.out.print(x + " ");
		}
		sc.close();
	}

}