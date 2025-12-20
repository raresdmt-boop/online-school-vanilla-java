package app.course;

import java.util.ArrayList;

public class CourseService {

    ArrayList<Course> listaCourses = new ArrayList<Course>();

    public void loadCourse() {

        Course course1 = new Course();

        course1.id = 101;
        course1.name = "Initiere Java";
        course1.department = "IT";

        Course course2 = new Course();

        course2.id = 102;
        course2.name = "Macroeconomie";
        course2.department = "Administrarea Afacerilor";

        Course course3 = new Course();
        course3.id = 103;
        course3.name = "Drept Civil";
        course3.department = "Drept";

        listaCourses.add(course1);
        listaCourses.add(course2);
        listaCourses.add(course3);

    }



    public void getCourseById(int courseID) {
        for(int i = 0; i < listaCourses.size(); i++) {
            if(listaCourses.get(i).id==courseID) {
                System.out.println(listaCourses.get(i).name);
            }
        }
    }

    public Course getCourseByName(String courseName) {
        for(int i = 0; i < listaCourses.size(); i++) {
            if(listaCourses.get(i).name.equals(courseName)) {
                return  listaCourses.get(i);
            }
        }
        return null;
    }

}
