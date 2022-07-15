import java.io.*;

class TransWord {
    public static void main(String[] args) {
        try {
            BufferedReader in =
              new BufferedReader(new FileReader("mydic.txt"));
            String a = args[0];

            String eword, jword = null;
            while((eword = in.readLine()) != null) {
                if(a.equals(eword)) {
                    jword = in.readLine();
                    break;
                }
            }

            if(jword == null)
                System.out.println("�S��" + a + "������½Ķ�W�١C");
            else
                System.out.println(jword);

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("�ɮפ��s�b�C");
        } catch (Exception e) {
            System.out.println("�R�O�C�ѼƤ��s�b�C");
        }
    }
}