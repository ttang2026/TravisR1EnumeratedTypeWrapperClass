/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1enumeratedtypewrapperclassp3;
import java.util.Scanner; // Importing scanner class

/**
 *
 * @author TTang2026
 */
public class TravisR1EnumeratedTypeWrapperClassP3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Ask for CCHS Username
        System.out.println("Please enter your CCHS username with your graduation year: ");
        String username = scan.nextLine();
        
          // Extract the graduation year using substring
        String graduationYearString = username.substring(username.length() - 4);
        
        // Parse the year as an Integer
        int graduationYear = Integer.parseInt(graduationYearString);

        // Calculate the next graduation year
        int nextYear = graduationYear + 1;

        // Print the results
        System.out.println("You graduate in: " + graduationYear);
        System.out.println("The year after your graduation will be: " + nextYear);
        System.out.println("In computer language, you graduate in: " + Integer.toBinaryString(graduationYear));

    }
}
