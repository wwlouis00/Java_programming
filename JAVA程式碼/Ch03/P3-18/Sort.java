class Sort {
   public static void main(String[] args) {
      int a[] = {210, 19, 72, 129, 34};
      int b = a.length;
      int i, j, k;

      System.out.println("��ܸ��");
      for(i = 0; i < b; i++)
         System.out.print(a[i] + " ");
      System.out.println();

      for(j = 0; j < b-1; j++) {
         for(i = j+1; i < b; i++) {
            if(a[j] > a[i]) {
               k = a[j];
               a[j] = a[i];
               a[i] = k;
            }
         }
      }

      System.out.println("��ƱƧ�");
      for(i = 0; i < b; i++)
         System.out.print(a[i] + " ");
      System.out.println();
   }
}