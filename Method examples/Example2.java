// Method without parameters and with return statement
public class Example2 {
    public int methodOne() {
        int a = 100, b = 20000;
        int res = a + b;
        return res;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        int result = obj.methodOne();
        System.out.println("Sum = " + result);
    }
}
