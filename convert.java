
import java.util.Scanner;

public class convert {
  public static void main(String[] args) {
      char ch,ch2;
      System.out.println("enter any character");
      Scanner sc = new Scanner(System.in);
      ch=sc.next().charAt(0);
      if (ch>='A' && ch<='Z') 
      {
         ch2=  Character.toLowerCase(ch);
         System.out.println("lowercase " + ch2);

      }
      else{

        ch2= Character.toUpperCase(ch);
        System.out.println("uppercase "+ ch2);
      }

      
  }
}
