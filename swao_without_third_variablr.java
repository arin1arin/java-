
import java.util.Scanner;

public class swao_without_third_variablr {
  public static void main(String[] args) {
    int a,b;
    System.out.println("Enter two number");
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("before swaping "+ a+" "+ b);

 a=a+b;
 b=a-b;
 a=a-b;
  System.out.println("after swapping "+ a +" "+b);
    
  }
}
