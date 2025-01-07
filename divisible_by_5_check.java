
import java.util.Scanner;

public class divisible_by_5_check {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter a Number..");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    if(n%5==0)
    {
      System.out.println("number are divisible by 5");

    }
    else
    {
      System.out.println("no is not divisible by 5");
    }
  }
}
