package com.mycompany.kasus3;
import java.util.Scanner;

/**
 * @author Yumi Febriana
 */
public class WeeklySales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sales person? ");
        int size = scan.nextInt();
        SalesPerson [] salesStaff = new SalesPerson [size];
        for (int i = 0; i< size; i++){
            System.out.print("\nFirst Name [" + i + "] : ");
            String firstName = scan.next();
            System.out.print("\nLast Name [" + i + "] : ");
            String lastName = scan.next();
            System.out.print("\nTotal Sales [" + i + "] : ");
            int totalSales = scan.nextInt();
            salesStaff[i] = new SalesPerson (firstName, lastName, totalSales);
        }
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the week\n");
        for(SalesPerson s : salesStaff)
        System.out.println(s);
        scan.close();
    }
}
