class StringClass {
   public static void main(String[] arg) {
      String a = "Javaø��";
      int len = a.length();
      String b = a.substring(len-2, len);
      int c = b.compareTo("ø��");
      System.out.println("�u"+ a +"�v���̫��Ӧr���u" + b +"�v�C");
      System.out.println((c==0 ? "���T�O" : "�ä��O") + "ø���C");
   }
}