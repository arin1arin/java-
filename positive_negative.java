
import java.util.Scanner;

public class positive_negative {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter a Number..");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();

    if(n>0)
  {
    System.out.println("positive no");
  }
    else if (n<0){
      System.out.println("negative no.");
    }
    else
    {
      System.out.println("not negative or not positive  ");
    }
  }
}
