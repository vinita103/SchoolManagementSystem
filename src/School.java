import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    // creating instance of teacher

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    // Create method to get Teachers 

    public List<Teacher> getTeachers() {
        return teachers;
    }

     // Create method to add  Teachers to the list

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);

    //   create   Method to get students
    }

    public List<Student> getStudents() {
        return students;
    }

       // Create method to add  Teachers to the list

    public void addStudents(Student student) {
        students.add(student);
    }

    // create method to get money earned

    
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // update total money earned static method 

    public static void updateTotalMoneyEarned(int moneyEarned) {
       
        totalMoneyEarned += moneyEarned;
    }

    // method to get money spent 

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

// updating the total money spent

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

}
