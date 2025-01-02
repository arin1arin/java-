
import java.util.Scanner;

public class max {
  public static void main(String[] args) {
      // int a=10,b=20;
      int a,b,c;
      System.out.println("enter three no .. ");
      Scanner sc =new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b){
        if(a>c){
        System.out.println(a);
      }
      else
      {
        System.out.println(c);
      }
    }
      else
      {
        if(b>c)
        {
          System.out.println(b);
        }
        System.out.println(c);
      }
  }
}
