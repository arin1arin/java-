
import java.util.Scanner;

public class sum_natural {
  public static void main(String[] args) {
      int n,sum=0;
      System.out.println("Enter The Term..");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for (int  i = 1; i <= n; i++)
       {
          sum=sum+i;
      }
      System.out.println("Addition "+ sum);
  }
}
