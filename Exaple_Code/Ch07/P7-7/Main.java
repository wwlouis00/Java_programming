class Main {
    public static void main(String[] args){
        try {
            back(args[0]);
        } catch(Exception e) {
            System.out.println("�L�R�O�C�ѼơC");
        } finally {
            System.out.println("�{���פ�C");
        }
    }
    static void back(String a) throws Exception {
        System.out.println(a);
    }
}