import java.lang.*;
public class Short2 {
   public static void main(String[] args) {
      /*
      * returns the short value represented by this object
      * converted to type int
      */
      Short obj = new Short("32");
      int i = obj.intValue();
      System.out.println("Value = " + i);
      obj = new Short("30");
      i = obj.intValue();
      System.out.println("Value = " + i);
   }
}