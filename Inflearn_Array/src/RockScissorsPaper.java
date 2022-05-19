import java.util.Scanner;
public class RockScissorsPaper {
	public static void main(String[] args) {
		RockScissorsPaper RSP = new RockScissorsPaper();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			b[i] = sc.nextInt();
		}
		for(char x : RSP.solution(N,  a,  b).toCharArray())
			System.out.println(x);
		sc.close();
	}
	
	public String solution(int n, int[] a, int[] b) {
		String answer = "";
		for(int i = 0 ; i< n ; i++) {
			if(a[i] == b[i]) answer += "D";
			else if(a[i] == 1 && b[i] == 3) answer += "A";
			else if(a[i] == 2 && b[i] == 1) answer += "A";
			else if(a[i] == 3 && b[i] == 2) answer += "A";
			else answer += "B";
		}
		return answer;
	}

}
