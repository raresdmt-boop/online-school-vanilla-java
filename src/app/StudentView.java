package app;

import app.books.Books;
import app.books.BooksService;
import app.students.Student;
import app.students.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    StudentService studentService = new StudentService();
    BooksService booksService = new BooksService();
    Books book= new Books();
    Scanner sc = new Scanner(System.in);
    Student logat=null;

    void paginaPornire(){
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Password: ");
        String passw = sc.nextLine();
        this.logat=studentService.getStudent(email,passw);

        if(this.logat!=null){
            System.out.println("Date corecte, login complet.");

        }else{
            System.out.println("ID/pass invalide");
        }

    }

    public void play(){
        this.studentService.loadStudents();
        this.booksService.loadBooks();
        boolean continua=true;
        while(continua){
            paginaPornire();
            if(logat!=null){
                meniu();
                int alegere=Integer.parseInt(sc.nextLine());
                if(alegere==1){
                        cartiStudent();
                        break;
                }
                else{
                        System.out.println("Alegere gresita, iesim din meniu");
                        continua=false;
                }
                }else{
                System.out.println("ID/pass invalide");
            }

            };

            continua=false;
        }


    void meniu(){
        System.out.println("=====Meniu=====");
        System.out.println("1->Vezi cartile.");
    }

    void cartiStudent(){
        List<Books> books = booksService.cartileStudentului(logat.id);
        for(int j=0;j<books.size();j++){
            System.out.println(books.get(j).bookName);}
    }



}

