package day10;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}

class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
public class BookDetails {

	public static void main(String[] args) {
		Book b=new Book();
		EngineeringBook ebook=new EngineeringBook();
		
		b.setBookNo(11);
		System.out.println( "Book number is :"+ b.getBookNo());
		b.setTitle("java");
		System.out.println("Title is :"+b.getTitle());
		b.setAuthor("john");
		System.out.println("Author name is :"+b.getAuthor());;
		b.setPrice(22.0f);
		System.out.println("Price of Book is :"+b.getPrice());
		
		ebook.setCategory("programming");
		System.out.println("Category is : "+ebook.getCategory());
		
		
		
		

	}

}
