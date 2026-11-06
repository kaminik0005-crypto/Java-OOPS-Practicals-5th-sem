package oops_practicals;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is moving");
    }
}

class Person {
    void showPerson() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a manager");
    }
}

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = " + (10 * 5));
    }
}

public class practical2_Inheritance {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println("\nHierarchical Inheritance:");
        Circle cr = new Circle();
        cr.display();
        cr.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
