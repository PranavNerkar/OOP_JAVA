// use to initialize static members o initialize static members
// use to load Native methods in static block
class StaticBlock {
    
    static int i ;

    // static void show() ; but we cant give body to static method in static block
    
    static {
        
        i = 100 ; // use to initialize static members
        System.out.println("Static Block01") ;
    }

    public static void main(String[] args) {
        System.out.println("In main method") ;
    }
}