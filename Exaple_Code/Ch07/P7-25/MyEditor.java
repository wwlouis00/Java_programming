import java.io.*;

class MyEditor {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter(args[0]);
            BufferedReader in =
              new BufferedReader(new InputStreamReader(System.in));
            
            String lf = System.getProperty("line.separator");
            String data;
            
            int i = 1;
            System.out.println("�п�J��ơC(��J0�N����)");
            while(!(data = in.readLine()).equals("0"))
              out.write(data + lf);
            
            System.out.println(" ��J�����C");
            out.close();
        } catch (Exception e) {
            System.out.println(e); // �o�Ϳ��~�ɷ|��ܸӤ��e
        }
    }
}