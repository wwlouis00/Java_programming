class Sum {
   public static void main(String[] args) {
      int s = 0, i = 0;

      do {
         i = ++i;
         s = s + i;
      } while(i < 10);
      System.out.println(
         "1加到" + i + "的總和為" + s);
  }
}