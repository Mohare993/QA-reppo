package lib;

public class LibraryUser {
	
	private int userId;
	private String userName;
			
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LibraryUser(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	

	
	
}
