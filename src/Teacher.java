
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // creating a constructor for class Teacher

    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    // Create method to get ID of Teacher

    public int getId() {

        return id;
    }

        // Create method to get name of Teacher

    public String getName() {

        return name;
    }

        // Create method to get salary of Teacher

    public int getSalary() {

        return salary;

    }

    // setSalary method th set the salary for teacher as salary may change

    public void setsalary(int salary) {
        this.salary = salary;

    }

        // Create method to get sala of Teacher

    public void receiveSalary(int salary) {

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override

    public String toString() {

        return "Name of the teacher: " + name + " Total salary paid so far $" + salaryEarned;
    }

}
