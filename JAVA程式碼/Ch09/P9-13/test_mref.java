import java.util.*;
import java.util.function.*;

class test_mref {
   public static void main(String[] args) {
      class A {
         String ss;
         A(String s) {
            ss = s;
         }
      }
      
      Function<String, A> f = A::new;
      A a = f.apply("¸ÖÂ´");
      System.out.println(a.ss);
   }
}