package app.enrollment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollmentsList;
    private File enrollmentsFile;

    public EnrollmentService(){
        enrollmentsList = new ArrayList<>();
        enrollmentsFile = new File("C:\\mycode\\initiere-structuri\\StudentBook\\src\\app\\enrollment\\enrollments.txt");
        loadEnrollments();
    }
    public Enrollment getEnrollment(int studentID, int courseID){
        for (int i = 0; i<enrollmentsList.size(); i++) {
            if (enrollmentsList.get(i).getStudentID() == studentID && enrollmentsList.get(i).getCourseID() == courseID) {
                return enrollmentsList.get(i);
            }
        }return null;
    }
    public ArrayList<Enrollment> getEnrollments(int studentID){
        ArrayList<Enrollment> studentEnrollList = new ArrayList<>();
        for (int i = 0; i<enrollmentsList.size(); i++){
            if(enrollmentsList.get(i).getStudentID()==studentID){
                studentEnrollList.add(enrollmentsList.get(i));
            }
        }
        return studentEnrollList;
    }

    public Enrollment getEnrollmentByID(int id){
        for (int i = 0; i<enrollmentsList.size(); i++){
            if(enrollmentsList.get(i).getID()==id){
                return enrollmentsList.get(i);
            }
        }
        return null;
    }
    public int getCourseByEnrollment(Enrollment enrollment){
        return  enrollment.getCourseID();
    }
    public void createEnrollment(int studentID, int courseID){
        Enrollment newE = new Enrollment();
        newE.setID(generateID());
        newE.setCourseID(courseID);
        newE.setStudentID(studentID);
        newE.setCreatedAt("random");

        enrollmentsList.add(newE);
        saveEnroll();

    }
    public void deleteEnrollment(int studentID, int courseID){
        Enrollment enrollDeSters = getEnrollment(studentID,courseID);
        enrollmentsList.remove(enrollDeSters);
        saveEnroll(enrollmentsList);
    }
    public int generateID(){
        Random rand = new Random();

        int id=rand.nextInt(9999)+1;
        while (getEnrollmentByID(id)!=null) {
            id=rand.nextInt(9999)+1;
        }

        return id;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        int i=0;
        for(;i<enrollmentsList.size()-1;i++){
            sb.append(enrollmentsList.get(i)+"\n");
        }
        sb.append(enrollmentsList.get(i));
        return sb.toString();
    }

    private void loadEnrollments() {
        try{
            Scanner sc = new Scanner(enrollmentsFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                try{
                    this.enrollmentsList.add(new Enrollment(line));

                }catch(Exception e){
                    e.printStackTrace();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    private void saveEnroll(ArrayList<Enrollment> enrollmentsList) {
        try{
            FileWriter fw = new FileWriter(enrollmentsFile);
            PrintWriter pw = new PrintWriter(fw);
            for(Enrollment enrollment : this.enrollmentsList){
                pw.println(enrollment.toString());
            }
            pw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void saveEnroll(){
        try {
            FileWriter fw = new FileWriter(enrollmentsFile);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(this.toString());
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
