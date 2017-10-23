/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_03_distance_file;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author bluebackdev
     * Modify the program you wrote for Programming Challenge 2 (Distance
     * Traveled) so it writes the report to a file instead of the screen. Open
     * the file in Notepad or another text editor to confirm the output.
 */
public class JAVA_PRG_04_03_Distance_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Declare ints for holding time, speed, and calculated distance
        int intTime;
        int intSpeed;
        int intDistance;
        
        String strFileName;

        // Create a new keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);

        // Use a loop on data input while user inputs
        // are invalid (less than 0 and greater than a 
        // reasonable number (1000))
        do {
            System.out.print("Please enter a time in hours\n" +
                    "that your vehicle will travel: ");
            intTime = scrKeyboard.nextInt();
        } while(intTime <= 0 || intTime >= 1000);

        // Similar loop on speed input for validation
        do {
            System.out.print("Please enter the speed of\n" +
                    "your vehicle in miles-per-hour: ");
            intSpeed = scrKeyboard.nextInt();
        } while(intSpeed <= 0 || intSpeed >= 10000);
                
        PrintWriter outputFile = new PrintWriter("/Users/bluebackdev/NetBeansProjects/Github/Book/Ch04 - Loops and Files/JAVA_PRG_04_03_Distance_File/src/java_prg_04_03_distance_file/results.txt");

        // Header for the table that will be printed by loop
        outputFile.println("\n\nTime\t\tDistance Traveled");

        // Loop through once for each hour of time
        // entered above and print out the hour and 
        // calculated distance value
        for(int i = 1 ; i <= intTime ; i++)
        {
            intDistance = i * intSpeed;
            outputFile.println(i + "\t\t" + intDistance);
        }
        
        outputFile.close();
    }
    
}
