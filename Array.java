
import java.util.Scanner;

public class Array {
  public static void main(String[]args){
    int size, i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    size=sc.nextInt();
    int a[]=new int[size];
    for( i=0; i<size; i++)
    {
      a[i]=sc.nextInt();
    }
      System.out.println("printed array element");
      for(i=0;i<size; i++)
      {
        System.out.println(a[i]);
      }
    
    // int a[]={10,20,30,40,50};
    // System.out.println(a[3]);



    // int a[]=new int[5];
    // a[0] =10;
    // a[1] =20;
    // a[2] =30;
    // a[3] =40;
    // a[4] =50;
    // for (int i=0; i<5;i++){
    //   System.out.println(a[i]);
    // }
  }
}
