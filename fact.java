import java.util.*;
public class fact {
    public static int factorial(int f) {
        int c=1;
           for(int i=1;i<=f;i++)
           {
            c=c*i;
           }
           return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=factorial(a);
        System.out.println(b);
    }
}
