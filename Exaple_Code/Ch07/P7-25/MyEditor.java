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
            System.out.println("請輸入資料。(輸入0就結束)");
            while(!(data = in.readLine()).equals("0"))
              out.write(data + lf);
            
            System.out.println(" 輸入結束。");
            out.close();
        } catch (Exception e) {
            System.out.println(e); // 發生錯誤時會顯示該內容
        }
    }
}