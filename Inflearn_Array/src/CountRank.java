import java.util.*;
class CountRank {	
	public int[] solution(int n, int[] arr){
		int[] answer = new int[n];
		for(int i=0; i<n; i++){
			int cnt=1;
			for(int j=0; j<arr.length; j++){
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i]=cnt;
		}
		return answer;
	}
	public static void main(String[] args){
		CountRank CR = new CountRank();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		for(int x :CR.solution(n, arr)) System.out.print(x+" ");
		sc.close();;
	}
}