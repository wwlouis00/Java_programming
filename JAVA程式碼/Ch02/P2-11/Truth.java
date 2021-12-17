class Truth {
   public static void main(String[] args) {
      String right = "¥¿½T", wrong = "¤£¥¿½T";
      boolean value;

      value = true;
      String answer = value ? right : wrong;
      System.out.println(answer);

      value = false;
      answer = value ? right : wrong;
      System.out.println(answer);
   }
}