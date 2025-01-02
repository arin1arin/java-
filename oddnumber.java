
import java.util.Scanner;

public class oddnumber {
  public static void main(String[] args) {
      int n;
      System.out.print("enter the number..");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for (int i=1; i<=n; i=i+2)
      {
        System.out.println(i);
      }
  }
}
