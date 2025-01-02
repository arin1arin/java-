
import java.util.Scanner;

public class add_two_number {
  public static void main(String[] args) {
      int a,b,sum;
      System.out.println("Enter Two Number");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();

      sum = a+b;
      System.out.println("Addition "+sum);
  }
}
