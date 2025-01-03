
import java.util.Scanner;

public class area_of_circle {
  public static void main(String[] args) {
      final double pi=3.14,area;
      int r;

      System.out.println("Enter Radius ");
      Scanner sc = new Scanner(System.in);
      r=sc.nextInt();
      area =pi*r*r;
      System.out.println("area of circle is "+ area);
  }
}
