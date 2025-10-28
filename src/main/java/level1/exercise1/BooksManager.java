package level1.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class BooksManager {

    private final ArrayList<Book> booksArrayList;


    public ArrayList<Book> getBooksArrayList() {
        return booksArrayList;
    }

    public BooksManager(ArrayList<Book> arrayList){
        this.booksArrayList = arrayList;
    }


    void printBookCollection() {

        TreeSet<Book> bookTreeSet = new TreeSet<>(new BookComparator());
        bookTreeSet.addAll(booksArrayList);
        System.out.println(bookTreeSet);

    }


    void addBook(String title, String author) {

        for (Book book : booksArrayList) {

            if (title.equals(book.getTitle())) {

                System.out.println("This book already exists, duplicate books are not allowed.");
                return;

            }

        }

        Book newBook = new Book(title, author);
        booksArrayList.add(newBook);
        System.out.println("The book " + newBook + " has been added.");

    }
    void addBook(Book book) {

        for (Book value : booksArrayList) {

            if (book.getTitle().equals(value.getTitle())) {

                System.out.println("This book already exists, duplicate books are not allowed.");
                return;

            }
        }

        booksArrayList.add(book);
        System.out.println("The book " + book + " has been added.");

    }

    void addBookToSpecificPosition(Book book, int position) {
        if (position < 0 || position >= booksArrayList.size())
            throw new IndexOutOfBoundsException("Index out of range");
        booksArrayList.add(position, book);

    }

    void deleteBookByTitle(String title) {
        boolean titleExists = false;

        for (Book value : booksArrayList) {
            if (value.getTitle().equals(title)) {
                booksArrayList.remove(value);
                titleExists = true;
                break;
            }
        }

        if (titleExists) {
            System.out.println("Book deleted: " + title);
        } else {
            System.out.printf("The book %s does not exists in this library.%n", title);
        }

    }

    String getBookTitleByPosition(int position) {

        if (position < 0 || position >= booksArrayList.size())
            throw new IndexOutOfBoundsException("Index out of range");

        int currentPosition = 0;
        for (Book value : booksArrayList) {
            if (currentPosition == position) {
                return value.getTitle();
            }
            currentPosition++;
        }
        return null;
    }


    static class BookComparator implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {

            return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
        }
    }
}
