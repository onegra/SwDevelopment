package reference;

public class Ex08 {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "banana";
		String s3 = "aegis";
		String s4 = "banan";
		System.out.println((int)'n');
		
		System.out.println("s1.compoareTo(s2) : " + s1.compareTo(s2));
		System.out.println("s1.compoareTo(s3) : " + s1.compareTo(s3));
		System.out.println("s2.compoareTo(s3) : " + s2.compareTo(s3));
		System.out.println("s2.compoareTo(s4) : " + s2.compareTo(s4));
		System.out.println();
		
		System.out.println("myCompareTo(s1, s2) : " + myCompareTo(s1,s2));
		System.out.println("myCompareTo(s1, s3) : " + myCompareTo(s1,s3));
		System.out.println("myCompareTo(s2, s3) : " + myCompareTo(s2,s3));
		System.out.println("myCompareTo(s2, s4) : " + myCompareTo(s2, s4));
	}
	static int myCompareTo(String s1, String s2) {
		int answer = 0;
		
		int size = s1.length() > s2.length() ? s2.length() : s1.length();
		
		for(int i = 0; i < size; i++) { //정해진 길이만큼 반복하면서
			char a = s1.charAt(i); //s1의 i번째 글자
			char b = s2.charAt(i); //s2의 i번째 글자
			if(a != b) {            // 두 글자가 서로 다르다면
				answer = a-b;      //두 글자의 차이를 저장한다
				break;             //차이를 찾았다면 반복중단
			}
		}
		//반복문이 끝났음에도 불구하고 차이를 발견하지 못했으면서 문자열의 길이가 다르다면
		if(answer == 0 && s1.length() != s2.length()) {
			answer = s1.length() - s2.length(); //길이의 차이를 저장한다
		}
		return answer;
	}

}
