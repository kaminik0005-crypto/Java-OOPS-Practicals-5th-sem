package oops_practicals;


class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


class Payment {

    void calculatePay() {
        System.out.println("Calculating payment");
    }
}


class FullTimeEmployee extends Payment {

    @Override
    void calculatePay() {
        System.out.println("Full Time Employee Salary = 30000");
    }
}


class PartTimeEmployee extends Payment {

    @Override
    void calculatePay() {
        System.out.println("Part Time Employee Salary = 15000");
    }
}

public class practical4_polymorphism {

    public static void main(String[] args) {

        System.out.println("METHOD OVERLOADING");

        Calculator c = new Calculator();

        System.out.println("Addition of two numbers = " + c.add(10, 20));

        System.out.println("Addition of three numbers = " + c.add(10, 20, 30));

        System.out.println("Addition of decimal numbers = " + c.add(5.5, 4.5));


        System.out.println("\nMETHOD OVERRIDING");

        Payment p;

        p = new FullTimeEmployee();
        p.calculatePay();

        p = new PartTimeEmployee();
        p.calculatePay();
    }
}
