

public class Count1 {
   public static void main(String[] args) {

      int counter1 = 0;
      int counter2 = 0;

      for (int i = 1; i <= 10; ++i) {
         ++counter1;
      }

      for (int j = 1; j <= 15; ++j) {
         ++counter2;
      }

      System.out.println("counter1: " + counter1);
      System.out.println("counter2: " + counter2);
   }
}
