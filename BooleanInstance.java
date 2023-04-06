public class BooleanInstance {
   public static void main(String[] args) {
      boolean val = false;
      System.out.println("Boolean Value = "+val);
      Boolean res = Boolean.valueOf(val);
      System.out.println("Boolean = " + res);
      if (res.equals(Boolean.TRUE)) {
         System.out.println("Boolean True 1= " + res);
      } else {
         System.out.println("Boolean  False 22= " + res);
      }
   }
}