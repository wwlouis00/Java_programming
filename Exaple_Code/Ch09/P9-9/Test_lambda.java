@FunctionalInterface
interface CalcPower{
    public Integer calc(Integer n);
}

class Test_lambda {
   public static void main(String[] arg) {
      CalcPower pownum = n -> {
         return n * n;
      };
      System.out.println(pownum.calc(11));
   }
}