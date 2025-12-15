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
    Student studentNou= new Student();

    void paginaLogin(){
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

//    public void play() {
//        this.studentService.loadStudents();
//        this.booksService.loadBooks();
//        boolean continua = true;
//        while (continua) {
//            paginaPornire();
//            if (logat != null) {
//                meniu();
//                int alegere = Integer.parseInt(sc.nextLine());
//                if (alegere == 1) {
//                    cartiStudent();
//                    break;
//                } else {
//                    System.out.println("Alegere gresita, iesim din meniu");
//                    continua = false;
//                }
//            } else {
//                System.out.println("ID/pass invalide");
//            }
//            ;
//
//            continua = false;
//        }
//    }

        //todo:  register stundet
    void meniu(){
        System.out.println("=====Meniu=====");
        System.out.println("1->Login.");
        System.out.println("2->Register.");
        System.out.println("3->Sign out.");
        System.out.println("4->Vezi carti.");
    }

    void cartiStudent(){
        List<Books> books = booksService.cartileStudentului(logat.id);
        for(int j=0;j<books.size();j++){
            System.out.println(books.get(j).bookName);}
    }

    void register(){
        System.out.println("Introduceti prenumele: ");
        studentNou.firstName = sc.nextLine();
        System.out.println("Introduceti numele de familie: ");
        studentNou.lastName = sc.nextLine();
        System.out.println("Introduceti email: ");
        studentNou.email = sc.nextLine();
        System.out.println("Introduceti password: ");
        studentNou.password = sc.nextLine();
        System.out.println("Introduceti varsta: ");
        studentNou.age =  Integer.parseInt(sc.nextLine());
        System.out.println("Introduceti varsta: ");

        studentService.creeazaStudent(studentNou);


    }




    public void play(){
        this.studentService.loadStudents();
        this.booksService.loadBooks();
        boolean continua=true;
        while (continua) {
            meniu();
            int alegere = Integer.parseInt(sc.nextLine());
            switch (alegere) {
                case 1:
                    if(logat!=null){
                        System.out.println("Sunteti deja logat");
                        break;
                    }else{
                        paginaLogin();
                        break;
                    }
                case 2:
                    if(logat!=null){
                        System.out.println("Deja sunteti logat.");
                        break;
                    }else{
                        register();
                        System.out.println("Acum logati-va cu datele inregistrate.");
                        break;
                    }
                case 3:
                    if(logat!=null){
                        logat=null;
                        System.out.println("V-ati delogat cu succes.");
                        break;
                    }else{
                        System.out.println("Nu sunteti logat.");
                        break;
                    }
                case 4:
                    if(logat==null){
                        System.out.println("Nu sunteti logat.");
                        break;
                    }else{
                        cartiStudent();
                        break;
                    }
                default:
                    System.out.println("Alegere diferita, iesim din meniu.");
                    continua = false;
            }
        }
    }

}

