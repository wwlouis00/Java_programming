class Rank {
   public static void main(String[] args) {
      int num = 1000;
      System.out.print(num + "是");

      if(0 <= num && num <= 9)
         System.out.println("1位數。");
      else if(10 <= num && num <= 99)
         System.out.println("2位數。");
      else if(100 <= num && num <= 999)
         System.out.println("3位數。");
      else
         System.out.println("4位數以上。");
   }
}