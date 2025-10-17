// Method with parameters and without return statement
public class Example3 {
    public void methodOne(int a, int b) {
        int res = a + b;
        System.out.println("Sum = " + res);
    }

    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.methodOne(1000000, 2000);
    }
}