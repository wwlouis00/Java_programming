class StringClass {
   public static void main(String[] arg) {
      String a = "Java繪本";
      int len = a.length();
      String b = a.substring(len-2, len);
      int c = b.compareTo("繪本");
      System.out.println("「"+ a +"」的最後兩個字為「" + b +"」。");
      System.out.println((c==0 ? "的確是" : "並不是") + "繪本。");
   }
}