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
         System.out.println("�ɮפ��s�b�C");
      } catch (Exception e) {
         System.out.println("�R�O�C�ѼƤ��s�b�C");
      } finally {
         if(in != null)
            try {
               in.close();
            } catch(IOException ie2) {
               System.out.println("�ɮת�close���ѡC");
            }
      }
   }
}