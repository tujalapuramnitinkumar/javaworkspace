// A simple Java program to demonstrate the do-while loop
class LoopExample3 {
    public static void main(String[] args) 
    {
       int i = 1;
      do 
    {
        System.out.println("Number: " + i);
        i++;
    } while (i <= 5);
        
    }
}
// Output:
 // Number: 1
 // Number: 2
 // Number: 3
 // Number: 4
 // Number: 5
 /*Key Points:
A do-while loop executes the block of code at least once before checking the condition.
The loop variable (i) is initialized before the loop starts.
The loop variable is updated (incremented) inside the loop to eventually terminate the loop.
The entry point is the main() method.
Statements end with a semicolon (;).
Curly braces {} define blocks of code.
The entry point is the main() method.    */