import java.io.*;

class ReadText3 {
   public static void main(String[] args) {
      try(FileReader in = new FileReader(args[0])) {
      int c;
      String s = new String();
      while((c = in.read()) != -1)
         s = s + (char)c;
      System.out.print(s);
   } catch (IOException ie) {
      System.out.println("檔案不存在。");
   } catch (Exception e) {
      System.out.println("命令列參數不存在。");
      }
   }
}