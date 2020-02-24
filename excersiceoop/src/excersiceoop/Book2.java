package excersiceoop;

import java.util.Arrays;

public class Book2 {
	private String name;
	private Author[] authors;
	private double price;
	private int qty=0;
	
	public Book2(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book2(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthor() {
		
		return authors;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + Arrays.asList(authors) + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public  void getAuthornames() {
		
		for (int i =0; i <authors.length;i++) {
			System.out.println("Author "+(i+1)+" :"+authors[i].getName());
		}
	}
	
	
	
}
