package app.books;

public class Books {

    int id;
    int studentID;
    public String bookName;
    String createdAt;

    public String descriere(){
        String raspuns="ID "+this.id;
        raspuns+="Student ID "+this.studentID;
        raspuns+="Book Name "+this.bookName;
        raspuns+="Created at "+this.createdAt;
        return raspuns;
    }
}
