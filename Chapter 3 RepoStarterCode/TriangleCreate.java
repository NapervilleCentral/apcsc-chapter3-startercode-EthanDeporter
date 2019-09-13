//Ethan DePorter
//9/13/19
//Triangle Creating program (A version)
//Tells the type of triangle based on either 3 angles or sides entered by the user


import java.util.*;
public class TriangleCreate
{
    public static void TriangleCreate()
    {   
        Scanner bob=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Do you want to enter Angles?(A) or Sides(S)");
        String choice = bob.nextLine();
        System.out.println("Enter the three numbers ");
        s1=bob.nextInt();
        s2=bob.nextInt();
        s3=bob.nextInt();
        if(choice.equals("S")){
            if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1){
                if(s1==s2 && s1==s3){
                    System.out.println("Equilateral Triangle");}
                else if(s1==s2 || s1==s3 || s2==s3){
                    System.out.println("Isosceles Triangle");}
                else if(s1*s1+s2*s2==s3*s3 || s2*s2+s3*s3==s1*s1 || s1*s1+s3*s3==s2*s2){
                    System.out.println("Right triangle");}
                else{
                    System.out.println("Regular Triangle");}}
            else{
                System.out.println("Not a triangle");}}
        else if(choice.equals("A")){
            if(s1+s2+s3==180 && s1!=0 && s1<=90 && s2!=0 && s2<=90 && s3!=0 && s3<=90){
                if(s1==s2 && s2==s3){
                    System.out.println("Equilateral Triangle");}
                else if(s1==s2 || s1==s3 || s2==s3){
                    System.out.println("Isosceles triangle");}
                else if(s1==90 || s2==90 || s3==90){
                    System.out.println("Right triangle");}
                else{
                    System.out.println("Regular triangle");}
                }
            else{
                System.out.println("Not a triangle");}}
        else{
            System.out.println("Not a selection of Side or Angle");}
            
                    
                
                
                
        }
        
    }
