interface Greet {
   void greet();
}

interface Talk {
   void talk();
}

class Morning implements Greet,Talk {
   public void greet() {
      System.out.println("���w�I");
   }

   public void talk() {
      System.out.println("���ѤѮ�u�n�C");
   }
}

class Meet {
   public static void main(String[] args) {
      Morning morning = new Morning();
      morning.greet();
      morning.talk();
   }
}