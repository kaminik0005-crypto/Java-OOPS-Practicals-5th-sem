package oops_practicals;


interface Printable {
    void print();
}


interface Scannable {
    void scan();
}


class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}


class Machine {
    public void start() {
        System.out.println("Machine is starting...");
    }
}


class SmartPrinter extends Machine implements Printable {

    public void print() {
        System.out.println("Smart printer is printing...");
    }
}


public class practical3_Interface {

    public static void main(String[] args) {

        System.out.println("MULTIPLE INHERITANCE");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println();

        System.out.println("HYBRID INHERITANCE");

        SmartPrinter smart = new SmartPrinter();
        smart.start();
        smart.print();
    }
}
