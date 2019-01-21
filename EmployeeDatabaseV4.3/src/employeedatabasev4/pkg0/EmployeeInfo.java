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
    
    private String typeWork;
    private double hourlyWage;
    private int hoursPerWeek;
    private int weeksPerYear;
    private double deductionRate; // percentage
    private double yearlySalary;

    public EmployeeInfo() { // Test constructor
        firstName = "John";
        lastName = "Smith";
        yearBorn = "1970";
        monthBorn = "01";
        dayBorn = "01";
        
        employeeNumber = 123456;
        workLocation = "Toronto";
        department = "Accounting";
        
        typeWork = "Part-Time";
        hourlyWage = 15;
        hoursPerWeek = 24;
        weeksPerYear = 50;
        deductionRate = 32;
        yearlySalary = 0;        
    }

    public EmployeeInfo(String fN, String lN, String yB, String mB, String dB, int eN, String wL, String d, String tW, double hW, int hPW, int wPY, double dR, double yS) {
        firstName = fN;
        lastName = lN;
        yearBorn = yB;
        monthBorn = mB;
        dayBorn = dB;
        
        employeeNumber = eN;
        workLocation = wL;
        department = d;
        
        typeWork = tW;
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        deductionRate = dR;
        yearlySalary = yS;
    }
    
    
    // Getter methods
    //  Personal Details
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
    // Work Details
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public String getWorkLocation() {
        return workLocation;
    }
    public String getDepartment() {
        return department;
    }
    // Wage Details
    public String getTypeWork() {
        return typeWork;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    public int getWeeksPerYear() {
        return weeksPerYear;
    }
    public double getDeductionRate() {
        return deductionRate;
    }
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    // Setter Methods
    //  Personal Details
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
    // Work Details
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    // Wage Details
    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    public void setWeeksPerYear(int weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }
    public void setDeductionRate(double deductRate) {
        this.deductionRate = deductRate;
    }
    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}

