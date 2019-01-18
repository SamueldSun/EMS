package employeedatabasev4.pkg0;

//package employeedatabasev3.pkg0;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Samuel
// */
//
//// Import stuff
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.io.*;
//
//public class HashTable {
//    private static final String FILENAME = "DatabaseData.txt";
//
//    EmployeeInfo employee = new EmployeeInfo();
//    MainMenu mMenu;
//    
//    int pT;
//    int numAttributes = 9;
//    
//    // Start hashtable
//    ArrayList<EmployeeInfo> persons[] = new ArrayList[2];
//    
//    // Initialize hashtable
//    public void initializeHashTable() {
//        for (int i = 0; i < 2; i++) {
//            persons[i] = new ArrayList<>();
//        }
//    }
//    
//    // Write info to text file for long-term storage
//    private static void writeToFile(String stuffToWrite) {
//        Integer noOfLines = 1;
//        File file = new File(FILENAME);
//        FileWriter fr = null;
//        BufferedWriter br = null;
//
//        try {
//            fr = new FileWriter(FILENAME, true);
//            br = new BufferedWriter(fr);
//            for (int i = 0; i< noOfLines; i++); {
//                br.write(stuffToWrite);
//                br.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br.close();
//                fr.close();
//            } catch (IOException f) {
//                f.printStackTrace();
//            }
//        }
//    }
//    
//    // Append new employee to hash table
//    public void addToHashTable(EmployeeInfo itemToAdd) {
//        int pT = Integer.parseInt(itemToAdd.getEmployeeStatus());
//        persons[pT].add(itemToAdd);
//        
//    }
//    
//    // Writes hash table to file using writeToFile
//    public void saveHashTable() {
//        // Gets all required information and writes it to file
//                        
//        for(int i = 0; i < 2; i++) {
//            int pT = i;
//
//            // Read through each arraylist entry and list entries
//            for (int j = 0; j < persons[pT].size(); j++){
//                writeToFile(persons[pT].get(j).getEmployeeStatus());
//                writeToFile(persons[pT].get(j).getFirstName());
//                writeToFile(persons[pT].get(j).getLastName());
//                writeToFile(persons[pT].get(j).getYearBorn());
//                writeToFile(persons[pT].get(j).getMonthBorn());
//                writeToFile(persons[pT].get(j).getDayBorn());
//
//                writeToFile(persons[pT].get(j).getEmployeeNumber());
//                writeToFile(persons[pT].get(j).getWorkLocation());
//                writeToFile(persons[pT].get(j).getDepartment());
//            }
//        }
//    }
//    
//    // Reads file and adds it to the hash table
//    public void loadHashTable() {
//        Integer numLinesRead = 0;
//        String[] loadedInfo = new String[numAttributes];
//        
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(FILENAME));
//            for (String line; (line = br.readLine()) != null;) {
//                loadedInfo[numLinesRead] = line; // Create a temporary array to hold info for each employee entry
//                numLinesRead++;
//                if(numLinesRead == numAttributes) {
//                    numLinesRead = 0;
//                    // Be sure to change numAttributes
//                    employee = new EmployeeInfo(loadedInfo[0], loadedInfo[1], loadedInfo[2], loadedInfo[3], loadedInfo[4], loadedInfo[5], loadedInfo[6], loadedInfo[7], loadedInfo[8]);
//                    addToHashTable(employee);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Clear hash table
//    public void clearHashTable() {
//        for (int i = 0; i < 2; i++) {
//            persons[i].clear();
//        }
//    }
//
//    // Clear database file
//    public void clearDatabaseFile() {
//        File file = new File(FILENAME);
//        FileWriter fr = null;
//
//        try {
//            fr = new FileWriter(FILENAME);
//            fr.write("");   // Replace text in file with ""
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException f) {
//                f.printStackTrace();
//            }
//        }
//    }
//    
//    // Print hash table
//    public void printHashTable() {
//        
//        // Print arraylist entries (returns addresses)
//        System.out.println(persons);
//        // Print size of arraylist
//        for(int i = 0; i < 2; i++) {
//            int pT = i;
//            
//            System.out.println(persons[pT].size());
//
//            // Read through each arraylist entry and list entries
//            for (int j = 0; j < persons[pT].size(); j++){
//                System.out.println("Emp. Status: " + persons[pT].get(j).getEmployeeStatus());
//                System.out.println("First  Name: " + persons[pT].get(j).getFirstName());
//                System.out.println("Last   Name: " + persons[pT].get(j).getLastName());
//                System.out.println("Birth  Year: " + persons[pT].get(j).getYearBorn());
//                System.out.println("Birth Month: " + persons[pT].get(j).getMonthBorn());
//                System.out.println("Birth   Day: " + persons[pT].get(j).getDayBorn());
//
//                System.out.println("Emp.    Num: " + persons[pT].get(j).getEmployeeNumber());
//                System.out.println("Work   Loc.: " + persons[pT].get(j).getWorkLocation());
//                System.out.println("Department : " + persons[pT].get(j).getDepartment());
//            }
//        }
//    }
//    
//    public Object[] getTableInfo(int empCount) {
//        
//        Object[] tableContent = new Object[5];
//        tableContent[0] = persons[0].get(empCount).getEmployeeNumber();
//        tableContent[1] = persons[0].get(empCount).getFirstName();
//        tableContent[2] = persons[0].get(empCount).getLastName();
//        tableContent[3] = persons[0].get(empCount).getWorkLocation();
//        tableContent[4] = persons[0].get(empCount).getEmployeeStatus();
//        
//        // Object[] tableContent = new Object[]{persons[0].get(0).getEmployeeNumber(), persons[0].get(0).getFirstName(), persons[0].get(0).getLastName(),  persons[0].get(0).getWorkLocation(), persons[0].get(0).getEmployeeStatus()};
//        
//        
//        return tableContent;
//        
//        // int numRows = persons[0].size() + persons[1].size();
//        // int numRowsProcessed = 0;
//        /*
//        Object tableContent[][] = new Object[5][numRows];
//        for(int i = 0; i< 2; i++) {
//            int pT = i;
//            for (int j = 0; j < persons[pT].size(); j++) {
//                tableContent[0][numRowsProcessed] = persons[0].get(0).getEmployeeNumber();
//                tableContent[1][numRowsProcessed] = persons[0].get(0).getFirstName();
//                tableContent[2][numRowsProcessed] = persons[0].get(0).getLastName();
//                tableContent[3][numRowsProcessed] = persons[0].get(0).getWorkLocation();
//                tableContent[4][numRowsProcessed] = persons[0].get(0).getEmployeeStatus();
//                System.out.println(tableContent[0][numRowsProcessed]);
//                System.out.println(tableContent[1][numRowsProcessed]);
//                System.out.println(tableContent[2][numRowsProcessed]);
//                System.out.println(tableContent[3][numRowsProcessed]);
//                System.out.println(tableContent[4][numRowsProcessed]);
//            }
//        }
//        */
//        // return tableContent;
//        // return(new Object[]{persons[0].get(0).getEmployeeNumber(), persons[0].get(0).getFirstName(), persons[0].get(0).getLastName(),  persons[0].get(0).getWorkLocation(), persons[0].get(0).getEmployeeStatus()});
//    }
//    
//    public int getNumPTEmployees() {
//        return (persons[0].size());
//    }
//    public int getNumFTEmployees() {
//        return (persons[1].size());
//    }
//}
//
