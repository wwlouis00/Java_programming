import java.util.Scanner;

class ScannerSample {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("請輸入車站名稱：");
      String ekimei = sc.next();
      System.out.print("請輸入第幾月台");
      int bansen = sc.nextInt();

      sc.close();

      System.out.println("我在" + ekimei + "車站的" + bansen + "號月台等您");
   }
}