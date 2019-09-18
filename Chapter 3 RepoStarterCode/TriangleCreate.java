//Ethan DePorter
//9/13/19
//Triangle Creating program (A version)
//Tells the type of triangle based on either 3 angles or sides entered by the user


import java.util.*;
public class TriangleCreate
{
    public static void TriangleCreate()
    {   
        Scanner bob=new Scanner(System.in);//Sets up scanner
        int s1,s2,s3;
        System.out.println("Do you want to enter Angles?(A) or Sides(S)");
        String choice = bob.nextLine();//Takes in the choice of entering Angles or Sides
        System.out.println("Enter the three numbers ");//Taking the three angles or sides
        s1=bob.nextInt();
        s2=bob.nextInt();
        s3=bob.nextInt();
        if(choice.equals("S")){//If the choice is sides
            if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1){//Checks for an invalid triangle
                if(s1==s2 && s1==s3){//Conditions for a equilateral triangle
                    System.out.println("Equilateral Triangle");}
                else if(s1==s2 || s1==s3 || s2==s3){//Conditions for an isosceles triangle
                    System.out.println("Isosceles Triangle");}
                    
                    //Conditions for a Right triangle
                else if(s1*s1+s2*s2==s3*s3 || s2*s2+s3*s3==s1*s1 || s1*s1+s3*s3==s2*s2){
                    System.out.println("Right triangle");}
                else{//If its not a special triangle it fits under a regular triangle
                    System.out.println("Regular Triangle");}}
            else{//If it doesn't meet the rules of a regular triangle its not a triangle
                System.out.println("Not a triangle");}}
        else if(choice.equals("A")){//If its 3 angles
            if(s1+s2+s3==180 && s1>0 && s1+s2!=180 && s2>0 && s1+s3!=180 && s3>0 && s3+s2!=180){//makes sure the angles are real triangles
                if(s1==s2 && s2==s3){//Checks if it is an equilateral triangle
                    System.out.println("Equilateral Triangle");}
                else if(s1==s2 || s1==s3 || s2==s3){//Checks if its an Isosceles triangle
                    System.out.println("Isosceles triangle");}
                else if(s1==90 || s2==90 || s3==90){//Checks if it is a right triangle
                    System.out.println("Right triangle");}
                else{//If its not a special triangle its a regular triangle
                    System.out.println("Regular triangle");}
                }
            else{//If it doesn't accord to the laws of a triangle its not a triangle
                System.out.println("Not a triangle");}}
        else{//Wrong selection of Side or angle
            System.out.println("Not a selection of Side or Angle");}
                      
                
        }
        
    }
