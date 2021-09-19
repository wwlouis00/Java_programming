package ex01;

import java.util.Scanner;

public class Hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入姓名: ");
		String strName = scn.next();
		System.out.print("Hi! "+ strName + ",歡迎來到Java世界!");
		scn.close();

	}

}
