import java.util.Scanner;

public class vote
{
  public static void main(String[] args) {
      int age;
      System.out.println("enter your age..");
      Scanner sc =new Scanner(System.in);
      age=sc.nextInt();
      if (age>=18)
      {
        System.out.println("you are eligible for vote");
      }
      else
      {
        System.out.println("you are not eligible for vote..");
      }
  }
}