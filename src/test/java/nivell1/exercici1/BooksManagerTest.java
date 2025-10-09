package nivell1.exercici1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BooksManagerTest {

    ArrayList<Book> booksArrayList;

    @BeforeEach
    void separator(){
        IO.println(":: New Test Starts ::");
    }

    @AfterEach
    void separator2(){
        IO.println(":: Test Finish ::");
    }

    @Test
    void printBookCollection() {
        IO.println("Testing Sorted books");
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote3", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        BooksManager.addBook("Las Dos Torres", "J.R.R. Tolkien", booksArrayList);
        BooksManager.addBook("Antes muerta que sencilla", "Melody", booksArrayList);
        BooksManager.addBook("Zootropolis", "Disney", booksArrayList);
        BooksManager.printBookCollection(booksArrayList);

    }

    @Test
    void addBookTest() {
        IO.println("Testing: addBook() method and adding book modifies list.");
        assertNull(booksArrayList);
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        assertNotNull(booksArrayList);
        assertEquals(1, booksArrayList.size());
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        assertEquals(2, booksArrayList.size());


    }

    @Test
    void expectedSizeTest (){

        IO.println("Testing: expexted size of library.");
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        assertEquals(1, booksArrayList.size());
        BooksManager.addBook("El quijote3", "Cervantes", booksArrayList);
        assertEquals(2, booksArrayList.size());
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        assertEquals(3, booksArrayList.size());

    }

    @Test
    void bookAtSpecificPositionTest(){
        IO.println("Testing: book at specific position");
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote3", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        assertEquals("El quijote", BooksManager.getBookTitleByPosition(booksArrayList,0));
        assertEquals("El quijote2", BooksManager.getBookTitleByPosition(booksArrayList,2));

    }

    @Test
    void duplicateNoAllowedTest(){
        IO.println("Testing: not allowing duplicates");
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        assertEquals(2, booksArrayList.size());

    }



    @Test
    void deleteBookByTitle() {
        IO.println("Testing: delete book by title");
        booksArrayList = new ArrayList<>();
        BooksManager.addBook("El quijote", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote3", "Cervantes", booksArrayList);
        BooksManager.addBook("El quijote2", "Cervantes", booksArrayList);
        BooksManager.deleteBookByTitle("El quijote", booksArrayList);
        assertEquals(2, booksArrayList.size());

    }


}