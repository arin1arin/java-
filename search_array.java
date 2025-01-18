
import java.util.Scanner;

public class search_array {
  public static void main(String[] args) {
    int a[]=new int[5];  int n, count=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Element in array");
    for (int i = 0; i < a.length; i++) {
        a[i]= sc.nextInt();
    }
    System.out.println("array Element ");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
    System.out.println("Enter Search Element ");
    n=sc.nextInt();
    for (int i = 0; i < a.length; i++) {
        if(a[i]==n)
        {
          count++;
        }
    }
    if(count>0){
      System.out.println("Item found"+ count+ "time");
    }
    else
    {
      System.out.println("item not found");
    }
  }
}
