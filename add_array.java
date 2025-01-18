
import java.util.Scanner;

public class add_array {
  public static void main(String[] args) {
    int a[]=new int[5];  int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Element in Array ");
    for (int i = 0; i < a.length ; i++) {
        a[i]=sc.nextInt();
    }
    System.out.println("Array Elements ");
    for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        sum=a[i]+sum;
    }
    System.out.println("Addition of Array Element " +sum);
  }
}
