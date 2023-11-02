package reference;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.printf("%s : %d살, ",name,age);
	}
}
public class Quiz01 {
	
	public static void main(String[] args) {
		Member[] arr = new Member[] {
			new Member("원빈",45),
			new Member("현빈",41),
			new Member("우빈",34),
			new Member("준빈",31),
			new Member("다빈",29),
		};
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}System.out.println();
		
		//이름을 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하기
		//비교는 객체의 이름을 기준으로 하고, 자리변경은 객체를 교환한다
		sortMemberArratByName(arr);
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}System.out.println();
		//나이를 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하기
		//비교는 객체의 나이를 기준으로 하고, 자리변경은 객체를 교환한다
		sortMemberArratByAge(arr);
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}System.out.println();
	
	}
	static void sortMemberArratByName(Member[] arr) {
		for (int i = 0; i< arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String iName = arr[i].getName();
				String jName = arr[j].getName();
				if(iName.compareTo(jName) > 0)  {
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
	static void sortMemberArratByAge(Member[] arr) {
		for (int i = 0; i< arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].getAge() > arr[j].getAge()) { 
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}


}


