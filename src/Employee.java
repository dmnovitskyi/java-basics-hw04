public class Employee implements Payable {

  protected String employeeId;
  protected String name;
  protected double averageMonthlySalary;
  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
   this.employeeId = employeeId;
   this.name = name;
    // TODO fill in code here
  }

  public String getEmployeeId() {
    return employeeId;
    // TODO fill in code here and replace the return statement
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
    // TODO fill in code here
  }

  public String getName() {
    return name;
    // TODO fill in code here and replace the return statement
  }

  public void setName(String name) {
    this.name = name;
    // TODO fill in code here
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
    // TODO fill in code here and replace the return statement
  }

  @Override
  public String toString() {
    return
            "Employee: " + employeeId + "/n" +
            "Name: " + name + "/n" +
            "Salary: " + averageMonthlySalary;
  }

  @Override
  public void calculatePay() {
    // TODO fill in code here and replace the return statement, be sure to format double value

  }
}


