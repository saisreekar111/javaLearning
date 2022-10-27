public class Student implements Comparable<Student>{
    private String name;
    private int id;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
public String toString(){
        return id + "#"+ name;
}

    public int compareTo(Student that) {
        //return Integer.compare(this.id , that.id);
        return Integer.compare(that.id , this.id);
    }
}
