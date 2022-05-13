import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating instances of Class Teacher

        Teacher maria = new Teacher(1, "Maria", 5000);
        Teacher sonia = new Teacher(2, "Sonia", 7000);
        Teacher mary = new Teacher(3, "Mary", 6000);

        List<Teacher> teacherList = new ArrayList<>();

        // adding teachers to Array list

        teacherList.add(maria);
        teacherList.add(sonia);
        teacherList.add(mary);

        // Creating instances of Class Student

        Student john = new Student(1, "John", 4);
        Student sam = new Student(2, "Sam", 3);
        Student julie = new Student(3, "Julie", 5);

        List<Student> studentList = new ArrayList<>();

        // adding Students to Array list

        studentList.add(john);
        studentList.add(sam);
        studentList.add(julie);

        // creating instance of School class

        School cms = new School(teacherList, studentList);

        john.payFees(4000);
        sam.payFees(4500);
        julie.payFees(5000);

        

        System.out.println("CMS has earned $" + cms.getTotalMoneyEarned());

        maria.receiveSalary(maria.getSalary());

        System.out.println(
                "CMS has spent  for salary to " + maria.getName() + " and now has $" + cms.getTotalMoneyEarned());

        sonia.receiveSalary(sonia.getSalary());

        System.out.println(
                "CMS has spent  for salary to " + sonia.getName() + " and now has $" + cms.getTotalMoneyEarned());

        System.out.println(maria);
        System.out.println(sam);

    }

}