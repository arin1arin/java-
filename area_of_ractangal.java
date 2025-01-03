
import java.util.Scanner;

public class area_of_ractangal {
  public static void main(String[] args) {
      int l,b,area;
      System.out.println("Enter length and bidth..");
      Scanner sc = new Scanner(System.in);
      l=sc.nextInt();
      b=sc.nextInt();
      area = l*b;
      System.out.println("Area of rectangal is "+ area);
  }
}
