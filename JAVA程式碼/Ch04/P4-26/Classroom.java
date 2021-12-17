class Test {
    String subject; // ���@�Ǭ�W��
    int point;      // ���@�o��

    void setPoint(String s, int p) { // �]�w�o������k
        subject = s;
        point = p;
    }

    String getPoint() { // ���o�Ĥ@��o������k
        return subject + ":" + point;
    }
}

class Student {
    int id;      // ���@�ǥͪ��Ǹ�
    String name; // ���@�m�W
    int subnum;  // ���@�Ǭ��
    Test[] test; // ���@test���O������}�C

    Student(int i, String n, int s) { // �غc�l
        id = i;
        name = n;
        subnum = s;
        test = new Test[s];
        for(int j = 0; j < s; j++)
            test[j] = new Test(); //�w��}�C���C�Ӥ���
                                  //�z�Lnew�إߪ���
    }

    String getName() { // ���o�m�W����k
        return id + ":" + name;
    }

    int getGrade() { // ���o�`������k
        int sum = 0;
        for(int i = 0; i < subnum; i++)
            sum += test[i].point;
        return sum;
    }


// ��k���h��
    int getGrade(int a) { // ���o��������k
        int base = 100 * subnum / a;
        int rank = getGrade() / base + 1;
        return (rank > a) ? a : rank; //��rank��a�j���ɭԦ^��a�A
                                      //��L���Ϋh�^��rank�C
    }

    void printScore() { // ��ܦ��Z����k
        System.out.println(getName());
        for(int i = 0; i < subnum; i++)
            System.out.print(test[i].getPoint() + " ");
        System.out.println();
        System.out.println("�`��" + getGrade());
        int rank = 5;
        System.out.println(rank + "���ŵ���" + getGrade(rank));
        System.out.println();
    }
}

class Classroom {
    public static void main(String[] args) {
        Student taro = new Student(12, "taro", 3);
        taro.test[0].setPoint("���", 95);
        taro.test[1].setPoint("�ƾ�", 83);
        taro.test[2].setPoint("�^��", 76);
        taro.printScore();

        Student jiro = new Student(7, "jiro", 3);
        jiro.test[0].setPoint("���", 66);
        jiro.test[1].setPoint("�ƾ�", 97);
        jiro.test[2].setPoint("�^��", 72);
        jiro.printScore();
    }
}
