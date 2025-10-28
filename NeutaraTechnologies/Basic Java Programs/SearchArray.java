import java.util.Scanner;

class SearchArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean found = false;
        for (int n : arr) {
            if (n == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
