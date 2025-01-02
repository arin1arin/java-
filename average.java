
import java.util.Scanner;

public class average {
  public static void main(String[] args) {
    int a,b,c,d,e;
    System.out.println("Enter marks of five subjects..");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    int sum =a+b+c+d+e;
    System.out.println("Totel marks is  "+ sum);
    double avg = sum/5.0;
    System.out.println("Avg of five no is "+ avg);
  }
}
