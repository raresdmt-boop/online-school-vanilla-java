package app.enrollment;

public class Enrollment {

    private int id;
    private int courseID;
    private int studentID;
    private String createdAt;

    public Enrollment(){
        System.out.println("Constructor fara parametri Enrollment");
    }
    public Enrollment(int id, int courseID, int studentID, String createdAt) {
        setID(id);
        setCourseID(courseID);
        setStudentID(studentID);
        setCreatedAt(createdAt);
    }
    public Enrollment(String line){
        String[] props = line.split(",");
        setID(Integer.parseInt(props[0]));
        setCourseID(Integer.parseInt(props[1]));
        setStudentID(Integer.parseInt(props[2]));
        setCreatedAt(props[3]);
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        validateID(id);
        this.id= id;
    }
    public int getCourseID(){
        return courseID;
    }
    public void setCourseID(int courseID){
        validateCourseID(courseID);
        this.courseID= courseID;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        validateStudentID(studentID);
        this.studentID= studentID;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String createdAt){
        validateCreatedAt(createdAt);
        this.createdAt = createdAt;
    }

    @Override
    public String toString(){
        return this.id+","+this.courseID+","+this.studentID+","+this.createdAt;
    }


    private void validateID(int id){
        if(id<1){
            throw new IllegalArgumentException("Invalid ID");
        }
    }
    private void validateCourseID(int id){
        if(id<1){
            throw new IllegalArgumentException("Invalid Course ID");
        }
    }
    private void validateStudentID(int id){
        if(id<1){
            throw new IllegalArgumentException("Invalid Student ID");
        }
    }
    private void validateCreatedAt(String createdAt){
        if(createdAt==null){
            throw new IllegalArgumentException("Created At cannot be null");
        }
    }
}
