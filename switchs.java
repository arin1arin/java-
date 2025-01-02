
import java.util.Scanner;

public class switchs {
  public static void main(String[] args) {
      int a=10, b=20,ch ;
      System.out.println("Enter User Choice..");
      Scanner sc = new Scanner(System.in);
      ch=sc.nextInt();
      switch(ch)
      {
        case 1: System.out.println("sum "+(a+b));
        break; 
        case 2: System.out.println("Sub "+(a-b));
        break;
        case 3: System.out.println("mul "+(a*b));
        break;
        case 4: System.out.println("div "+(a/b));
        break;
        case 5: System.out.println("Rem "+(a%b));
        break;
        default:

      }
  }
}
