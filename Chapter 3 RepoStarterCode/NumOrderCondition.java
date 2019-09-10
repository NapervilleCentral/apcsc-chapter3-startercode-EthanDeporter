import java.util.Scanner;
import java.lang.*;
public class NumOrderCondition
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter S for strict ordering, L for lenient (S or L):");
      String answer = in.next();

      System.out.println("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      if (answer.equals("S")){
          if(a>b && b>c){
              System.out.print("Decreasing");}
          else if(a<b && b<c){
              System.out.print("increasing");}
          else if(a==b && b==c){
              System.out.print("Increasing and decreasing");}
          else{
              System.out.print("Neither");}}
      else{
          if(a>b && b>c){
              System.out.print("Decreasing");}
          else if(a<b && b<c){
              System.out.print("increasing");}
          else if(a>=b && b>c){
              System.out.print("Decreasing");}
          else if(a<b && b<=c){
              System.out.print("Increasing");}
          else{
              System.out.print("Neither");}}
   }
}
