package main;

import dao.BookDao;
import dao.BookDaoImpl;
import model.Book;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("1234567", "Cay Horstmann, Gary Cornell", "Java Fundamentals");
        Book book1 = new Book("1234568", "David Thomas, Andrew Hunt", "The Pragmatic Programmer");
        Book book2 = new Book("1234569", "Joshua Bloch", "Effective Java");

        BookDao bookDao = new BookDaoImpl();

        bookDao.save(book);
        bookDao.save(book1);
        bookDao.save(book2);

        Book printBook = bookDao.get(1L);
        Book printBook2 = bookDao.get(2L);
        Book printBook3 = bookDao.get(3L);

        System.out.println(printBook + "\n" + printBook2 + "\n" + printBook3);

        bookDao.cleanUp();

    }
}
