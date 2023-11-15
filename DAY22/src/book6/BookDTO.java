package book6;
//테으블을 구성하는 칼럼의 내용대로 맴버 필드를 작성한다
//맴버필드에 private를 적용하고 getter/setter를 public으로 적용한다

public class BookDTO {
	private String name;	// 클래스 내부에서는 자유롭게 접근이 가능하다
	private String author;
	private int price;
	private String publisher;
	
	// 출력 서식을 toString으로 오버라이딩
	@Override
	public String toString() {
		String data = String.format("%s (%s, %s) : %,d원", 
				name,
				author, 
				publisher, 
				price);
		return data;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

}
