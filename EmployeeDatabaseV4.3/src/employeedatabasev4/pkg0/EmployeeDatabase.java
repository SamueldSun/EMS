/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabasev4.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class EmployeeDatabase {

    private static EmployeeDatabase instance;
    private String employeeNumber;    
    
    public static EmployeeDatabase getInstance() {
        return instance == null ? instance = new EmployeeDatabase() : instance;
    }
    
    private HashTableEmpInfo theHashTable;
    private int numberOfBuckets = 10;
    private String numEmployees;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu newWindow = new MainMenu();
        newWindow.setVisible(true);
        System.out.println("Opened AddEmployee");
    }    
    
    public EmployeeDatabase() {
        theHashTable = new HashTableEmpInfo(numberOfBuckets);
    }
    
    public void addEmployee(EmployeeInfo emp) {
        theHashTable.addEmployee(emp);
    }
    
    public void printHashTable() {
        System.out.println(theHashTable.toString());
    }
    
    public ArrayList<EmployeeInfo> getAllEmployees() {
        return theHashTable.getAllEmployees();
    }
    
    public ArrayList<EmployeeInfo> getSearchEmployees(String term, String type) {
        return theHashTable.searchEmployees(term, type);
    }
    
    public void removeEmployee(EmployeeInfo emp) {
        theHashTable.removeEmployee(emp.getEmployeeNumber());
    }
    
    public boolean saveDatabase() {
        return theHashTable.saveDatabaseToFile();
    }
    public boolean loadDatabase() {
        return theHashTable.readDatabaseFromFile();
    }
    
    public String getSearchEmployeeNumber() {
        System.out.println("Employee Number got is: " + employeeNumber);
        return employeeNumber;
    }
    public void setSearchEmployeeNumber(String employeeNumber) {
        System.out.println("Employee Number set to: " + employeeNumber);
        this.employeeNumber = employeeNumber;
    }
}
