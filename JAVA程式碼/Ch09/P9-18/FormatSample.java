import java.util.*;
class FormatSample {
   public static void main(String[] args) {
      Date c = new Date();
      System.out.printf("%tY�~ %tm�� %td��\n", c, c, c);
      System.out.printf("%tH �I %tM ��%tS ��\n", c, c, c);
   }
}