package employeedatabasev3.pkg0;

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
    
    private String employeeStatus; // Let 0 be part-time, 1 be full-time
    private String firstName;
    private String lastName;
    private String yearBorn;
    private String monthBorn;
    private String dayBorn;
    
    private String employeeNumber;
    private String workLocation;
    private String department;

    public EmployeeInfo() {
        employeeStatus = "0";
        firstName = "John";
        lastName = "Smith";
        yearBorn = "1970";
        monthBorn = "01";
        dayBorn = "01";
        
        employeeNumber = "123456";
        workLocation = "Toronto";
        department = "Accounting";
    }

    public EmployeeInfo(String eS, String fN, String lN, String yB, String mB, String dB, String eN, String wL, String d) {
        employeeStatus  = eS;
        firstName = fN;
        lastName = lN;
        yearBorn = yB;
        monthBorn = mB;
        dayBorn = dB;
        
        employeeNumber = eN;
        workLocation = wL;
        department = d;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
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
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public String getWorkLocation() {
        return workLocation;
    }
    public String getDepartment() {
        return department;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
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
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

