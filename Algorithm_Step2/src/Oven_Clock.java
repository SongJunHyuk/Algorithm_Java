import java.util.*;

public class Oven_Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int Time = sc.nextInt();
		
		H += (Time / 60);
		M += (Time % 60);
		
		if (M >= 60)
		{
			H += 1;
			M -= 60;
		}
		if (H >= 24)
		{
			H -= 24;
		}
		
		System.out.println(H + " " + M);
	}
}