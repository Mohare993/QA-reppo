package lib;

public class Theses extends Item {

	private int thesesYear;
	

	public int getThesesYear() {
		return thesesYear;
	}
	public void setThesesYear(int thesesYear) {
		this.thesesYear = thesesYear;
	}
	
	public Theses(int id, String name, String author, int loanId, int thesesYear) {
		super(id, name, author, loanId);
		this.thesesYear = thesesYear;
	}
	

	

	
}
