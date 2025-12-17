package app.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BooksService {
    List<Book> listaBooks = new ArrayList<>();


    public void loadBooks(){

        Book book1 = new Book();
        book1.id = 1110;
        book1.studentID = 1;
        book1.bookName = "Java Fundamentals";
        book1.createdAt = "2024-01-10";

        Book book2 = new Book();
        book2.id = 1111;
        book2.studentID = 2;
        book2.bookName = "Python for Beginners";
        book2.createdAt = "2024-01-12";

        Book book3 = new Book();
        book3.id = 1112;
        book3.studentID = 3;
        book3.bookName = "Data Structures in C++";
        book3.createdAt = "2024-01-15";

        Book book4 = new Book();
        book4.id = 1113;
        book4.studentID = 4;
        book4.bookName = "Algorithms Explained";
        book4.createdAt = "2024-01-18";

        Book book5 = new Book();
        book5.id = 1114;
        book5.studentID = 5;
        book5.bookName = "Database Systems";
        book5.createdAt = "2024-01-20";

        Book book6 = new Book();
        book6.id = 1115;
        book6.studentID = 6;
        book6.bookName = "Operating Systems Concepts";
        book6.createdAt = "2024-01-23";

        Book book7 = new Book();
        book7.id = 1116;
        book7.studentID = 7;
        book7.bookName = "Computer Networks";
        book7.createdAt = "2024-01-25";

        Book book8 = new Book();
        book8.id = 1117;
        book8.studentID = 8;
        book8.bookName = "Web Development Basics";
        book8.createdAt = "2024-01-27";

        Book book9 = new Book();
        book9.id = 1118;
        book9.studentID = 9;
        book9.bookName = "Machine Learning Intro";
        book9.createdAt = "2024-01-30";

        Book book10 = new Book();
        book10.id = 1119;
        book10.studentID = 10;
        book10.bookName = "Cloud Computing";
        book10.createdAt = "2024-02-01";

        Book book11 = new Book();
        book11.id = 1120;
        book11.studentID = 1;
        book11.bookName = "Network Security Essentials";
        book11.createdAt = "2024-02-03";

        Book book12 = new Book();
        book12.id = 1121;
        book12.studentID = 2;
        book12.bookName = "Artificial Intelligence Basics";
        book12.createdAt = "2024-02-05";

        Book book13 = new Book();
        book13.id = 1122;
        book13.studentID = 3;
        book13.bookName = "Clean Code Principles";
        book13.createdAt = "2024-02-07";

        Book book14 = new Book();
        book14.id = 1123;
        book14.studentID = 4;
        book14.bookName = "Linux Command Line Guide";
        book14.createdAt = "2024-02-09";

        Book book15 = new Book();
        book15.id = 1124;
        book15.studentID = 5;
        book15.bookName = "Kotlin for Developers";
        book15.createdAt = "2024-02-11";

        Book book16 = new Book();
        book16.id = 1125;
        book16.studentID = 6;
        book16.bookName = "C# in Depth";
        book16.createdAt = "2024-02-13";

        Book book17 = new Book();
        book17.id = 1126;
        book17.studentID = 7;
        book17.bookName = "JavaScript: The Good Parts";
        book17.createdAt = "2024-02-15";

        Book book18 = new Book();
        book18.id = 1127;
        book18.studentID = 8;
        book18.bookName = "React for Beginners";
        book18.createdAt = "2024-02-17";

        Book book19 = new Book();
        book19.id = 1128;
        book19.studentID = 9;
        book19.bookName = "Docker & Kubernetes";
        book19.createdAt = "2024-02-19";

        Book book20 = new Book();
        book20.id = 1129;
        book20.studentID = 10;
        book20.bookName = "Cybersecurity Basics";
        book20.createdAt = "2024-02-21";

        Book book21 = new Book();
        book21.id = 1130;
        book21.studentID = 1;
        book21.bookName = "DevOps Handbook";
        book21.createdAt = "2024-02-23";

        Book book22 = new Book();
        book22.id = 1131;
        book22.studentID = 2;
        book22.bookName = "SQL Mastery";
        book22.createdAt = "2024-02-25";

        Book book23 = new Book();
        book23.id = 1132;
        book23.studentID = 3;
        book23.bookName = "NoSQL Databases";
        book23.createdAt = "2024-02-27";

        Book book24 = new Book();
        book24.id = 1133;
        book24.studentID = 4;
        book24.bookName = "Microservices Architecture";
        book24.createdAt = "2024-03-01";

        Book book25 = new Book();
        book25.id = 1134;
        book25.studentID = 5;
        book25.bookName = "Big Data Processing";
        book25.createdAt = "2024-03-03";

        Book book26 = new Book();
        book26.id = 1135;
        book26.studentID = 6;
        book26.bookName = "Parallel Computing";
        book26.createdAt = "2024-03-05";

        Book book27 = new Book();
        book27.id = 1136;
        book27.studentID = 7;
        book27.bookName = "Cloud Architecture";
        book27.createdAt = "2024-03-07";

        Book book28 = new Book();
        book28.id = 1137;
        book28.studentID = 8;
        book28.bookName = "AI Ethics & Governance";
        book28.createdAt = "2024-03-09";

        Book book29 = new Book();
        book29.id = 1138;
        book29.studentID = 9;
        book29.bookName = "Computer Graphics Essentials";
        book29.createdAt = "2024-03-11";

        Book book30 = new Book();
        book30.id = 1139;
        book30.studentID = 10;
        book30.bookName = "Quantum Computing Intro";
        book30.createdAt = "2024-03-13";

        listaBooks.add(book1);
        listaBooks.add(book2);
        listaBooks.add(book3);
        listaBooks.add(book4);
        listaBooks.add(book5);
        listaBooks.add(book6);
        listaBooks.add(book7);
        listaBooks.add(book8);
        listaBooks.add(book9);
        listaBooks.add(book10);
        listaBooks.add(book11);
        listaBooks.add(book12);
        listaBooks.add(book13);
        listaBooks.add(book14);
        listaBooks.add(book15);
        listaBooks.add(book16);
        listaBooks.add(book17);
        listaBooks.add(book18);
        listaBooks.add(book19);
        listaBooks.add(book20);
        listaBooks.add(book21);
        listaBooks.add(book22);
        listaBooks.add(book23);
        listaBooks.add(book24);
        listaBooks.add(book25);
        listaBooks.add(book26);
        listaBooks.add(book27);
        listaBooks.add(book28);
        listaBooks.add(book29);
        listaBooks.add(book30);
    }

    public List<Book> cartileStudentului(int sID){
        List<Book> studentBooks = new ArrayList<>();
        for(int j=0;j<listaBooks.size();j++){
            Book book = listaBooks.get(j);
            if(book.studentID==sID){
                studentBooks.add(book);
            }
        }
        return studentBooks;
    }

    public Book getBookByID(int id){
        for(int i=0;i<listaBooks.size();i++){
            if(listaBooks.get(i).id==id){
                return listaBooks.get(i);
            }
        }
        return null;
    }

    public int generateID(){
        Random rand = new Random();

        int id=rand.nextInt(9999)+1;
        while (getBookByID(id)!=null) {
            id=rand.nextInt(9999)+1;
        }

        return id;
    }

    public Book getBookByName(String name){
        for(int i=0;i<listaBooks.size();i++){
            if(listaBooks.get(i).bookName.equals(name)){
                return listaBooks.get(i);
            }
        }
        return null;
    }

    public Book addBook(Book book){
        book.id=generateID();
        this.listaBooks.add(book);
        return book;
    }


}
