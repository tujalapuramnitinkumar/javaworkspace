class Main {

    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Main obj = new Main();   // object creation6
        int result = obj.add(50, 30);
        System.out.println("Sum Of a+b: " + result);
    }
}
