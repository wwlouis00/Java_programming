import java.util.*;

class ForLoopSample2 {
   public static void main(String[] args) {
      ArrayList<String> lst = new ArrayList<String>();

      lst.add(new String("0"));
      lst.add(new String("1"));
      lst.add(new String("2"));

      for (String s : lst) {
         System.out.println(s);
      }
   }
}