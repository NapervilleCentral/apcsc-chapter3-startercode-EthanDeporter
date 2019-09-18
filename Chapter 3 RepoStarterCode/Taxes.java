//Ethan DePorter
//9/17/19
//Does the taxes on your annual income
//Taxes Program
import java.util.*;
import java.lang.*;
import java.text.*;
public class Taxes
{

    public static void Taxes()
    {   
        Scanner bob=new Scanner(System.in);
        int salary;
        DecimalFormat fmt=new DecimalFormat("0.00");
        System.out.println("What is your annual salary?");
        salary=bob.nextInt();
        if(salary>500000){
            double tax= (double)salary*0.06;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        else if(250000<salary && salary<=500000){
            double tax= (double)salary*0.05;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        else if(250000>=salary && salary>100000){
            double tax= (double)salary*0.04;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        else if(100000>=salary && salary>75000){
            double tax= (double)salary*0.03;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        else if(75000>=salary && salary>50000){
            double tax= (double)salary*0.02;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        else{
            double tax= (double)salary*0.01;
            System.out.println("Your salary: $"+salary+"    Tax: $"+fmt.format(tax));}
        

    
}}

