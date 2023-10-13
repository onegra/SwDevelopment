package operator;

public class Ex10 {
/*
 연산자 우선 순위
 --------------------------------------------------------
 최우선 연산자       .      []          ()
                  점      배열인덱스    연산 우선 처리 괄호
                  .의 역할 : 객체 내부 속성 및 기능에 접근하는 연산자 (~의)
                  
단항 연산자         !, ~, +/-(부호반전),  ++/--(전치), (cast 자료형), instanceof
산술 연산자         +, -, *, /, %
shift 연산자       <<, >>, >>>
비교 연산자         >, <, >=, <=, ==, !=
비트 연산          &, |, ^(xor)        
논리 연산          &&, ||
삼항 연산          A ? B : C
복합 대입 연산      =, +=, -=, *=, /=, %=, <<=, >>=
증감 후위 연산      ++/--
순차 연산자        , (콤마. 여러 값을 나열할 때 사용하는 기호)
 */
	public static void main(String[] args) {
		int num = 10;
		System.out.println(-num);
	}
}
