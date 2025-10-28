// Example of a for-each loop in Java

class LoopExample4
{
    public static void main(String[] args) 
    { 
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int n : nums) 
        // for-each loop to iterate through the array
        {
             System.out.println("Number: " + n);
        }
    }
}
// Output:
 // Number: 1
 // Number: 2
 // Number: 3
 // Number: 4
 // Number: 5
 // Number: 6
 // Number: 7
 // Number: 8
 // Number: 9
 // Number: 10
 /*Key Points:
A for-each loop is used to iterate through elements in an array or collection.
The loop variable (n) takes the value of each element in the array sequentially.
The entry point is the main() method.
Statements end with a semicolon (;).
Curly braces {} define blocks of code.
The entry point is the main() method.    */