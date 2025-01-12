import java.util.Scanner;

public class check_no_armstrong {
  public static void main(String[] args) {
    int n,arm=0,rem,c;
    System.out.println("Enter the no..");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    while (n>0) {
      rem=n%10;
      arm=(rem*rem*rem)+arm;
      n=n/10;

    }
    if(c==arm)
    System.out.println("Armstrong Number");
     
    else
    System.out.println("Not Armstrong Number..");

  }
}
