// Non-static Method
class Example2 {
    void greet() {
        System.out.println("Hi there!");
    }
    public static void main(String[] args) {
        Example2 d = new Example2();
        d.greet(); // called using object
    }
}
//end....