package app;

import app.books.Book;
import app.books.BooksService;
import app.students.StudentService;

public class Application {

    static void main() {


        Book t1=  new Book();

        t1.bookName="test";


        Book t2=  new Book();

        t2.bookName="test2";

        Book t3=  new Book();
        t3.bookName="test3";


        System.out.println(t2);


        System.out.println(t1.bookName);


        String text="ana are mere";

        text="ce  mai faci";
    }
}
