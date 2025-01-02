
import java.util.Scanner;



public class even_number {
  public static void main(String[] args) {
      int n;
      System.out.print("enter the number..");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for (int i = 0; i <=n; i=i+2)
       {
          System.out.println(i);
      }
  }
}
