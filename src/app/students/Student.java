package app.students;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;

    public Student(){
        System.out.println("Student default constructor");
    }
    public Student(int id, String firstName, String lastName, String email, String password, int age){
        setID(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setAge(age);
    }
    public Student(String line){
        String [] props = line.split(",");
        setID(Integer.parseInt(props[0]));
        setFirstName(props[1]);
        setLastName(props[2]);
        setEmail(props[3]);
        setPassword(props[4]);
        setAge(Integer.parseInt(props[5]));
    }


    public int getID(){
        return id;
    }
    public void setID(int id){
        validateID(id);
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        validateName(firstName);
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        validateName(lastName);
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        validateEmail(email);
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        validatePassword(password);
        this.password = password;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        validateAge(age);
        this.age = age;
    }


    @Override
    public String toString() {
        return this.id+","+this.firstName+","+this.lastName+","+this.email+","+this.password+","+this.age;
    }
    public String descriere(){
        String raspuns="Seria: "+this.id+"\n";
        raspuns+="Studentul "+this.firstName +" "+this.lastName;
        raspuns+="\nVarsta: "+this.age;
        raspuns+="\nEmail: "+this.email;
        return raspuns;
    }

    private void validateID(int id){
        if(id < 1){
            throw new IllegalArgumentException("Student ID should be greater than 0");
        }
    }
    private void validateName(String name){
        if(name == null){
            throw new IllegalArgumentException("Student firstName should not be null");
        }
    }
    private void validateEmail(String email){
        if(email == null|| !email.contains("@")){
            throw new IllegalArgumentException("Student email should be valid");
        }
    }
    private void validatePassword(String password){
        if(password == null){
            throw new IllegalArgumentException("Student password should not be null");
        }
    }
    private void validateAge(int age){
        if(age < 1){
            throw new IllegalArgumentException("Student age should be greater than 0");
        }
    }
}

