/*📘 Class in Java – Quality Notes
🔹 Definition

A class in Java is a blueprint or template used to create objects.

A class is a user-defined blueprint that groups data members and member functions into a single unit used to create objects.

It defines:

Data (variables / fields)

Behavior (methods)


🔹 Key Components of a Class

✔ Variables (Instance / Static)
✔ Methods
✔ Constructors
✔ Blocks
✔ Nested Classes


🔹 Types of Classes in Java

Concrete Class

Abstract Class

Final Class

Inner Class

Static Nested Class

🔹 Important Points

A Java file can contain multiple classes

Only one public class per file

Class name must match filename if public

🔹 Real-World Example

Car is a class
Engine, wheels, color are attributes
start(), stop() are behaviors

*/

class Student {
    int id;
    String name;

    void show() {
        System.out.println(id + " " + name);
    }
}

public class ClassExp {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Pravin";
        s.show();
    }
}
