package app;

import app.books.Book;
import app.books.BooksService;
import app.students.Student;
import app.students.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    StudentService studentService = new StudentService();
    BooksService booksService = new BooksService();
    Book book = new Book();
    Scanner sc = new Scanner(System.in);
    Student logat = null;
    Student studentNou = new Student();


    public void play() {
        this.studentService.loadStudents();
        this.booksService.loadBooks();
        boolean continua = true;
        while (continua) {
            meniuInitial();
            int alegere = Integer.parseInt(sc.nextLine());
            switch (alegere) {
                case 1:
                    paginaLogin();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    cartiStudent();
                    break;
                case 4:
                    adaugaCarte();
                    break;
                case 5:
                    updateCarte();
                    break;
                case 6:
                    signOut();
                    break;
                default:
                    continua = false;
            }
        }
    }

    //todo:CRUD  create read update delete





    void meniuInitial() {
        System.out.println("1-> Login.");
        System.out.println("2-> Register.");
        System.out.println("3-> Carti Student.");
        System.out.println("4-> Adauga Carte.");
        System.out.println("5-> Editeaza carte");
        System.out.println("6-> Sign Out.");
    }
    void cartiStudent() {
        verificaLogat();
         List<Book> books = booksService.cartileStudentului(logat.id);
        for (int j = 0; j < books.size(); j++) {
            System.out.println(books.get(j).bookName);
        }
    }
    void register() {
        System.out.println("Introduceti prenumele: ");
        studentNou.firstName = sc.nextLine();
        System.out.println("Introduceti numele de familie: ");
        studentNou.lastName = sc.nextLine();
        System.out.println("Introduceti email: ");
        studentNou.email = sc.nextLine();
        System.out.println("Introduceti password: ");
        studentNou.password = sc.nextLine();
        System.out.println("Introduceti varsta: ");
        studentNou.age = Integer.parseInt(sc.nextLine());
        System.out.println("Introduceti varsta: ");
        studentService.creeazaStudent(studentNou);

    }
    void verificaLogat(){
        if(logat==null){
            System.out.println("Nu sunteti logat, logati-va");
            while(logat==null){
                paginaLogin();
            }
        }
    }
    void signOut(){
        if(logat==null){
            System.out.println("Nu sunteti logat");
        }else{
            logat = null;
            System.out.println("V-ati delogat cu succes");
        }
    }
    void paginaLogin() {
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Password: ");
        String passw = sc.nextLine();
        this.logat = studentService.getStudent(email, passw);
        if (this.logat != null) {
            System.out.println("Date corecte, login complet.");
        } else {
            System.out.println("ID/pass invalide");
        }
    }
    void adaugaCarte(){
        Book book = new Book();
        verificaLogat();
        System.out.println("Denumirea cartii: ");
        String nume = sc.nextLine();
        book.bookName = nume;
        System.out.println("Created at...");
        String date = sc.nextLine();
        book.createdAt = date;
        book.studentID = logat.id;

        booksService.addBook(book);
    }
    void updateCarte(){
        verificaLogat();
        System.out.println("Ce carte doriti sa modificati?");
        String nume = sc.nextLine();
        Book book = booksService.getBookByName(nume);
        boolean continua = true;
        while(continua) {
            meniuUpdate();
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Introduceti noua denumire: ");
                    book.bookName = sc.nextLine();
                    break;
                case "2":
                    System.out.println("Introduceti noua data: ");
                    book.createdAt = sc.nextLine();
                    break;
                default:
                    System.out.println("Am iesit din meniu");
                    continua = false;
            }
        }
    }
    public void meniuUpdate(){
        System.out.println("Ati selectat cartea "+book.bookName);
        System.out.println("Ce doriti sa modificati la aceasta carte?");
        System.out.println("1->Denumirea cartii.");
        System.out.println("2->Data cartii");

    }

}

