
import java.util.Scanner;



public class month {
  public static void main(String[] args) {
    int n;
    System.out.println("Enter the month number..");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
 
    if(n==1)
    {
      System.out.println("january day is 31");
    }
    else if(n==2){
      System.out.println("faburay day is 28");
    }
    else if (n==3){
      System.out.println("march day is 31 days ");
    }
    else if (n==4){
      System.out.println("april day is 30 days");

    }
    else if (n==5){
      System.out.println("may day is ");
    }
    else if (n==6){
      System.out.println("june day is 30 days ");

    }
    else if (n==7){
      System.out.println("july day is 31 days ");
    }
    else if (n==8){
      System.out.println("august day is 31 days ");

    }
    else if (n==9){
      System.out.println("september day is 30 days");
    }
    else if (n==10){
      System.out.println("october day is 31 days ");
    }
    else if (n==11){
      System.out.println("november day is 30 days ");

    }
    else if (n==12){
      System.out.println("december day is 31 days");

    }
    else {
      System.out.println("invalid month number..");
    }
  }

}
