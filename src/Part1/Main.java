 package Part1;

public class Main {
    static void main() {
        // you can add the final to the object creation too
        //1--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // real world object banake property kko use karo;
        Student data = new Student();
        // data is the reference variable.
//        data.name = "Abhinav"; // here i call the name and then i give it a string value;
//        System.out.println(data.name);
//        data.location = "Sikkim"; // more in detail what i do is
        /* i have an object with the name "data"
        * and what i want to do is that i want to access the property of a class okay
        * also to get the properties (name , location , age , salary ) of the class i need an object
        * why i need it ? 'cause i want to store the data of the student
        * now to connect the property of the class student and with the object data
        * i follow the syntax -> your object ( the real world entity , the data that you have ) then the connector "." and then the class property that you want to access
        * so it becomes like
        * data.age
        * now i have the access of the property
        * now you can do any of your operations assign real world entity or print it use it... */
//        data.age = 19;
        System.out.println(data.name+" age is "+data.age);
        /*in one line -> to access the property you need to make an real world object to put that property in it and then assign the property's data*/

        //2--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // now i want another object to have the same property of the student but different data , values;
        Student data2 = new Student();
        //        data2.name = "Rahul";
        //        data2.location = "Arunachal";
        //        data2.age = 19;
        System.out.println(data2.name+" age is "+data2.age);
        // like wise i have another real world object with the same properties of the Student but different values;
        data2.thisIsAPrintStatement();
        // my opject . property i want to access

        //3--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Student data3 = new Student(data2);
        System.out.println("First standing student is "+data3.name+"\n");

        //4--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Student firstObject = new Student("Abhinav Puri", 19,"Rhenock, Sikkim", 100000 );
        System.out.println(" the data of the first object having the universal properties are "+firstObject.name+" age is "+firstObject.age+" location is "+ firstObject.location+" and salary is "+firstObject.salary+"\n");
        //like wise i can make another object secondObject with the same properties of the student class assigning it with its data in the parameter "template made"
        Student secondObject = new Student("Aakanksha Puri", 17,"Arunachal", 200000 );
        System.out.println(" the data of the second object having the universal properties are "+secondObject.name+" age is "+secondObject.age+" location is "+ secondObject.location+" and salary is "+secondObject.salary+"\n");
        secondObject.thisIsAPrintStatement(); // here the data of the object goes
        // ...... and likewise as many as you want to
        //5--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //here i need to copy the data of the data3 to the data4 also combine it with data1 using name2 location2 the age2 and salary2 (task)
        // 1. make a data4 object 2. the make a constructor with the two parameters 3. make the instance variable connect then using the Student <temp var> , student <temp var>
        Student data4 = new Student(data, data3);
        System.out.println(
                "First name from data 1: "+ data4.name+
                        " Second name from data 3: "+ data4.name2+"\n"+
                        "First location from data 1: "+ data4.location+"\n"+
                        "Second Location from data 2: "+ data4.location2+"\n"+
                        "data 1 age: "+ data4.age +" data 3 age: "+ data4.age2+"\n"+
                        "data 1 Salary: "+ data4.salary+ " data 3 Salary: "+ data4.salary2
        );
        //6--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // this is to call one constructor to another constructor
        Student callAnotherConstructor = new Student();
        System.out.println("Call from one constructor to another constructor "+callAnotherConstructor.location);
       //7>--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
}
class Student{
    //property banao;
    String name;
    String location;
    int age;
    float salary;
    //new instance variable ... i mean new properties that the objects will have
    String name2;
    String location2;
    int age2;
    float salary2;
    //-------------------------------------------------------------------------------------
    // first object Constructor
        Student(String objName, int objAge, String objLocation , float objSalary){ // to assign all the data this is what i made "A TEMPLATE" for all
        this.name = objName;
        this.salary = objSalary;
        this.age = objAge;
        this.location = objLocation;
    }
    // first object method
    //-------------------------------------------------------------------------------------
    void thisIsAPrintStatement(){
        System.out.println("from the thisIsAPrintStatement "+ this.salary+"\n");
        // Whichever real object calls this function, HIS salary will be printed
    }
    Student() {
        // constructor will give the same data to each object with the class properties.
        // this.name = "Abhinav Puri"; // got replaced with
        this.name = "Rahul"; // <-
        this.location = "Sikkim, Rhenock";
        this.age = 19;
        this.salary = 50000f;
        this("Rohit", 344, "oklohoma", 6474);
    }
    Student( Student standsFirst ){ // so we need the data of an other student (data2) to put it in the data 3
      //⬆️ matlab Is student jiska ek parameter hai usska name property me data2 ka name property ka data dal do
        // read it again
        this.name = standsFirst.name;
        this.location = standsFirst.location;
        this.age = standsFirst.age;
        this.salary = standsFirst.salary;
    }
    Student( Student combineData1 , Student combineData2 ){
            // this basically refers to what object we are referring to
            this.name = combineData1.name;
            this.location = combineData1.location;
            this.age = combineData1.age;
            this.salary = combineData1.salary;
            this.name2 = combineData2.name;
            this.location2 = combineData2.location;
            this.age2 = combineData2.age;
            this.salary2 = combineData2.salary;
    }
}