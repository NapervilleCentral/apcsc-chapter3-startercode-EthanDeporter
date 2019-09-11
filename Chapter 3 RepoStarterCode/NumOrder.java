import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
      int num1, num2, num3;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      
      num1 = in.nextInt();
      num2 = in.nextInt();
      num3 = in.nextInt();
      
      if(num1 < num2 && num2 < num3)
            System.out.println("Increasing");
      else if(num3 < num2 && num2 < num1)
            System.out.println("Decreasing");
      else
            System.out.println("Neither");
   }
}
