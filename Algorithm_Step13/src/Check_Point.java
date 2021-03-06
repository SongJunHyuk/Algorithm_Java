import java.util.Scanner;
import java.util.Arrays;
 
public class Check_Point {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		
		int[] arr = new int[N];	
        
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
        
		Arrays.sort(arr);
 
		int gcdVal = arr[1] - arr[0];
 
		for(int i = 2; i < N; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
 
		for(int i = 2; i <= gcdVal; i++) {
	    
			if(gcdVal % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();		
	}
	
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
 
}