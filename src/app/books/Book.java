package app.books;

public class Book {

    int id;
    public int studentID;
    public String bookName;
    public String createdAt;

    public String descriere(){
        String raspuns="ID "+this.id;
        raspuns+="Student ID "+this.studentID;
        raspuns+="Book Name "+this.bookName;
        raspuns+="Created at "+this.createdAt;
        return raspuns;
    }
}
