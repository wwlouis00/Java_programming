class Continue {
   public static void main(String[] args) {
      int a, b = 1;

      for(a = 0; a < 4; a++) {
         if(a + b == 2)
            continue;
         System.out.println(a + "+" + b + "=" + (a+b));
      }
   }
}