/*Meaning:
Wrapping data (variables) and code (methods) into a single unit — class — and protecting it using getters and setters.
***--->Encapsulation = Data hiding + Access through public methods */
class Employee {
    private int salary; // private variable

    // setter
    public void setSalary(int s) {
        salary = s;
    }

    // getter
    public int getSalary() {
        return salary;
    }
}

class MainExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(50000);
        System.out.println(e.getSalary());
    }
}
