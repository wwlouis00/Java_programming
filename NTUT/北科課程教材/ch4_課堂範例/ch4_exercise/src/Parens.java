public class Parens {
  public static void main(String[] argv) {
    int i = 1 + 3 * 5 + 7; // ���� 3*5
    System.out.println("1 + 3 * 5 + 7   = " + i);
		
     // ���� 1+3
    System.out.println("(1 + 3) * 5 + 7 = " + i);
		
     // ���� 5+7
    System.out.println("1 + 3 * (5 + 7) = " + i);
  }
}
