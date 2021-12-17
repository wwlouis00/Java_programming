import java.io.*;

class Hello implements Serializable {
   void check() {
      System.out.println("±z¦n");
   }
}
public class SerialStream {
   public static void main(String[] args) {
      Hello hello = new Hello();
      hello.check();
      try {           
         FileOutputStream outFile = new FileOutputStream("serialcheck.dat");
         ObjectOutputStream outObject = new ObjectOutputStream(outFile);
         outObject.writeObject(hello);
         outObject.close();  
         outFile.close();

         FileInputStream inFile = new FileInputStream("serialcheck.dat");
         ObjectInputStream inObject = new ObjectInputStream(inFile);
         Hello chkHello = (Hello)inObject.readObject();
         inObject.close();
         inFile.close();

         chkhello.check();
      } catch (IOException e) {
      } catch (ClassNotFoundException e) {
      }
    }
}