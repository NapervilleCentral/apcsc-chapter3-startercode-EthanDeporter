//Ethan DePorter - Author
//Date: 9/12/19
//LeapYear - Calculates if the imput is a leap year

import java.util.*;
public class LeapYear
{
    public static void LeapYear()
    {
        Scanner bob=new Scanner(System.in);//Creating the scanner
        
        int year;//Setting up the integer year to accept the year number
        
        System.out.println("What year is it? ");
        year= bob.nextInt(); //Year is set up
        
        if(year>=1582 && year%4==0){ //Finds if it is divisible by 4, or its a leap year
            if(year%100==0){ //Checks if its a hundred year
                if(year%400==0){ //If it is it checks if its divisible by 400
                    System.out.println(year+" is a leap year");} //prints that it is a leap year
                else{ //if its not /400
                    System.out.println(year+" is not a leap year");}} //prints that it isn't a leap year
            else{//if it isn't /100
                System.out.println(year+" is a leap year");}} //prints that it is a leap year
        else{//if it isn't a leap year based on /4 and >1582
            System.out.println(year+" is not a leap year");}//otherwise it prints its not a leap year
            
    }}
