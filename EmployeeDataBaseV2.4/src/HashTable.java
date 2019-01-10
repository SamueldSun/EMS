/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */

// Import stuff
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class HashTable {
    private static final String FILENAME = "DatabaseData.txt";

    EmployeeInfo employee = new EmployeeInfo();
    
    int pT = 0;
    
    // Start hashtable
    ArrayList<EmployeeInfo> persons[] = new ArrayList[2];
    
    // Initialize hashtable
    public void initializeHashTable() {
        for (int i = 0; i <= 1; i++) {
            persons[i] = new ArrayList<>();
        }
    }
    
    // Write info to text file for long-term storage
    private static void writeToFile(String stuffToWrite) {
        Integer noOfLines = 1;
        File file = new File(FILENAME);
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(FILENAME, true);
            br = new BufferedWriter(fr);
            for (int i = 0; i< noOfLines; i++); {
                br.write(stuffToWrite);
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
        }
    }
    
    // Append new employee to hash table
    public void addToHashTable(EmployeeInfo itemToAdd) {
        persons[pT].add(itemToAdd);
    }
    
    // Writes hash table to file using writeToFile
    public void saveHashTable() {
        // Gets all required information and writes it to file
        for (int i = 0; i < persons[pT].size(); i++){
            writeToFile(persons[pT].get(i).getEmployeeStatus());
            writeToFile(persons[pT].get(i).getFirstName());
            writeToFile(persons[pT].get(i).getLastName());
            writeToFile(persons[pT].get(i).getYearBorn());
            writeToFile(persons[pT].get(i).getMonthBorn());
            writeToFile(persons[pT].get(i).getDayBorn());
        }
    }
    
    // Reads file and adds it to the hash table
    public void loadHashTable() {
        Integer numLinesRead = 0;
        String[] loadedInfo = new String[6]; // CHANGE THIS LATER
        // System.out.println(Arrays.toString(loadedInfo));

        // for (int i = 0; i < 1; i++) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(FILENAME));
                for (String line; (line = br.readLine()) != null;) {
                    loadedInfo[numLinesRead] = line; // Create a temporary array to hold info for each employee entry
                    numLinesRead++;
                    if(numLinesRead == 6) { // CHANGE THIS LATER
                        numLinesRead = 0;
                        employee = new EmployeeInfo(loadedInfo[0], loadedInfo[1], loadedInfo[2], loadedInfo[3], loadedInfo[4], loadedInfo[5]);
                        addToHashTable(employee);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        // }
    }

    // Clear hash table
    public void clearHashTable() {
        persons[pT].clear();
    }

    // Clear database file
    public void clearDatabaseFile() {
        File file = new File(FILENAME);
        FileWriter fr = null;

        try {
            fr = new FileWriter(FILENAME);
            fr.write("");   // Replace text in file with ""
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
        }
    }
    
    // Print hash table
    public void printHashTable() {
        
        // Print arraylist entries (returns addresses)
        System.out.println(persons);
        // Print size of arraylist
        System.out.println(persons[pT].size());

        // Read through each arraylist entry and list entries
        for (int i = 0; i < persons[pT].size(); i++){
            System.out.println("Emp. Status: " + persons[pT].get(i).getEmployeeStatus());
            System.out.println("First  Name: " + persons[pT].get(i).getFirstName());
            System.out.println("Last   Name: " + persons[pT].get(i).getLastName());
            System.out.println("Birth  Year: " + persons[pT].get(i).getYearBorn());
            System.out.println("Birth Month: " + persons[pT].get(i).getMonthBorn());
            System.out.println("Birth   Day: " + persons[pT].get(i).getDayBorn());
        }
    }
}

