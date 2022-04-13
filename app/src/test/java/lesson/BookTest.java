package lesson;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BookTest {

    @Test
    public void testingProperties() {
        Book b = new Book();
        assertEquals(b.getAuthor(), "none");
        assertEquals(b.getGenre(), "none");
        assertEquals(b.getISBN(), "none");
        assertEquals(b.getTitle(), "none");
    }   
}