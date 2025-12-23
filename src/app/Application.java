package app;

import app.books.Book;
import app.books.BooksService;
import app.students.StudentService;

public class Application {

    static void main() {

        BooksService booksService = new BooksService();

        System.out.println(booksService);

        System.out.println(booksService.cartileStudentului(150));


    }
}
