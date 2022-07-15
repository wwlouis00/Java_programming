import java.util.*;

class ListTest {
   public static void main(String[] args) {
      ArrayList<String> lst = new ArrayList<String>();
      String a = "a", b = "b", c = "c", d = "d";

      lst.add(a);
      lst.add(b);
      lst.add(c);
      System.out.println(lst);

      lst.add(2, d);
      System.out.println(lst);

      lst.set(1, d);
      System.out.println(lst);
   }
}