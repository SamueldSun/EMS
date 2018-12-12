/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Samuel Sun
 */
public class EmployeeInfo {

    public String firstName;
    public String lastName;
    public String yearBorn;
    public String monthBorn;
    public String dayBorn;
    // public int employeeNumber;

    public EmployeeInfo() {
        firstName = "A";
        lastName = "Z";
        yearBorn = "1979";
        monthBorn = "12";
        dayBorn = "31";
        // employeeNumber = -1;
    }
    
    // public EmployeeInfo(String fN, String lN, int bY, int bM, int bD, int eN)
    public EmployeeInfo(String fN, String lN, String yB, String mB, String dB) {
        firstName = fN;
        lastName = lN;
        yearBorn = yB;
        monthBorn = mB;
        dayBorn = dB;
        // employeeNumber = eN;
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

/*
    public void setEmployeeNumber(int eN) {
        if (eN < 0) {
            employeeNumber = -1;
        } else {
            employeeNumber = eN;
        }
    }
*/
}
