package ex98;

public class Student {
    private String name;

    //Create a constructor with arguments
    public Student(String name) {
        this.name = name;
    }

    //Create a constructor without arguments
    public Student() {
        this("Irfan");
    }

    public void setName(String name) {
//this is correct if you want to use the same namethis.name =name;
    }

    public String getName() {
        return this.name;
    }
}