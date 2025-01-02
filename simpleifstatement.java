
import java.util.Scanner;

public class simpleifstatement {
  public static void main(String[] args) {
      int age;
      System.out.println("Enter Your Age..");
      Scanner sc = new Scanner(System.in);
      age= sc.nextInt();
      if(age>=18)
      {
        System.out.println("Eligible for Votes..");
        
      }
      System.out.println("Thankyou...");
  }
}

