/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class HashTable {
    private static final String FILENAME = "DatabaseData.txt";

    EmployeeInfo employee = new EmployeeInfo();


    List<EmployeeInfo> persons = new ArrayList<EmployeeInfo>();

    private static void writeToFile(String stuffToWrite) {
        Integer noOfLines = 1;
        File file = new File(FILENAME);
        FileWriter fr = null;
        BufferedWriter br = null;

        try {
            fr = new FileWriter(FILENAME, true);
            br = new BufferedWriter(fr);
            for (int i = 0; i< noOfLines; i++); {
                br.newLine();
                br.write(stuffToWrite);
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

    public void addToHashTable(EmployeeInfo itemToAdd) {
        persons.add(itemToAdd);
    }

    public void saveHashTable() {
        for (int i = 0; i < persons.size(); i++){
            writeToFile(persons.get(i).getFirstName());
            writeToFile(persons.get(i).getLastName());
            writeToFile(persons.get(i).getYearBorn());
            writeToFile(persons.get(i).getMonthBorn());
            writeToFile(persons.get(i).getDayBorn());
        }
    }

    public void loadHashTable() {
        Integer numLinesRead = 0;
        String firstName;
        String lastName;
        String[] loadedInfo = new String[5];
        // System.out.println(Arrays.toString(loadedInfo));

        // for (int i = 0; i < 1; i++) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(FILENAME));
                for (String line; (line = br.readLine()) != null;) {
                    // System.out.println(line);
                    loadedInfo[numLinesRead] = line;
                    numLinesRead++;
                    if(numLinesRead == 5) { // CHANGE THIS LATER
                        numLinesRead = 0;
                        employee = new EmployeeInfo(loadedInfo[0], loadedInfo[1], loadedInfo[2], loadedInfo[3], loadedInfo[4]);
                        addToHashTable(employee);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        // }
    }

    public void clearHashTable() {
        persons.clear();
    }

    public void clearDatabaseFile() {
        File file = new File(FILENAME);
        FileWriter fr = null;

        try {
            fr = new FileWriter(FILENAME);
            fr.write("");
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

    public void printHashTable() {
        System.out.println(persons);

        System.out.println(persons.size());

        for (int i = 0; i < persons.size(); i++){
            System.out.println("First  Name: " + persons.get(i).getFirstName());
            System.out.println("Last   Name: " + persons.get(i).getLastName());
            System.out.println("Birth  Year: " + persons.get(i).getYearBorn());
            System.out.println("Birth Month: " + persons.get(i).getMonthBorn());
            System.out.println("Birth   Day: " + persons.get(i).getDayBorn());
        }
    }
}

