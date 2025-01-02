public class nested_for_loop {
  public static void main(String[] args) {
      int i,j;
      for (i = 1; i <= 5; i++) //row
      {
        for (j = 0; j <= 5; j++) //coloum
        {
            System.out.print("* ");
        }
          System.out.println();
      }
  }
}
