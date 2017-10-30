package Lab5;

public class Student {
    private static int numOfStudents = 0;
    private int age;
    private int id;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = numOfStudents;
        numOfStudents++;
    }

    public Student(Student s){
        id = s.id;
        age = s.age;
        name = s.name;
    }

    @Override
    public boolean equals(Object o){
        return true;
    }
}



