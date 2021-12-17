class Or {
   public static void main(String[] args) {
      int a = 3, b = 4;
      boolean x, y;

      x = (a < 0);
      y = (b > 0);
      System.out.println((a == 3) && (b == 3));
      System.out.println(x || y);
  }
}