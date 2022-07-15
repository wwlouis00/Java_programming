class Select {
   public static void main(String[] args) {
      for(int a = 5; a <= 8; a++) {
         System.out.print(a + "÷3 = " + a/3);
         switch (a % 3) {
            case 1:
               System.out.println(" ：餘數為1。");
               break;
            case 2:
               System.out.println(" ：餘數為2。");
               break;
            default:
               System.out.println(" ：餘數為0。");
               break;
         }
      }
   }
}