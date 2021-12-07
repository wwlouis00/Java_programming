import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

public class Ntut107362535 {

	public static void main(String[] args) 
	{
		int i = 1;
		while (i>0) {
			int num;
			int password = 1111;
			System.out.println("請輸入四位數密碼 :");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			System.out.println(num);
			if (num == password) {
				System.out.println("恭喜你!\n");
				break;
			}
			else if (i>3) {
				System.out.println("請重新輸入");
				break;			
			}
			else 
			{
				System.out.println("第"+i+"輸入錯誤");
				i++;
				continue;
			}
		}
	}

	public static void main_1(String[] args) {
		for(int i =1;i<=9;i++) {
			System.out.println("第"+i+"輪");
			if (i==3)
			{
				continue;
			}
			for(int j=1;j<=9;j++) 
			{
				System.out.println(i*j);
			}
				
		}
	}

}
