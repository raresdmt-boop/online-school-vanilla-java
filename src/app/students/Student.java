package app.students;

public class Student {

    public int id;
    String firstName;
    String lastName;
    String email;
    String password;
    int age;

    public String descriere(){
        String raspuns="Seria: "+this.id+"\n";
        raspuns+="Studentul "+this.firstName +" "+this.lastName;
        raspuns+="\nVarsta: "+this.age;
        raspuns+="\nEmail: "+this.email;
        return raspuns;
    }
}
