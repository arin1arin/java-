

public class variable{
  static int b = 20; // static variable
  int c = 30;// instance variable
  public static void main(String[]args){
    int a = 10;// local variable 
    variable ref = new variable();
    System.out.println(a);
    System.out.println(variable.b);
    System.out.println(ref.c);

  }
}