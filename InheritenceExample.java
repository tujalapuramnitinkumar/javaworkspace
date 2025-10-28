/*Definition:
Inheritance allows a class (child/subclass) to use the properties and methods of another class (parent/superclass). */
class Parent {
    public void show() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
   public void display() {
        System.out.println("Child class");
    }
   }
    class InheritanceExample{
    public static void main(String[] args) {
        Child obj = new Child();
        //
        obj.show();    // inherited method
        obj.display(); // own method
    }
}