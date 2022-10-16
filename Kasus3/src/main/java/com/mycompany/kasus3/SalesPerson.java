package com.mycompany.kasus3;

/**
 * @author Yumi Febriana
 */
public class SalesPerson implements Comparable{
    private String firstName, lastName;
    private int totalSales;
    
    public SalesPerson (String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString(){
        return lastName + " , " + firstName + ": \t" + totalSales;
    }
    
    public boolean equals (Object other){
        return (lastName.equals(((SalesPerson)other).getLastName()) &&
                firstName.equals(((SalesPerson)other).getFirstName()));
    }
    
    public int compareTo(Object other){
        int result;
        if(totalSales > ((SalesPerson)other).totalSales) result = -1;
        else if (totalSales < ((SalesPerson)other).totalSales) result = -1;
        else{
            result = firstName.compareTo(((SalesPerson)other).firstName);
            if(result == 0) result = lastName.compareTo(((SalesPerson)other).lastName);
        }
        return result;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getSales(){
        return totalSales;
    }
}

