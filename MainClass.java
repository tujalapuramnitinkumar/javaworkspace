                        // predefined factory methods 
class students
{
    int id=10;
    String name="nitin";
    double fees=1000.0;
    public void branch()
                    // method of class students 
    {
        System.out.println("in branch method");
    }
}
                // Main class to demonstrate reflection
public class MainClass {
            // main method 
public static void main(String[] args) throws Exception
            // main method 
{
    Class c = Class.forName("students");                       // Load the students class
    Object o = c.newInstance();                                         // Create an instance of students
    students s = (students)o;                                          // Cast the object to students type
    System.out.println( "details of student " );                    // Print student details
    System.out.println(s.id + " - " + s.name + " - " + s.fees);      // Print id, name, and fees
    s.branch();                                                     // Call the branch method 
}
} 
                                        // End of MainClass