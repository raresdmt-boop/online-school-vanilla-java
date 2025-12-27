package app.course;

public class Course {

    private int id;
    private String name;
    private String department;

    public Course(){
        System.out.println("Course default constructor");
    }
    public Course(int id, String name, String department) {
        setId(id);
        setName(name);
        setDepartment(department);

    }
    public Course(String line) {
        String [] props = line.split(",");
        setId(Integer.parseInt(props[0]));
        setName(props[1]);
        setDepartment(props[2]);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        validateId(id);
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        validateName(name);
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        validateDepartment(department);
        this.department = department;
    }

    @Override
    public String toString(){
        return this.id+","+this.name+","+this.department;
    }

    private void validateId(int id){
        if(id<1){
            throw new IllegalArgumentException("Invalid id!");
        }
    }
    private void validateName(String name){
        if(name==null){
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }
    private void validateDepartment(String department){
        if(department==null){
            throw new IllegalArgumentException("Department cannot be null!");
        }
    }
}
