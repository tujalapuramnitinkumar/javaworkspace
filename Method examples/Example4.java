// Method with parameters and with return statement
public class Example4 {
    public int methodOne(int a, int b) {
        int res = a + b;
        return res;
    }

    public static void main(String[] args) {
        Example4 obj = new Example4();
        int result = obj.methodOne(1000, 2220);
        System.out.println("Sum = " + result);
    }
} 
