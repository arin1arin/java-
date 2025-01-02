import java.util.Scanner;

public class ifelse {
  public static void main(String[] args) {
      int n;
      System.out.println("Enter Any Numbers..");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if (n>=0)
      {
        System.out.println("+ve Number");
      }
      else
      {
        System.out.println("-ve Number");
      }
  }
}
