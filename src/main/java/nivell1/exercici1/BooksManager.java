package nivell1.exercici1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class BooksManager {


    static void printBookCollection(ArrayList<Book> booksArrayList) {

        TreeSet<Book> bookTreeSet = new TreeSet<>(new BookComparator());
        bookTreeSet.addAll(booksArrayList);
        System.out.println(bookTreeSet);

    }


    static void addBook(String title, String author, ArrayList<Book> booksArrayList) {

        if (booksArrayList.isEmpty()) {

            Book newBook = new Book(title, author);
            booksArrayList.add(newBook);
            System.out.println("The book " + newBook + " has been added.");

        } else {

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

    }

    static void addBookToSpecificPosition(Book book, int position, ArrayList<Book> booksArrayList) {

        booksArrayList.add(position, book);

    }

    static void deleteBookByTitle(String title, ArrayList<Book> booksArrayList) {
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

    static String getBookTitleByPosition(ArrayList<Book> booksArrayList, int position) {

        if (position < 0 || position >= booksArrayList.size())
            throw new IndexOutOfBoundsException("Index out of range");

        Book book;
        int currentPosition = 0;
        for (Book value : booksArrayList) {
            book = value;
            if (currentPosition == position) {
                return book.getTitle();
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
