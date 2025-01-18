import java.util.Scanner;

public class array_reverse {
  public static void main(String[] args) {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Element in Array.");
      for(int i=0; i<a.length; i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Array Element");
      for (int i=0; i<5; i++)
      {
        System.out.println(a[i]);
      }
      System.out.println("Array element in reverse order.");
      for(int i=4; i>=0 ;i--){
        System.out.println(a[i]);
      }
      }
  }

 