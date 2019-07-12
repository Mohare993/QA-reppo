package lib;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> libItemList = new ArrayList<>();

	private List<LibraryUser> libUsers = new ArrayList<>();

	public List<Item> getLibItemList() {
		return libItemList;
	}

	public void setLibItemList(List<Item> libItemList) {
		this.libItemList = libItemList;
	}

	public boolean addLibItem(Item libItemList) {
		return this.libItemList.add(libItemList);
	}

	public boolean removeLibItem(Item libItemList) {
		return this.libItemList.remove(libItemList);

	}

	public boolean addLibUser(LibraryUser libUsers) {
		return this.libUsers.add(libUsers);
	}

	public boolean removeLibUser(LibraryUser libUsers) {
		return this.libUsers.remove(libUsers);

	}

	public void checkOutItem(int userId, int itemId) {
		libItemList.stream().filter(i -> i.getId() == itemId).findFirst().get().setLoanId(userId);

	}

	public void checkInItem(int itemId) {
		libItemList.stream().filter(i -> i.getId() == itemId).findFirst().get().setLoanId(0);

	}
	
	

}
