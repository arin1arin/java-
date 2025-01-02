
import java.util.Scanner;

public class ASCII {
  public static void main(String[] args) {
    char ch;
    System.out.println("Enter Any Character..");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    int a = ch;
    System.out.println("ASCII value of "+ch +" is "+ a);

  }
}
