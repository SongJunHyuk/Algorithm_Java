import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(n));
	}
 
	static int fibonacci(int n) {
		if (n == 0)	return 0;
		if (n == 1)	return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}