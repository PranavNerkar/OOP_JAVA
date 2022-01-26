class StaticBlock {
    
    int i = 10 ;

    // if() { }  ):- main method chya baher chalat nahi

    static {
        System.out.println("Static Block02") ;
    }

    public static void main(String[] args) {
        System.out.println("In main method") ;
    }

    static {
        System.out.println("Static Block03") ;
    }
}