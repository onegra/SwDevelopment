package star;

public class Ex02 {
	public static void main(String[] args) {
		int size = 5;
		int st =1;
		int sp =size-st*2;
		for (int i = 0; i< size; i++) {
			for(int j = 0; j < st; j++) { 
				System.out.print("* ");
			}
			for(int j = 0; j < sp; j++) {
				
				System.out.print("_ ");
			}
			for(int j = 0; j < st; j++) { 
				System.out.print("* ");
				if (i == size /2 && j ==0)  { //가운데를 줄이고 j반복의 첫번째에서만 
					j += 1 ;                     //j를 한번 더 증가 (j를 2씩 증가)
				}
			}
			
			System.out.println();
			
			
			if (i < size /2 ) {
				st += 1;
				sp -= 2;
			}
			else  { 
				st -= 1;
				sp += 2;
			}
			}
		}
	}


