import java.io.*;
import java.util.*;

class QandA {
    String question; // ���D���r��
    String[] answer; // ���ת��r��

    QandA(String question, String answerline) {
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline, ",");
        answer = new String[token.countTokens()];
        for(int i = 0; token.hasMoreTokens(); i++)
            answer[i] = token.nextToken();
    }

    // �P�w�����T���סA�^�ǥ��T�^�����r��
    String[] getCorrect(String inputline) {
        // ���Φ^�����e
        StringTokenizer token = new StringTokenizer(inputline, ",");
        int inputnum = token.countTokens();
        String[] input = new String[inputnum];
        for(int i = 0; token.hasMoreTokens(); i++)
            input[i] = token.nextToken();

        // �����ˬd
        for(int i = 1; i < inputnum; i++)
            for(int j = i-1; j >= 0; j--)
                if(input[i].equals(input[j])) // ���e�w���ۦP�r���
                    input[i] = "0"; // �b�o�Ӧr��N�J���~�^��(0)
        // ���
        int correctnum = 0; // ���T�^�����ƶq
        for(int i = 0; i < inputnum; i++)
            for(int j = 0; j < answer.length; j++)
                if(input[i].equals(answer[j]))
                    correctnum++;

        String[] correct = new String[correctnum]; // ���T���^��
        int k=0;
        for(int i = 0; i < inputnum; i++)
            for(int j = 0; j < answer.length; j++)
                if(input[i].equals(answer[j])){
                    correct[k] = input[i];
                    k++;
                }
        return correct;
    }
}

class Quiz {
    static String getInput() {
        String input = new String();
        try {
            BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            return input;
        }
    }

    public static void main(String[] args) {
        // ���D�P����
        QandA qa = new QandA("�P���@��P���Ѫ��^��",
            "Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday");
        System.out.print("�i���D�j�мg�X" + qa.question + 
            "�A���׽ХΡu,�v�ӰϹj\n> ");

        int answernum = qa.answer.length; // �^�����Ӽ�
        String input = getInput();
        String[] correct = qa.getCorrect(input);
        int correctnum = (correct == null) ? 0 : correct.length;

        // ���諸�^���ƶq���O0�ɡA��ܥ��T������
        if(correctnum > 0) {
            System.out.print("���T���סG");
            for( int j = 0; j < correctnum; j++)
                System.out.print(correct[j] + " ");
            System.out.println();
        }
        // ��ܥ��T���ת��ƶq
        System.out.print(correctnum + " / " + answernum + " ���T");

        if(correctnum == answernum) // ���������
            System.out.println(" �ӴΤF�I�I");
        else if(correctnum > answernum/2) // ����W�L�@�b��
            System.out.println(" ���o�ܦn�I");
        else // ����C��@�b��
            System.out.println(" �ٻݭn�A�[�o��C");
    }
}