// run all four method types in a single Java program
public class MethodTypes {

    // 1. Without parameters and without return
    public void methodOne() {
        int a = 10, b = 20;
        int res = a + b;
        System.out.println("1. Without parameters & without return: Sum = " + res);
    }

    // 2. Without parameters and with return
    public int methodTwo() {
        int a = 30, b = 40;
        int res = a + b;
        return res;
    }

    // 3. With parameters and without return
    public void methodThree(int a, int b) {
        int res = a + b;
        System.out.println("3. With parameters & without return: Sum = " + res);
    }

    // 4. With parameters and with return
    public int methodFour(int a, int b) {
        int res = a + b;
        return res;
    }

    // Main method to call all
    public static void main(String[] args) {
        MethodTypes obj = new MethodTypes();

        // Call method 1
        obj.methodOne();

        // Call method 2
        int result2 = obj.methodTwo();
        System.out.println("2. Without parameters & with return: Sum = " + result2);

        // Call method 3
        obj.methodThree(50, 60);

        // Call method 4
        int result4 = obj.methodFour(70, 80);
        System.out.println("4. With parameters & with return: Sum = " + result4);
    }
}