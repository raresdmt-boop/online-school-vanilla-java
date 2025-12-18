package app.enrollment;

import java.util.ArrayList;

public class EnrollmentService {
    ArrayList<Enrollment> enrollmentsList = new ArrayList<Enrollment>();

    public void loadEnrollments() {

        Enrollment e1 = new Enrollment();
        e1.id = 1;
        e1.courseID = 101;
        e1.studentID = 1;
        e1.createdAt = "2022-01-10";

        Enrollment e2 = new Enrollment();
        e2.id = 2;
        e2.courseID = 102;
        e2.studentID = 2;
        e2.createdAt = "2022-01-15";

        Enrollment e3 = new Enrollment();
        e3.id = 3;
        e3.courseID = 103;
        e3.studentID = 3;
        e3.createdAt = "2022-02-01";

        Enrollment e4 = new Enrollment();
        e4.id = 4;
        e4.courseID = 101;
        e4.studentID = 4;
        e4.createdAt = "2022-02-10";

        Enrollment e5 = new Enrollment();
        e5.id = 5;
        e5.courseID = 102;
        e5.studentID = 5;
        e5.createdAt = "2022-03-05";

        Enrollment e6 = new Enrollment();
        e6.id = 6;
        e6.courseID = 102;
        e6.studentID = 6;
        e6.createdAt = "2022-03-20";

        Enrollment e7 = new Enrollment();
        e7.id = 7;
        e7.courseID = 102;
        e7.studentID = 7;
        e7.createdAt = "2022-04-01";

        Enrollment e8 = new Enrollment();
        e8.id = 8;
        e8.courseID = 102;
        e8.studentID = 8;
        e8.createdAt = "2022-04-15";

        Enrollment e9 = new Enrollment();
        e9.id = 9;
        e9.courseID = 103;
        e9.studentID = 9;
        e9.createdAt = "2022-05-01";

        Enrollment e10 = new Enrollment();
        e10.id = 10;
        e10.courseID = 101;
        e10.studentID = 9;
        e10.createdAt = "2022-05-20";

        Enrollment e11 = new Enrollment();
        e11.id = 11;
        e11.courseID = 102;
        e11.studentID = 9;
        e11.createdAt = "2022-06-01";

        Enrollment e12 = new Enrollment();
        e12.id = 12;
        e12.courseID = 103;
        e12.studentID = 2;
        e12.createdAt = "2022-06-10";

        Enrollment e13 = new Enrollment();
        e13.id = 13;
        e13.courseID = 101;
        e13.studentID = 3;
        e13.createdAt = "2022-07-01";

        Enrollment e14 = new Enrollment();
        e14.id = 14;
        e14.courseID = 102;
        e14.studentID = 4;
        e14.createdAt = "2022-07-15";

        Enrollment e15 = new Enrollment();
        e15.id = 15;
        e15.courseID = 103;
        e15.studentID = 5;
        e15.createdAt = "2022-08-01";

        enrollmentsList.add(e1);
        enrollmentsList.add(e2);
        enrollmentsList.add(e3);
        enrollmentsList.add(e4);
        enrollmentsList.add(e5);
        enrollmentsList.add(e6);
        enrollmentsList.add(e7);
        enrollmentsList.add(e8);
        enrollmentsList.add(e9);
        enrollmentsList.add(e10);
        enrollmentsList.add(e11);
        enrollmentsList.add(e12);
        enrollmentsList.add(e13);
        enrollmentsList.add(e14);
        enrollmentsList.add(e15);

    }

    public void afisareEnrol(){
        for (int i = 0; i<enrollmentsList.size(); i++){
            System.out.println(enrollmentsList.get(i).toString());
        }
    }

}
