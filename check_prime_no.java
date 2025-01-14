import java.util.Scanner;

public class check_prime_no {
  public static void main(String[] args) {
    int n, count=0;
    System.out.println("Enter the no");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();

    for(int i=1; i<=n; i++){
      if(n%i==0)
      {
        count++;

      }
    }
       if (count==2)
        System.out.println("Prime number ");
       
       else
       System.out.println("Not a prime no..");
    
  }
}
