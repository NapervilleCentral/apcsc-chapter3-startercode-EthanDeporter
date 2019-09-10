import java.util.*;
/**
 * Write a description of class Elseif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elseif
{
    public static void Elseif()
    {
        Scanner bob=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1= bob.nextInt();
        int num2= bob.nextInt();
        int num3= bob.nextInt();
        
        if (num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the highest number");}}
        else if (num2>num1){
                if(num2>num3){
                System.out.println(num1+" is the highest number");}}
        else{
            System.out.println(num3+" is the highest number");}
    }}

