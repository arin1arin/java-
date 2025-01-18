
import java.util.Scanner;

public class average_array {
  public static void main(String[] args) {
    int a[]=new int[5]; int sum=0; double avg=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array..");
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    System.out.println("Array element ");
    for (int i = 0; i < a.length ; i++) {
      System.out.println(a[i]);

       sum = a[i]+ sum;
      
      avg = sum/5.0;
        
    }
    System.out.println("sum of array is "+ sum + " avg of array is "+ avg);
  }
}
