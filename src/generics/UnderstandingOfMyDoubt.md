# Understanding the `toString()` implementation

- when we call the toString() the toString is the method from the objcet class and the object class is the most parent class of all the classes
- therefore the parent class doesn't know anything about the child class but the child class can know what are the data and the members that is present there in the parent class
- when we do
```java
class Student {
  String name;
  int age;
}
```
and then
Now:

```java
Student s = new Student();
System.out.println(s);
```

What should print?

Java does not know:

only name?
age?
full details?
JSON format?
XML?
ID card style?

So default Object says:

```terminaloutput
Student@x8392`
```

- Soo to provide the context of how the data should be printed and what is the data we do the Overriding stuff where the toString for the current
class gets overridden and due to the Dynamic Method Dispatch during the runtime the to string of the `Student` class gets run
- therefore we do it as this way :
```java
@Override
public String toString() {
    return name + " " + age;
}
```
- now the java during the runtime know what and how to print the data 
- By this when the `toString` is eventually called the overridden method here in this class gets printed!