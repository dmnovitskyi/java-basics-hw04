public class ContractedEmployee extends Employee{
  private String federalTaxId;
  private double hourlyRate;
  private double numberOfHoursWorked;
  // TODO fix class declaration and declare variables here

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super (employeeId,name);
    this.federalTaxId = federalTaxId;
   // TODO fill in code here
  }

  public String getFederalTaxId() {
    return federalTaxId;
    // TODO fill in code here and replace the return statement
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public double getHourlyRate() {
    return hourlyRate;
    // TODO fill in code here and replace the return statement
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
    // TODO fill in code here
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
    // TODO fill in code here and replace the return statement
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
    // TODO fill in code here
  }
  @Override
  public void calculatePay(){
    averageMonthlySalary = hourlyRate * numberOfHoursWorked;
  }
  @Override
  public String toString(){
    return
            "Employee ID'" + employeeId + "/n" +
            "Name:" + name + "/n" +
            "Federal tax ID:" + federalTaxId + "/n" +
            "Hourly Rate:" + hourlyRate + "/n" +
            "Working Hours:" + numberOfHoursWorked + "/n" +
            "Average Monthly Salary:" + String.format("%.2f", averageMonthlySalary);
  }
  // TODO fill in code here
}
