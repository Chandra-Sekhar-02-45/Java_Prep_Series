class typeCast{

    public static void main(String args[]){
       double a = 27.67;
       int n = (int) a;
       System.out.println(n);

       float b = (float) n;
       System.out.println(b);

        int a2=257;
        byte b2=(byte) a2; // 257%256 = 1 ( range of byte is 256 )
        System.out.println(b2);

    }
        }