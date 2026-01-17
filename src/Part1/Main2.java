package Part1;

public class Main2 {
        // Method to print the name
        String anotherName = "name is abhinavpuri";
        static void main(String[] args) {
            Person firstMan = new Person();
            firstMan.printingANameOfAnObject();
            Main2 main2 = new Main2();
            main2.nextPrint();
    }
    void nextPrint(){
        System.out.println(this.anotherName);
    }
    }
class Person {
    String name = "rahul";
    String anotherName = "Abhinav";
    // Constructor
    Person() {
        this.name = "Aakanksha";
    }
    void printingANameOfAnObject() {
        System.out.println(this.anotherName);
        System.out.println("The name is " + name); // will the global variable be printed?????????
        System.out.println(" the name is "+ anotherName); // why is that the same name is being printed even of i have the different variables??????
        System.out.println("The name is " + this.name);
        // OR you can write: System.out.println("The name is " + name);
        // 'this' is optional here but makes it clearer
    }
    }