class Shift {
   public static void main(String[] args) {
      byte a = 10;
      byte b = 9;
      byte c = 1;
      System.out.println(a + " & " + b + " = " + (a & b));
      System.out.println(a + " | " + b + " = " + (a | b));
      System.out.println(a + " ^ " + b + " = " + (a ^ b));
      System.out.println("~10 = " + (~a));
      System.out.println(a + " << " + c + " = " + (a << c));
      System.out.println(a + " >>> " + c + " = " + (a >>> c));
      System.out.println(-1*a + " >> " + c + " = " + (-1*a >> c));
   }
}