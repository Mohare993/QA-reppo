package lib;

public abstract class Item {
	
	private int id;
	private String name;
	private String author;
	private int loanId = 0;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	
	
	public Item(int id, String name, String author, int loanId) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.loanId = loanId;
	}


}
