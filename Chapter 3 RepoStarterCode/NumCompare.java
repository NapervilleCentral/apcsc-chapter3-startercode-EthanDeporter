import java.util.Scanner;

public class NumCompare
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int num1, num2, num3;
      System.out.println("Say 3 numbers");
      num1 = in.nextInt();
      num2 = in.nextInt();
      num3 = in.nextInt();
      if(num1==num2 && num1==num3){
          System.out.print("They are all the same");}
      else if(num1==num2 || num1==num3 || num2==num3){
          System.out.print("Neither");}
      else{
          System.out.print("different");}

   }
}
