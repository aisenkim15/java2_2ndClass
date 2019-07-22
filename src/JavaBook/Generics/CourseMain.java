package JavaBook.Generics;

public class CourseMain {

    public static void main(String[] args) {
        Course<String> courseList = new Course<>("English", 10);
        courseList.add("James");
        courseList.add("John");
        courseList.add("Jimmy");

        System.out.println(courseList);
        courseList.printName();
    }
}
