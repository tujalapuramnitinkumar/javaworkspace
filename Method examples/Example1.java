// Method without parameters and without return statement
public class Example1 {
    public void methodOne() {
        int a = 10, b = 20;
        int res = a + b;
        System.out.println("Sum = " + res);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.methodOne();
    }
}
