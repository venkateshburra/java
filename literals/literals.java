package literals;
 class literals {
    public static void main(String args[]) {
        char c = 'a';
        c++;
        int num1 = 0b101;
        int num2 = 0x7E;
        int num3 = 100_00_00_00;
        double num4 = 56;
        double num5 = 12e10;

        System.err.println(c);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
