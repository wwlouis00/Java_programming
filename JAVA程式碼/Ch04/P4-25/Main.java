class Main {
    public static void main(String[] args){
        int i;

        if(args.length == 0) {
            System.out.println("�S���R�O�C�ѼơC");
        } else {
            for(i = 0; i < args.length; i++)
                System.out.println((i+1) + ":" + args[i]);
        }
    }
}