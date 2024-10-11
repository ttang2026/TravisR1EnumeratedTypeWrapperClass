/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1enumeratedtypewrapperclassp2;

/**
 *
 * @author TTang2026
 */
public class TravisR1EnumeratedTypeWrapperClassP2 {
    enum Months {
        January, 
        February, 
        March, 
        April, 
        May, 
        June, 
        July, 
        August, 
        September, 
        October, 
        November, 
        December
    }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println((i + 1) + ": " + Months.values()[i]);
        }
    }
}
