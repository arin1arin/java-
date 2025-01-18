
import java.util.Arrays;

public class array_class_method {
  public static void main(String[] args) {
    String a[]={"Learn","coding","keypoint","Education"};
   System.out.println("toString()"+ Arrays.toString(a)); 
   System.out.println("asList()"+ Arrays.asList(a));
   int arr[][]={{10,20},{30,40}};
   System.out.println("deepToString"+ Arrays.deepToString(arr));
  }
}
