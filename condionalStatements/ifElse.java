package condionalStatements;
 class ifElse {
    public static void main(String args[]) {
        int x = 100;
        int y = 500;
        int z = 150;

        if(x > y && x > z)
        
            System.out.println(x +" is greatest value");        
           
        else if(y > z)
            System.out.println(y);

        else 
            System.out.println(z);
    }
}
