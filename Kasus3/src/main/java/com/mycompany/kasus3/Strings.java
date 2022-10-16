package com.mycompany.kasus3;

import java.util.Scanner;

/**
 * @author Yumi Febriana
 */
public class Strings {
    public static void main (String[] args){
        String[] stringList;
        int size;
        Scanner scan = new Scanner (System.in);
        System.out.print("\nHow many integers do you want to sort?");
        size = scan.nextInt();
        stringList = new String[size];
        System.out.println("\nEnter the numbers ...");
        for (int i = 0 ; i < size ; i++)
            stringList[i] = scan.next();
        Sorting.insertionSort(stringList);
        System.out.println("\nYour numbers in sorted order ...");
        for (int i = 0 ; i < size ; i++)
            System.out.println(stringList[i] + " ");
        System.out.println ();
        scan.close();
        
        
    }
}
