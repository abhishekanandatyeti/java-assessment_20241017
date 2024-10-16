package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryManagementTest {

    @Test
    public void testAddAndDisplayBooks() {
        LibraryManagement library = new LibraryManagement();
        library.addBook("Harry Potter");
        library.addBook("The Hobbit");

        // Simulate book display and assert availability
        library.displayBooks();  // In real scenarios, mock system output
    }

    @Test
    public void testBorrowBook() {
        LibraryManagement library = new LibraryManagement();
        library.addBook("Harry Potter");
        library.borrowBook("Harry Potter");

        assertFalse(library.isBookAvailable("Harry Potter"));
    }

    @Test
    public void testReturnBook() {
        LibraryManagement library = new LibraryManagement();
        library.addBook("Harry Potter");
        library.borrowBook("Harry Potter");
        library.returnBook("Harry Potter");

        assertTrue(library.isBookAvailable("Harry Potter"));
    }

    @Test
    public void testBorrowUnavailableBook() {
        LibraryManagement library = new LibraryManagement();
        library.addBook("Harry Potter");
        library.borrowBook("Harry Potter");

        library.borrowBook("Harry Potter");  // Should print that the book is unavailable
    }
}
