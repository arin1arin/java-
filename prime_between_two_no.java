import java.util.Scanner;

public class prime_between_two_no {
  public static void main(String[] args) {
    int n1,n2,i,j;
    System.out.println("Enter two Number..");
    Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    n2=sc.nextInt();

    for( i=n1; i<=n2;i++)
    {
      for ( j=2; j<=i; j++)
      {
        if(i%j==0)
        break;
      }
      if(i==j)
      System.out.println(j);

    }
  }
}
