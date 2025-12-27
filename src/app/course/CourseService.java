package app.course;

import app.enrollment.Enrollment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseService {

    private ArrayList<Course> listaCourses;
    private File coursesFile;

    public CourseService() {
        listaCourses = new ArrayList<>();
        coursesFile = new File("C:\\mycode\\initiere-structuri\\StudentBook\\src\\app\\course\\courses.txt");
        loadCourse();
    }


    public Course getCourseById(int courseID) {
        for(int i = 0; i < listaCourses.size(); i++) {
            if(listaCourses.get(i).getId()==courseID) {
                return listaCourses.get(i);
            }
        }
        return null;
    }
    public Course getCourseByName(String courseName) {
        for(int i = 0; i < listaCourses.size(); i++) {
            if(listaCourses.get(i).getName().equals(courseName)) {
                return  listaCourses.get(i);
            }
        }
        return null;
    }
    public void createCurs(String name,String depart) {
        int x = listaCourses.size();
        Course courseNew = new Course();
        courseNew.setId(1001+x);
        courseNew.setName(name);
        courseNew.setDepartment(depart);
        listaCourses.add(courseNew);
        saveCourse(listaCourses);
    }

    private void loadCourse() {

        try{
            Scanner sc = new Scanner(coursesFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                try{
                    this.listaCourses.add(new Course(line));
                }catch(Exception e){
                    e.printStackTrace();
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    private void saveCourse(ArrayList<Course> listaCourses) {
        try{
            FileWriter fw = new FileWriter(coursesFile);
            PrintWriter pw = new PrintWriter(fw);
            for(Course course : this.listaCourses){
                pw.println(course.toString());
            }
            pw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void saveCourse(){
        try {
            FileWriter fw = new FileWriter(coursesFile);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(this.toString());
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


