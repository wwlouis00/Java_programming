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
                System.out.println("沒有" + a + "的中文翻譯名稱。");
            else
                System.out.println(jword);

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("檔案不存在。");
        } catch (Exception e) {
            System.out.println("命令列參數不存在。");
        }
    }
}