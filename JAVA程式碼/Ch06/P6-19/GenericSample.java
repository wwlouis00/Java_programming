import java.util.*;

class GenericSample {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            lst.add(i * 3); //�̧ǼW�[ 3 ������
        }

        for(int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }
}