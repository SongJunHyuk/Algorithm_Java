import java.util.*;

public class Croatia_Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String input = sc.nextLine();
		for (int i = 0; i < str.length; i++) {
			if(input.contains(str[i]))
				input = input.replace(str[i], "!");
		}
		System.out.println(input.length());
	}
}