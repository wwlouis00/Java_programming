class Rank {
   public static void main(String[] args) {
      int num = 1000;
      System.out.print(num + "�O");

      if(0 <= num && num <= 9)
         System.out.println("1��ơC");
      else if(10 <= num && num <= 99)
         System.out.println("2��ơC");
      else if(100 <= num && num <= 999)
         System.out.println("3��ơC");
      else
         System.out.println("4��ƥH�W�C");
   }
}