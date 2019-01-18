package employeedatabasev4.pkg0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class EmployeeInfo {
    
    private String firstName;
    private String lastName;
    private String yearBorn;
    private String monthBorn;
    private String dayBorn;
    
    private int employeeNumber;
    private String workLocation;
    private String department;
    
    private double deductRate; // percentage

    public EmployeeInfo() { // Test constructor
        firstName = "John";
        lastName = "Smith";
        yearBorn = "1970";
        monthBorn = "01";
        dayBorn = "01";
        
        employeeNumber = 123456;
        workLocation = "Toronto";
        department = "Accounting";
        
        deductRate = 32; 
    }

    public EmployeeInfo(String fN, String lN, String yB, String mB, String dB, int eN, String wL, String d, double dR) {
        firstName = fN;
        lastName = lN;
        yearBorn = yB;
        monthBorn = mB;
        dayBorn = dB;
        
        employeeNumber = eN;
        workLocation = wL;
        department = d;
        
        deductRate = dR;
    }
    
    public double getAnnualGrossIncome() {
        return 0;
    }
    public double getAnnualDeduction() {
        return getAnnualGrossIncome() * (deductRate/100);
    }
    public double getAnnualNetIncome() {
        return getAnnualGrossIncome() - getAnnualDeduction();
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getYearBorn() {
        return yearBorn;
    }
    public String getMonthBorn() {
        return monthBorn;
    }
    public String getDayBorn() {
        return dayBorn;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public String getWorkLocation() {
        return workLocation;
    }
    public String getDepartment() {
        return department;
    }
    public double getDeductRate() {
        return deductRate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYearBorn(String yearBorn) {
        this.yearBorn = yearBorn;
    }
    public void setMonthBorn(String monthBorn) {
        this.monthBorn = monthBorn;
    }
    public void setDayBorn(String dayBorn) {
        this.dayBorn = dayBorn;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setDeductRate(double deductRate) {
        this.deductRate = deductRate;
    }
}

