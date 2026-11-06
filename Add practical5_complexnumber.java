package oops_practicals;


class ComplexNumber {

    double real;
    double imaginary;

    
    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    
    ComplexNumber add(ComplexNumber c) {

        double realSum = real + c.real;
        double imaginarySum = imaginary + c.imaginary;

        return new ComplexNumber(realSum, imaginarySum);
    }

    
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}


public class practical5_complexnumber {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(4, 2);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.println("Addition of Complex Numbers:");
        result.display();
    }
}
