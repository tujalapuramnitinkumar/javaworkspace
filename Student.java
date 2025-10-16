/* Simple Inheritance*/
class student // super class
{
    int roll, marks;
    String name;

    // private not work
    // protected work
    // public will work
    void input() {
        System.out.println("Enter roll name & marks: ");
    }
}

class nitin extends student // sub-class
{
    void disp() {
        roll = 111111;
        name = "nitin";
        marks = 989;
        System.out.println(roll + " name+ " + marks);
    }

    public static void main(String[] args) {
        nitin an = new nitin();
        an.input();
        an.disp();

    }
}
