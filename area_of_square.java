
import java.util.Scanner;

public class area_of_square {
  public static void main(String[] args) {
      int side,area;
      System.out.println("enter side of square");
      Scanner sc = new Scanner(System.in);
      side=sc.nextInt();
      area=side*side;
      System.out.println(area);
      
  }
}
