import java.io.*;

class WriteText {
   public static void main(String[] args) {
      try {
          FileWriter out = new FileWriter("math.txt");
          String lf = System.getProperty("line.separator");
          int a = 10, b = 5;
          out.write(" �[�k�G");
          out.write(a + "+" + b + "=" + (a+b) + lf);
          out.write(" ��k�G");
          out.write(a + "-" + b + "=" + (a-b) + lf);
          out.close();
      } catch (Exception e) {
          System.out.println(e);
      }
    }
}