import java.util.Scanner;

public class NumOrderInt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
       
      System.out.print("Enter three numbers: ");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      
      
      if(a>b && b>c){
          System.out.print("in order");}
      else if(a<b && b<c){
          System.out.print("in order");}
      else if(a>=b && b>c){
          System.out.print("in order");}
      else if(a<b && b<=c){
          System.out.print("in order");}
      else{
          System.out.print("Not in order");}
   }
}
