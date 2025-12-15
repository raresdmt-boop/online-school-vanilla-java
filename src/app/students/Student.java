package app.students;

public class Student {

    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public int age;

    public String descriere(){
        String raspuns="Seria: "+this.id+"\n";
        raspuns+="Studentul "+this.firstName +" "+this.lastName;
        raspuns+="\nVarsta: "+this.age;
        raspuns+="\nEmail: "+this.email;
        return raspuns;
    }
}
