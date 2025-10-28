package level1.exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BooksManagerTest {

    ArrayList<Book> booksArrayList;
    BooksManager bm;
    Book elquijote, elquijote2, elquijote3, dosTorres, melody, zootropolis, zzTop, testing;

    @BeforeEach
    void setUp() {
        System.out.println(":: New Test Starts ::");
        elquijote = new Book("El quijote", "Cervantes");
        elquijote2 = new Book("El quijote2", "Cervantes");
        elquijote3 = new Book("El quijote3", "Cervantes");
        dosTorres = new Book("Las Dos Torres", "J.R.R. Tolkien");
        melody = new Book("Antes muerta que sencilla", "Melody");
        zootropolis = new Book("Zootropolis", "Disney");
        zzTop = new Book("ZZ Top", "Cool");
        testing = new Book("Testing", "Tron");
        booksArrayList = new ArrayList<>();
        booksArrayList.add(elquijote);
        booksArrayList.add(elquijote2);
        booksArrayList.add(elquijote3);
        booksArrayList.add(melody);
        booksArrayList.add(dosTorres);
        booksArrayList.add(zootropolis);
        booksArrayList.add(elquijote3);
        bm = new BooksManager(booksArrayList);
    }

    @AfterEach
    void separator2() {
        System.out.println(":: Test Finish ::");
    }

    @Test
    void printBookCollection() {
        System.out.println("Testing Sorted books");
        bm.printBookCollection();
        bm.addBook("ZZ Top", "Cool");
        bm.printBookCollection();

    }

    @Test
    void addBookTest() {
        ArrayList<Book> testAl = new ArrayList<>();
        BooksManager testBm = new BooksManager(testAl);
        assertTrue(testBm.getBooksArrayList().isEmpty());
        testBm.addBook(elquijote);
        assertFalse(testBm.getBooksArrayList().isEmpty());
        assertEquals(1, testBm.getBooksArrayList().size());
        testBm.addBook(elquijote2);
        assertEquals(2, testBm.getBooksArrayList().size());


    }

    @Test
    void expectedSizeTest() {

        assertEquals(7, bm.getBooksArrayList().size());
        bm.addBook("El quijote5", "Cervantes");
        assertEquals(8, bm.getBooksArrayList().size());
        bm.addBook("El quijote8", "Cervantes");
        assertEquals(9, bm.getBooksArrayList().size());

    }

    @Test
    void bookAtSpecificPositionTest() {
        assertEquals("El quijote", bm.getBookTitleByPosition(0));
        assertEquals("El quijote2", bm.getBookTitleByPosition(1));

    }

    @Test
    void duplicateNoAllowedTest() {

        assertEquals(7, bm.getBooksArrayList().size());
        bm.addBook("El quijote", "Cervantes");
        assertEquals(7, booksArrayList.size());

    }


    @Test
    void deleteBookByTitle() {
        assertEquals(7, bm.getBooksArrayList().size());
        bm.deleteBookByTitle("El quijote");
        assertEquals(6, booksArrayList.size());

    }

    @Test
    void addBookAtSpecificPositionTest() {
        bm.addBookToSpecificPosition(new Book("Testing", "Tron"), 1);
        assertEquals("Testing", bm.getBookTitleByPosition(1));
    }


}