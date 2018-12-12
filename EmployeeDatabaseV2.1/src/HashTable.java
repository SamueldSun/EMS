/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Samuel Sun
 */
import java.lang.reflect.Array;
import java.util.*;

public class HashTable {
    /*
    public int numBuckets;

    ArrayList<EmployeeInfo>[] employeeList = new ArrayList[2];

    public void initializeHashTable() {
        for (int i = 0; i <= numBuckets - 1; i++) {
            employeeList[i] = new ArrayList<>();
        }
    }
    */
    ArrayList<String[]> employeeList = new ArrayList<String[]>();  
    
    public String[] newEntry;
    
    public void addToHashTable(EmployeeInfo itemToAdd) {
        String[] myNewEntry = new String[5];
        newEntry[0] = itemToAdd.getFirstName();
        newEntry[1] = itemToAdd.getLastName();
        newEntry[2] = itemToAdd.getYearBorn();
        newEntry[3] = itemToAdd.getMonthBorn();
        newEntry[4] = itemToAdd.getDayBorn();
        System.out.println(Arrays.toString(newEntry));
        employeeList.add(newEntry);
    }
    
    public void printHashTable() {
        System.out.println(employeeList.size());
        for(int i = 0; i < employeeList.size(); i++)
             System.out.println(Arrays.toString(employeeList.get(i)));
        // System.out.println(Arrays.toString(employeeList);
    }
/*
    public void printHashTable() {
        System.out.println(Arrays.toString(employeeList));
    } */
}
