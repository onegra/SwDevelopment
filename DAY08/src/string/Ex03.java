package string;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "a1B2c3D4e5";
		String s2 =""; 
		String filter = "abcdefgABCDEFG";
				
		for(int i = 0; i< s1.length(); i++) { //전체 글자중에서 
			char ch =s1.charAt(i); //각 글자를 ch라고 할 때
			String s = ch + ""; //contans 함수에는 문자열을 전달해야한다
			if(filter.contains(s) ) { //필터가 글자를 포함하면 (글자가 필터에 포함되면)
				s2 += s; // 결과에 포함시킨다
			}
		}
		System.out.print(s2);
			

	}

}
