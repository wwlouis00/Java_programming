class Select {
   public static void main(String[] args) {
      for(int a = 5; a <= 8; a++) {
         System.out.print(a + "��3 = " + a/3);
         switch (a % 3) {
            case 1:
               System.out.println(" �G�l�Ƭ�1�C");
               break;
            case 2:
               System.out.println(" �G�l�Ƭ�2�C");
               break;
            default:
               System.out.println(" �G�l�Ƭ�0�C");
               break;
         }
      }
   }
}