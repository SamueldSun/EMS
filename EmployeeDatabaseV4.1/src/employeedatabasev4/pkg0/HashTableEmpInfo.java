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
public class HashTableEmpInfo {
    
    private ArrayList<EmployeeInfo>[] buckets;

    public HashTableEmpInfo(int numberOfBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[numberOfBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets[i] = new ArrayList<>();  // Instantiate the ArrayList for bucket i.
        }
    }

    @Override
    public String toString() {

        // Return string form of HashTable, including the employee numbers for 
        // the employees stored in each bucket's ArrayList, starting with 
        // bucket 0, then bucket 1, and so on.

        String output = "";
        
        for (int i = 0; i < buckets.length; i++) {

            // For the current bucket, print out the emp num for each item in its ArrayList.

            int listSize = buckets[i].size();
            output += "\nArrayList bucket " + i + ", size: " + listSize;

            if (listSize == 0) {
                output += "\n  Bucket Empty";
            }
            else {

                for (int j = 0; j < listSize; j++) {
                    int theEmpNum = buckets[i].get(j).getEmployeeNumber();
                    output += "\n  Employee " + theEmpNum;
                }
            }

        }
        
        return output;

    }

    public int calcBucket(int keyValue) {
        // Hashing algorithm for determining buckets
        // Current hashing algorithm: modulo
        
        // Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
        while (keyValue < 0) {
            keyValue += buckets.length;
        }
        
        return(keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {

        // Add the employee to the hash table.  Return true if employee is added successfully,
        // return false otherwise.

        int key = theEmployee.getEmployeeNumber();
        
        if (findEmployeeIndex(theEmployee.getEmployeeNumber()) != -1) {
            return false; // Do not allow two employees with the same employee number.
        }

        return buckets[calcBucket(key)].add(theEmployee);
    }

    public int findEmployeeIndex(int employeeNum) {

        // Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
        // If the employee is not found, return -1.
        
        int key = employeeNum;

        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];

        if (bucket.size() > 0) {
            int index = 0;
            for(EmployeeInfo emp : bucket)
            {
                if (emp.getEmployeeNumber() == key)
                    return index;
                index += 1;
            }
        }
        return -1;
    }

    public EmployeeInfo removeEmployee(int employeeNum) {

        // Remove the employee from the hash table and return the reference to that employee.
        // If the employee is not in the hash table, return null.

        int key = employeeNum;

        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];
        
        int index = findEmployeeIndex(employeeNum);
        
        if (index != -1)
            return bucket.remove(index);
        return null;

    }
    
    public EmployeeInfo searchEmployee(int employeeNum) {
        
        // Return the reference to the employee from the hash table
        // If the employee is not in the hash table, return null.
        
        int key = employeeNum;
        
        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];
        
        int index = findEmployeeIndex(employeeNum);
        
        if (index != -1)
            return bucket.get(index);
        return null;
        
    }
    
    public boolean editEmployee(int employeeNum, EmployeeInfo emp) {
        
        // Set the reference to the employee from the hash table
        // with the same employee number to the new employee.
        // If the employee is not in the hash table, return false.
        
        int key = employeeNum;
        
        ArrayList<EmployeeInfo> bucket = buckets[calcBucket(key)];
        
        int index = findEmployeeIndex(employeeNum);
        
        if (index != -1) {
            bucket.remove(index);
            
            addEmployee(emp);
            return true;
        }
        return false;
    }
    
    public ArrayList<EmployeeInfo> getAllEmployees() {
        
        // Return all of the employees in the hash table in an ArrayList.
        
        ArrayList<EmployeeInfo> all = new ArrayList<EmployeeInfo>();
        
        for (int i = 0; i < buckets.length; i++) {

            // For the current bucket, add each item in its ArrayList to the final ArrayList.

            int listSize = buckets[i].size();

            for (int j = 0; j < listSize; j++) {
                all.add(buckets[i].get(j));
            }

        }
        
        return all;
        
    }
    
    public ArrayList<EmployeeInfo> searchEmployees(String term, String type) {
        
        // Return all of the employees in the hash table that 
        // match the search requirements in an ArrayList.
        // Return an empty ArrayList if no employees found or search not formatted correctly.
        
        ArrayList<EmployeeInfo> retrieved = new ArrayList<EmployeeInfo>();
        
        for (int i = 0; i < buckets.length; i++) {

            // For the current bucket, add each item in its ArrayList 
            // to the final ArrayList if the search condition matches.

            int listSize = buckets[i].size();

            for (int j = 0; j < listSize; j++) {
                
                boolean match = false;
                EmployeeInfo emp = buckets[i].get(j);
                
                switch(type) {
                    case "Employee Number":
                        int num;
                        try {
                            num = Integer.parseInt(term);
                        }
                        catch (NumberFormatException e) {
                            e.printStackTrace();
                            return retrieved;
                        }
                        match = emp.getEmployeeNumber() == num;
                        break;
                    case "First Name":
                        match = emp.getFirstName().contains(term);
                        break;
                    case "Last Name":
                        match = emp.getLastName().contains(term);
                        break;
                    case "Department":
                        match = emp.getDepartment().contains(term);
                        break;
                    case "Part Time":
                        match = emp instanceof PartTimeEmployee;
                        break;
                    case "Full Time":
                        match = emp instanceof FullTimeEmployee;
                        break;
                }
                
                if (match)
                    retrieved.add(emp);
            }

        }
        
        return retrieved;
        
    }
    
    
}
