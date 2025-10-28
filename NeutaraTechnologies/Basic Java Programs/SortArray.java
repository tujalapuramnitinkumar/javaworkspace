import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int n : arr)
            System.out.print(n + " ");
    }
}
