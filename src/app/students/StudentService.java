package app.students;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class StudentService {
    private ArrayList<Student> listaStudenti;
    private File studentsFile;


    public StudentService() {
        listaStudenti = new ArrayList<>();
        studentsFile = new File("C:\\mycode\\initiere-structuri\\StudentBook\\src\\app\\students\\students.txt");
        loadStudents();
    }

    public Student getStudent(String email, String pass) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            Student student = listaStudenti.get(i);
            if (student.getEmail().equals(email) && student.getPassword().equals(pass)) {
                return student;
            }
        }
        return null;
    }

    public void afiseazaStudent(String email, String pass) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            Student student = listaStudenti.get(i);
            if (student.getEmail().equals(email) && student.getPassword().equals(pass)) {
                {
                    System.out.println(listaStudenti.get(i).toString());
                    break;
                }
            }
        }
    }
    public void addStudent(Student student) {
        student.setID(generateID());
        listaStudenti.add(student);
        saveStudents();
    }
    public int generateID() {
        Random rand = new Random();

        int id = rand.nextInt(9999) + 1;
        while (getStudentByID(id) != null) {
            id = rand.nextInt(9999) + 1;
        }

        return id;

    }
    public Student getStudentByID(int id) {
        for (int i = 0; i < listaStudenti.size(); i++) {
            if (listaStudenti.get(i).getID() == id) {
                return listaStudenti.get(i);
            }
        }
        return null;
    }
    public void removeStudent(Student student) {
        listaStudenti.remove(student);
        saveStudents(listaStudenti);
    }
    


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (; i < listaStudenti.size() - 1; i++) {
            sb.append(listaStudenti.get(i) + "\n");
        }
        sb.append(listaStudenti.get(i));
        return sb.toString();
    }

    private void loadStudents() {
        try {
            Scanner sc = new Scanner(studentsFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                try {
                    this.listaStudenti.add(new Student(line));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void saveStudents() {
        try {
            FileWriter fw = new FileWriter(studentsFile);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(this.toString());
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void saveStudents(ArrayList<Student> listaStudenti) {
        try{
            FileWriter fw = new FileWriter(studentsFile);
            PrintWriter pw = new PrintWriter(fw);
            for (Student student : listaStudenti) {
                pw.println(student.toString());
            }
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }






}






