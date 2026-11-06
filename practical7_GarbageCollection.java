package oops_practicals;

class Student {

    Student() {
        System.out.println("Student object is created");
    }

    void study() {
        System.out.println("Student is studying");
    }
}

public class practical7_GarbageCollection {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.study();

        s1 = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
