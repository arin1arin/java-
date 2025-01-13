import java.util.Scanner;

public class square_root {
  public static void main(String[]args){
    int n;
    System.out.println("Enter Any Number..");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    double m=Math.sqrt(n);
    System.out.println("Square root of "+n+"is "+ m);

  }
}
