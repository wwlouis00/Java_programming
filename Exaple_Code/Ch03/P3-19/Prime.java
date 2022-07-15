class Prime {
   public static void main(String[] args) {
      int max = 100; // �M���ƪ��̤j�ƭ�
      boolean[] a = new boolean[max]; // �P�_�O�_����ƪ��}�C

      // �}�C��l�]�w
      for(int i = 0; i < max; i++)
         a[i] = true;

      // �P�_�O�_�����
      for(int i = 2; i < max; i++) {
         if(a[i-1]) {
            for(int j = 2; i*j <= max; j++)
               a[i * j - 1] = false;
         }
      }

      // ��ܵ��G
      for(int i = 1; i < max; i++) {
         if(a[i])
            System.out.print((i + 1) + " ");
      }
      System.out.println();
   }
}