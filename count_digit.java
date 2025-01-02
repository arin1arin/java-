
import java.util.Scanner;

public class count_digit {
  public static void main(String[] args) {
      int n,count=0;
      System.out.println("enter the digit..");
      Scanner sc =new Scanner(System.in);
      n=sc.nextInt();
      while (n>0)
       { 
          n=n/10;
          count++;

      }
      System.out.println("no of digit is "+ count);
  }
}
