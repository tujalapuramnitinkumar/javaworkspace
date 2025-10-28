/*Definition:
Inheritance allows a class (child/subclass) to use the properties and methods of another class (parent/superclass). */
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        Child obj = new Child();
        //
        obj.show();    // inherited method
        obj.display(); // own method
    }
}
/*Types of Inheritance in Java:

Single (A -> B)

Multilevel (A -> B -> C)

Hierarchical (A -> B and A -> C)
(Multiple inheritance is not supported using classes — only interfaces) */