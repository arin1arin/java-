
import java.util.Arrays;



public class Compare_array {
  public static void main(String[] args) {
    int a[]={10,20,30,40,50};
    int b[]={10,20,30,40,50};

    // if(a==b)
    if(Arrays.equals(a,b))
    {
      System.out.println("both  are equal");

    }
    else
    {
      System.out.println("both are not equals");
    }
  }
}
