package JavaBook.Generics;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    public void add(T t){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }

    public void printName() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = (T) "Not filled yet";
            }
            System.out.println("Student " + i + ": " + students[i]);
        }
    }

    @Override
    public String toString() {
        return "In " + name + " course, there are " + students.length + " students.";
    }
}
