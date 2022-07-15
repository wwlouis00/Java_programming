class Score {
   public static void main(String[] args) {
      int s = 65;

      System.out.println("你的分數為" + s +"分。");

      if(s < 70) {
         System.out.println("到達平均還差" + (70-s) + "分");
         System.out.println("再加油吧！");
      } else {
         System.out.println("做得很好！");
      }
   }
}