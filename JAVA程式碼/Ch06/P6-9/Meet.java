interface Greet {
   void greet();
}

interface Bye extends Greet {
   void bye();
}

class Greeting implements Bye {
   public void greet() {
      System.out.println("�z�n�I");
   }

   public void bye() {
      System.out.println("�A���C");
   }
}

class Meet {
   public static void main(String[] args) {
      Greeting greeting = new Greeting();
      greeting.greet();
      greeting.bye();
   }
}