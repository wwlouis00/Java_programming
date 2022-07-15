interface Greet1 {
   void greet();
}
interface Greet2 {
   public default void afternoon(){
      System.out.println("�z�n");
   }
}
interface Greet3 {
   static void evening(){
      System.out.println("�ߦw");
   }
} 

class Greeting implements Greet1, Greet2 {
   public void greet() {
      System.out.println("���w�I");
   }
}

class Say{
   public static void main(String[] args){
      Greeting g = new Greeting(); 
         g.greet();
         g.afternoon();
         Greet3.evening();
   }
}