import java.io.*;

class NumberGame {
    public static void main(String[] args) {
        try {
            BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
            int a, b = 7;
            System.out.println("�п�J�m�W");
            String name = in.readLine();
            System.out.println("�q�Ʀr�C���I�п�J0��9���Ʀr");
            String c = in.readLine();
            a = Integer.parseInt(c);
            while(a != b) {
                if((a == b-1) || (a == b+1))
                    System.out.println("�i���I");
                else if(a > b+1)
                    System.out.println("�A�p�@�I���Ʀr");
                else if(a < b-1)
                    System.out.println("�A�j�@�I���Ʀr");
                c = in.readLine();
                a = Integer.parseInt(c);
            }
            System.out.println("����F�I" + name + "�A���߱z�I�I");
        } catch(Exception ie) {
            System.out.println("�o�Ϳ��~");
        }
    }
}