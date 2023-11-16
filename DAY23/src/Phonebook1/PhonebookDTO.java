package Phonebook1;

public class PhonebookDTO {
	private String name; //이름
	private String pnum; //전화번호 
	private int age; //나이
	private String favorite; // 즐겨찾기
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String data = String.format("%s, %s, %d살, %s", 
				name,
				pnum, 
				age, 
				(favorite.equals("Y") ? "★" : "☆"));
		return data;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	

}
