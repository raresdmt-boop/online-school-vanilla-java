package app;

import app.books.Book;
import app.books.BooksService;
import app.course.CourseService;
import app.enrollment.Enrollment;
import app.enrollment.EnrollmentService;
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
    CourseService courseService = new CourseService();
    EnrollmentService enrollmentService = new EnrollmentService();
    Enrollment enrollment = new Enrollment();


    public void play() {
        this.studentService.loadStudents();
        this.booksService.loadBooks();
        this.courseService.loadCourse();
        this.enrollmentService.loadEnrollments();
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
                    updateDenumireCarte();
                    break;
                case 6:
                    updateDataCarte();
                    break;
                case 7:
                    stergeCarte();
                    break;
                case 8:
                    afiseazaCursuri();
                    break;
                case 9:
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
        System.out.println("5-> Editeaza denumire carte");
        System.out.println("6-> Editeaza data cartii");
        System.out.println("7-> Sterge cartea.");
        System.out.println("8-> Afiseaza cursuri");
        System.out.println("9-> Sign Out.");

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
    void updateDenumireCarte() {
        verificaLogat();
        System.out.println("Ce carte doriti sa modificati?");
        String nume = sc.nextLine();
        Book book = booksService.getBookByName(nume);
        if(verificaApartenenta(book)) {
            System.out.println("Introduceti noua denumire: ");
            book.bookName = sc.nextLine();
            System.out.println("Update complet");
        }else{
            System.out.println("Nu este cartea dvs.");
        }
    }
    void updateDataCarte(){
        verificaLogat();
        System.out.println("Care carte doriti sa modificati?");
        String nume = sc.nextLine();
        Book book = booksService.getBookByName(nume);
        if(verificaApartenenta(book)) {
            System.out.println("Introduceti noua data: ");
            book.createdAt = sc.nextLine();
            System.out.println("Update complet");
        }else{
            System.out.println("Nu este cartea dvs.");
        }
    }
    void stergeCarte(){
        verificaLogat();
        System.out.println("Care carte doriti sa stergeti?");
        Book book = booksService.getBookByName(sc.nextLine());
        if(book.studentID==logat.id) {
            booksService.stergeCarte(book);
            System.out.println("Cartea "+book.bookName+" a fost stearsa");
        }else{
            System.out.println("Nu este cartea dvs.");
        }
    }

    boolean verificaApartenenta(Book book) {
       return logat.id == book.studentID;
    }

    void afiseazaCursuri(){
        verificaLogat();
        Enrollment enroll = enrollmentService.getEnrollments(logat.id);
        int courseID = enroll.courseID;
        courseService.getCourseById(courseID);
    }

}

