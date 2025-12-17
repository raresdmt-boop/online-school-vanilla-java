package app.students;

import app.books.BooksService;

import java.util.*;

public class StudentService {
    List<Student> listaStudenti = new ArrayList<>();
    public void loadStudents() {

        Student s1 = new Student();
        s1.id = 1;
        s1.firstName = "Andrei";
        s1.lastName = "Popescu";
        s1.email = "andrei.popescu@example.com";
        s1.password = "1234";
        s1.age = 21;

        Student s2 = new Student();
        s2.id = 2;
        s2.firstName = "Maria";
        s2.lastName = "Ionescu";
        s2.email = "maria.ionescu@example.com";
        s2.password = "abcd";
        s2.age = 22;

        Student s3 = new Student();
        s3.id = 3;
        s3.firstName = "Vlad";
        s3.lastName = "Georgescu";
        s3.email = "vlad.georgescu@example.com";
        s3.password = "pass3";
        s3.age = 20;

        Student s4 = new Student();
        s4.id = 4;
        s4.firstName = "Ioana";
        s4.lastName = "Dumitru";
        s4.email = "ioana.dumitru@example.com";
        s4.password = "4321";
        s4.age = 23;

        Student s5 = new Student();
        s5.id = 5;
        s5.firstName = "Cristina";
        s5.lastName = "Enache";
        s5.email = "cristina.enache@example.com";
        s5.password = "cris5";
        s5.age = 19;

        Student s6 = new Student();
        s6.id = 6;
        s6.firstName = "Mihai";
        s6.lastName = "Tudor";
        s6.email = "mihai.tudor@example.com";
        s6.password = "mimi6";
        s6.age = 24;

        Student s7 = new Student();
        s7.id = 7;
        s7.firstName = "Elena";
        s7.lastName = "Marin";
        s7.email = "elena.marin@example.com";
        s7.password = "ele7";
        s7.age = 20;

        Student s8 = new Student();
        s8.id = 8;
        s8.firstName = "Radu";
        s8.lastName = "Serban";
        s8.email = "radu.serban@example.com";
        s8.password = "rad8";
        s8.age = 22;

        Student s9 = new Student();
        s9.id = 9;
        s9.firstName = "Ana";
        s9.lastName = "Iliescu";
        s9.email = "ana.iliescu@example.com";
        s9.password = "ana9";
        s9.age = 21;

        Student s10 = new Student();
        s10.id = 10;
        s10.firstName = "Darius";
        s10.lastName = "Stan";
        s10.email = "darius.stan@example.com";
        s10.password = "dar10";
        s10.age = 23;

        listaStudenti.add(s1);
        listaStudenti.add(s2);
        listaStudenti.add(s3);
        listaStudenti.add(s4);
        listaStudenti.add(s5);
        listaStudenti.add(s6);
        listaStudenti.add(s7);
        listaStudenti.add(s8);
        listaStudenti.add(s9);
        listaStudenti.add(s10);

    }

    void afisareStudenti() {
        for (int i = 0; i < listaStudenti.size(); i++) {
            System.out.println(listaStudenti.get(i).descriere());
        }
    }

    public Student getStudent(String email, String pass) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            Student student = listaStudenti.get(i);
            if (student.email.equals(email) && student.password.equals(pass)) {
                return student;
            }
        }
        return null;
    }

    public void afiseazaStudent(String email, String pass) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            Student student = listaStudenti.get(i);
            if (student.email.equals(email) && student.password.equals(pass)) {
                {
                    System.out.println(listaStudenti.get(i).descriere());
                    break;
                }
            }
        }
    }

    public Student creeazaStudent(Student student) {
        student.id= generateID();
        listaStudenti.add(student);
        return student;
    }

    public Student getStudentByID(int id) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            if (listaStudenti.get(i).id == id) {
                return listaStudenti.get(i);
            }
        }
        return null;
    }

    public int generateID() {
        Random rand = new Random();

        int id=rand.nextInt(9999)+1;
        while (getStudentByID(id)!=null) {
            id=rand.nextInt(9999)+1;
        }

        return id;

    }




}




