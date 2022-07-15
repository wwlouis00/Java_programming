class Main {
    public static void main(String[] args){
        try {
            back(args[0]);
        } catch(Exception e) {
            System.out.println("無命令列參數。");
        } finally {
            System.out.println("程式終止。");
        }
    }
    static void back(String a) throws Exception {
        System.out.println(a);
    }
}