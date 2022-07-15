import java.io.*;

class ReadText2 {
   public static void main(String[] args) {
      FileReader in = null;
      try {
         in = new FileReader(args[0]);
         int c;
         String s = new String();
         while((c = in.read()) != -1)
            s = s + (char)c;
         System.out.print(s);
      } catch (IOException ie) {
         System.out.println("檔案不存在。");
      } catch (Exception e) {
         System.out.println("命令列參數不存在。");
      } finally {
         if(in != null)
            try {
               in.close();
            } catch(IOException ie2) {
               System.out.println("檔案的close失敗。");
            }
      }
   }
}