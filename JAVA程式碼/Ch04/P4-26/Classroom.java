class Test {
    String subject; // 欄位　學科名稱
    int point;      // 欄位　得分

    void setPoint(String s, int p) { // 設定得分的方法
        subject = s;
        point = p;
    }

    String getPoint() { // 取得第一科得分的方法
        return subject + ":" + point;
    }
}

class Student {
    int id;      // 欄位　學生的學號
    String name; // 欄位　姓名
    int subnum;  // 欄位　學科數
    Test[] test; // 欄位　test類別的物件陣列

    Student(int i, String n, int s) { // 建構子
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j = 0; j < s; j++)
            test[j] = new Test(); //針對陣列的每個元素
                                  //透過new建立物件
    }

    String getName() { // 取得姓名的方法
        return id + ":" + name;
    }

    int getGrade() { // 取得總分的方法
        int sum = 0;
        for(int i = 0; i < subnum; i++)
            sum += test[i].point;
        return sum;
    }


// 方法的多載
    int getGrade(int a) { // 取得評等的方法
        int base = 100 * subnum / a;
        int rank = getGrade() / base + 1;
        return (rank > a) ? a : rank; //當rank比a大的時候回傳a，
                                      //其他情形則回傳rank。
    }

    void printScore() { // 顯示成績的方法
        System.out.println(getName());
        for(int i = 0; i < subnum; i++)
            System.out.print(test[i].getPoint() + " ");
        System.out.println();
        System.out.println("總分" + getGrade());
        int rank = 5;
        System.out.println(rank + "等級評等" + getGrade(rank));
        System.out.println();
    }
}

class Classroom {
    public static void main(String[] args) {
        Student taro = new Student(12, "taro", 3);
        taro.test[0].setPoint("國文", 95);
        taro.test[1].setPoint("數學", 83);
        taro.test[2].setPoint("英文", 76);
        taro.printScore();

        Student jiro = new Student(7, "jiro", 3);
        jiro.test[0].setPoint("國文", 66);
        jiro.test[1].setPoint("數學", 97);
        jiro.test[2].setPoint("英文", 72);
        jiro.printScore();
    }
}
