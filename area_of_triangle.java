
import java.util.Scanner;

public class area_of_triangle {
  public static void main(String[] args) {
    int a,b,c,sp;
    double area;
    System.out.println("Enter value for sides of triangle");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    sp=(a+b+c/2);
   area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
   System.out.println(area);
  }
}
