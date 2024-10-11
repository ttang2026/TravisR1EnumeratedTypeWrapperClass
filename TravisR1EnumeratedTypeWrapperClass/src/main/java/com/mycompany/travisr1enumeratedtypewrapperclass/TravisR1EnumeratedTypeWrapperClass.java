/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1enumeratedtypewrapperclass;

/**
 *
 * @author TTang2026
 */
public class TravisR1EnumeratedTypeWrapperClass {
    enum Days {
        Monday, 
        Tuesday, 
        Wednesday, 
        Thursday, 
        Friday, 
        Saturday, 
        Sunday
    }
    public static void main(String[] args) {
        
        for (int i = 0; i < Days.values().length; i++) {
            System.out.println((i + 1) + ": " + Days.values()[i]);
        }
    }
}