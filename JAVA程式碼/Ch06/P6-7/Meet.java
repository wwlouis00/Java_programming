interface Greet {
   void greet();
}

interface Talk {
   void talk();
}

class Morning implements Greet,Talk {
   public void greet() {
      System.out.println("早安！");
   }

   public void talk() {
      System.out.println("今天天氣真好。");
   }
}

class Meet {
   public static void main(String[] args) {
      Morning morning = new Morning();
      morning.greet();
      morning.talk();
   }
}