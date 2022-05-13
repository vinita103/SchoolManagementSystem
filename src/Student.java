public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Creating a new student object by initializing using constructo and parameters
    // assigning fees for every student is $30,000
    // assigning Fees paid initially is 0.

    public Student(int id, String name, int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 20000;

    }

    // Method to get ID of Student 

    public int getId() {
        return id;
        
    }

      // Method to get name of Student 

    public String getName() {
        return name;
    }

      // Method to get grade of Student 

    public int getGrade() {
        return grade;
    }
  // Method to get Fees paid of Student 

    public int getFeesPaid() {
        return feesPaid;
    }

  // Method to get total fees of Student 

    public int getFeesTotal() {
        return feesTotal;
    }
      // Method to calculate the fees paid by Student/ upates fees paid 
    //   updates total money earned 

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

      // Method to get remaining fees due to student

    public int getRemainingFees() {
        return feesTotal - feesPaid;

    }

    @Override

    public String toString() {
        return "Student's name : " + name + " Total Fees paid so far $" + feesPaid;
    }

}
