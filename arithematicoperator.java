
import java.util.Scanner;

public class arithematicoperator {
  public static void main(String[] args) {
      int a,b;
      System.out.print("Enter Two Number.. ");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Addition "+(a+b));
      System.out.println("Subtraction "+(a-b));
      System.out.println("Multiply "+(a*b));
      System.out.println("Divsion "+(a/b));
      System.out.println("Remainder "+(a%b));
  }
}
