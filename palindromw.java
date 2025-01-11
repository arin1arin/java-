
import java.util.Scanner;

public class palindromw {
  public static void main(String[] args) {
    int n,s=0,c,r;
    System.out.println("Enter any Number");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
     c=n;
     while (n>0)
     {
      r=n%10;
      s=(s*10)+r;
      n=n/10;
     }
      if(c==s){
        System.out.println("palindrome no..");
      }
      else
      {
        System.out.println("it is not a palindrome no..");
      }
  }
}
