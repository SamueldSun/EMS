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

    public EmployeeInfo() {
        firstName = "John";
        lastName = "Smith";
        yearBorn = "1970";
        monthBorn = "01";
        dayBorn = "01";
    }

    public EmployeeInfo(String fN, String lN, String yB, String mB, String dB) {
        firstName = fN;
        lastName = lN;
        yearBorn = yB;
        monthBorn = mB;
        dayBorn = dB;
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
}

