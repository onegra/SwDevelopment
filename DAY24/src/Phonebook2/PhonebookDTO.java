package Phonebook2;

public class PhonebookDTO {
	private int idx; //아이디
	private String name; //이름
	private String pnum; //전화번호 
	private int age; //나이
	private String favorite; // 즐겨찾기
	
	@Override
	public String toString() {
		String data = String.format("Id%d, %s, %s, %d살, %s", 
				idx,
				name,
				pnum, 
				age,
				(favorite.equals("Y") ? "★" : "☆"));
		return data;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
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
