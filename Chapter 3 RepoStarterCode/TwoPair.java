import java.util.*;
/**
 * Write a description of class TwoPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoPair
{

    public static void TwoPair()
    {
        int num1,num2,num3,num4;
        Scanner bob= new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        num1= bob.nextInt();
        num2= bob.nextInt();
        num3= bob.nextInt();
        num4= bob.nextInt();
        
        if(num1==num2){
            if(num3==num4){
                System.out.print("Two pairs");}
            else{
                System.out.print("Not two pairs");}}
        else if(num1==num3){
            if(num2==num4){
                System.out.print("Two pairs");}
            else{
                System.out.print("Not two pairs");}}
        else if(num1==num4){
            if(num2==num3){
                System.out.print("Two pairs");}
            else{
                System.out.print("Not two pairs");}}
        else{
            System.out.println("Not two pairs");}
        

    }}

