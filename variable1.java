public class variable1 {
  static int a= 10;
  void fun(){
    int b=10;
    System.out.println(a+" "+b); //11 10
    ++a; ++b; //11
  }
  public static void main(String[] args) {
      variable1 r = new variable1();
      r.fun();
      r.fun();

  }
}
