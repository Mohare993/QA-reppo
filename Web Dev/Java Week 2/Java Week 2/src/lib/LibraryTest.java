package lib;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class LibraryTest {
	
	Library testLibrary = new Library();

	
	
	@Test
	void createBook() {
		Book a = new Book(1, "Test", "Test", 0);
		assertEquals(true, testLibrary.addLibItem(a));
	}
	
	@Test
	void createMagazine() {
		Magazine b = new Magazine(2, "Test", "Test", 0, "Test");
		assertEquals(true, testLibrary.addLibItem(b));
	}
	
	@Test
	void createTheses() {
		Theses c = new Theses(3, "Test", "Test", 0, 1990);
		assertEquals(true, testLibrary.addLibItem(c));
	}
	
	@Test
	void createLibUser() {
		LibraryUser d = new LibraryUser(101, "Test");
		assertEquals(true, testLibrary.addLibUser(d));
	}
	
	@Test
	void removeBook() {
		ArrayList c = new ArrayList();
		Book a = new Book(1, "Test", "Test", 0);
		testLibrary.addLibItem(a);
		testLibrary.removeLibItem(a);
		assertEquals(c, testLibrary.getLibItemList());
	}


}
