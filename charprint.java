
import java.util.Scanner;

public class charprint {
  public static void main(String[] args) {
      char ch;
      System.out.println("Please Enter character");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      System.out.println(ch);
  }
}
