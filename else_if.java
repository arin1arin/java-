
import java.util.Scanner;

public class else_if {
  public static void main(String[] args) {
     int marks;
     System.out.println("Enter Marks");
     Scanner sc = new Scanner(System.in);
     marks=sc.nextInt();
     if(marks>=80)
     {
      System.out.println("topper");
     }
     else if (marks<80 && marks>=60)
     {
      System.out.println("FIRST");
     }
     else
     {
      System.out.println("second");
     }
  }
}
