import java.io.*;

class NumberGame {
    public static void main(String[] args) {
        try {
            BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
            int a, b = 7;
            System.out.println("請輸入姓名");
            String name = in.readLine();
            System.out.println("猜數字遊戲！請輸入0到9的數字");
            String c = in.readLine();
            a = Integer.parseInt(c);
            while(a != b) {
                if((a == b-1) || (a == b+1))
                    System.out.println("可惜！");
                else if(a > b+1)
                    System.out.println("再小一點的數字");
                else if(a < b-1)
                    System.out.println("再大一點的數字");
                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("答對了！" + name + "，恭喜您！！");
        } catch(Exception ie) {
            System.out.println("發生錯誤");
        }
    }
}