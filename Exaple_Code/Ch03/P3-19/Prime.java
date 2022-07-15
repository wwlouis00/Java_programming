class Prime {
   public static void main(String[] args) {
      int max = 100; // 碝т借计程计
      boolean[] a = new boolean[max]; // 耞琌借计皚

      // 皚﹍砞﹚
      for(int i = 0; i < max; i++)
         a[i] = true;

      // 耞琌借计
      for(int i = 2; i < max; i++) {
         if(a[i-1]) {
            for(int j = 2; i*j <= max; j++)
               a[i * j - 1] = false;
         }
      }

      // 陪ボ挡狦
      for(int i = 1; i < max; i++) {
         if(a[i])
            System.out.print((i + 1) + " ");
      }
      System.out.println();
   }
}