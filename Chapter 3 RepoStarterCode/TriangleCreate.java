import java.util.*;
public class TriangleCreate
{
    public static void TriangleCreate()
    {   
        Scanner bob=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Do you want to enter Angles?(A) or Sides(S)");
        System.out.println("Enter the three numbers ");
        s1=bob.nextInt();
        s2=bob.nextInt();
        s3=bob.nextInt();
        if 
        if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1){
            if(s1==s2 && s1==s3){
                System.out.println("Equilateral Triangle");}
            else if(s1==s2 || s1==s3 || s2==s3){
                System.out.println("Isosceles Triangle");}
            else if((s1*s1+s2*s2==s3*s3 || s2*s2+s3*s3==s1*s1) || s1*s1+s3*s3=s2*s2){
                System.out.println("Right triangle");}
                
                
                
        }
        
    }}
