class Truth {
   public static void main(String[] args) {
      String right = "���T", wrong = "�����T";
      boolean value;

      value = true;
      String answer = value ? right : wrong;
      System.out.println(answer);

      value = false;
      answer = value ? right : wrong;
      System.out.println(answer);
   }
}