class StaticBlock {
    
    static {
        System.out.println("Static Block01") ;
    }
    // static block can execute till jdk version 1.6 )- after that we have to write main method to execute it
    static {
        System.out.println("Static Block02") ;
    }

    public static void main(String[] args) {
        System.out.println("In main method") ;
    }

    static {
        System.out.println("Static Block03") ; // this will also executes before main method
    }
}
// work on top to bottom principle