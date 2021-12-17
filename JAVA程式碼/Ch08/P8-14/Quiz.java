import java.io.*;
import java.util.*;

class QandA {
    String question; // 問題的字串
    String[] answer; // 答案的字串

    QandA(String question, String answerline) {
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline, ",");
        answer = new String[token.countTokens()];
        for(int i = 0; token.hasMoreTokens(); i++)
            answer[i] = token.nextToken();
    }

    // 判定為正確答案，回傳正確回答的字串
    String[] getCorrect(String inputline) {
        // 切割回答內容
        StringTokenizer token = new StringTokenizer(inputline, ",");
        int inputnum = token.countTokens();
        String[] input = new String[inputnum];
        for(int i = 0; token.hasMoreTokens(); i++)
            input[i] = token.nextToken();

        // 重複檢查
        for(int i = 1; i < inputnum; i++)
            for(int j = i-1; j >= 0; j--)
                if(input[i].equals(input[j])) // 先前已有相同字串時
                    input[i] = "0"; // 在這個字串代入錯誤回答(0)
        // 比對
        int correctnum = 0; // 正確回答的數量
        for(int i = 0; i < inputnum; i++)
            for(int j = 0; j < answer.length; j++)
                if(input[i].equals(answer[j]))
                    correctnum++;

        String[] correct = new String[correctnum]; // 正確的回答
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
        // 問題與答案
        QandA qa = new QandA("星期一到星期天的英文",
            "Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday");
        System.out.print("【問題】請寫出" + qa.question + 
            "，答案請用「,」來區隔\n> ");

        int answernum = qa.answer.length; // 回答的個數
        String input = getInput();
        String[] correct = qa.getCorrect(input);
        int correctnum = (correct == null) ? 0 : correct.length;

        // 當答對的回答數量不是0時，顯示正確的答案
        if(correctnum > 0) {
            System.out.print("正確答案：");
            for( int j = 0; j < correctnum; j++)
                System.out.print(correct[j] + " ");
            System.out.println();
        }
        // 顯示正確答案的數量
        System.out.print(correctnum + " / " + answernum + " 正確");

        if(correctnum == answernum) // 全部答對時
            System.out.println(" 太棒了！！");
        else if(correctnum > answernum/2) // 答對超過一半時
            System.out.println(" 做得很好！");
        else // 答對低於一半時
            System.out.println(" 還需要再加油喔。");
    }
}