package lib;

public class Magazine extends Item {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Magazine(int id, String name, String author, int loanId, String type) {
		super(id, name, author, loanId);
		this.type = type;
	}


	
	
	
	


}
