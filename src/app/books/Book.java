package app.books;

public class Book {

    private int id;
    private int studentID;
    private String bookName;
    private String createdAt;

    public Book(String line){
        String [] props = line.split(",");
        setId(Integer.parseInt(props[0]));
        setStudentID(Integer.parseInt(props[1]));
        setBookName(props[2]);
        setCreatedAt(props[3]);
    }
    public Book(int id, int studentID, String bookName, String createdAt){
        setId(id);
        setStudentID(studentID);
        setBookName(bookName);
        setCreatedAt(createdAt);
    }
    public Book(){
        System.out.println("Constructor fara parametri");
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        validateID(id);
        this.id = id;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        validateID(studentID);
        this.studentID = studentID;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        validateBookName(bookName);
        this.bookName = bookName;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        validateCreatedAt(createdAt);
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return this.id+","+this.studentID+","+this.bookName+","+this.createdAt;
    }


    private void validateBookName(String bookName){
        if(bookName.isEmpty()){
            throw new IllegalArgumentException("Book Name cannot be empty");
        }
    }
    private void validateID(int id){
        if(id<1){
            throw new IllegalArgumentException("Student ID must be greater than 0");
        }
    }
    private void validateCreatedAt(String createdAt){
        if(createdAt.isEmpty()){
            throw new IllegalArgumentException("Created At cannot be empty");
        }
}



}