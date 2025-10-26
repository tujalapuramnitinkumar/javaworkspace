class Example1
{
    public static void main(String[] args) 
    {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[0]);  // Output: 10

        // Access and print each element in the array
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
            // Modify an element in the array
            for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

         // Change the third element from 30 to 35
            numbers[2] = 35;
            System.out.println("Modified element at index 2: " + numbers[2]);  // Output: 35

            // String examples
            String name = "Nitin";
            String city = new String("Hyderabad");
            String str = "Java";
            System.out.println("Length: " + str.length());
            System.out.println("Upper: " + str.toUpperCase());
            System.out.println("Char at 2: " + str.charAt(2));
            // Concatenate strings
            String greeting = "Hello, " + name + " from " + city;
            System.out.println(greeting);        
    }
}
// Output:
// 10
// Element at index 0: 10
// Element at index 1: 20
// Element at index 2: 30
// Element at index 3: 40
// Element at index 4: 50
// 10
// 20
// 30
// 40
// 50
// Modified element at index 2: 35
// Length: 4
// Upper: JAVA
// Char at 2: v
// Hello, Nitin from Hyderabad  
                            // End of Example1.java....