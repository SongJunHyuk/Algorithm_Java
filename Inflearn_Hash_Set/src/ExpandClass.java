import java.util.*;
class ExpandClass {	
	public char solution(int n, String s){
		char answer=' ';
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x : s.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1); 
		}
		//System.out.println(map.containsKey('F'));
		//System.out.println(map.size());
		//System.out.println(map.remove('C'));
		
		int max=Integer.MIN_VALUE;
		for(char key : map.keySet()){
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max){
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		ExpandClass T = new ExpandClass();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		System.out.println(T.solution(n, str));
		sc.close();
	}
}