package book4;

//접근 제한자 getset적용
public class Book {
	private String name;
	private String author;
	private int price;
	private String publisher;
	@Override
	public String toString() {
		String data = String.format("%s (%s-%s), %d원\n", name,author,publisher,price );
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
