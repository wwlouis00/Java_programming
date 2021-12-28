
class IcCard{
	long id;
	int money;
	void showInfo()
	{
		System.out.println("卡片卡號" + id);
		System.out.println(", 餘額  "+ money +"元");
	}
}


public class NTUT20211228 {
	public static void main(String[] args) {
		IcCard myCard = new IcCard();
		myCard.id = 0x336789AB;
		myCard.money = 300;
		
		myCard.showInfo();
	}
	
	public static void main_2(String[] args) {
		IcCard myCard = new IcCard();
		myCard.id = 0x336789AB;
		myCard.money = 300;
		
		myCard.showInfo();
	}
}
