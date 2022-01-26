interface I1 {
    
    int a = 10 ; // by default public static final
    public static final int b = 20 ;

    public abstract void show() ; // By default public abstract
    void goo() ;

    default void disp() {
        // We can create Concrete method using default Modifier
    }

    static void run() {
        // We can create concrete method using static keyword 
        // but its btdefault public
        // we cant access it out of interfave
    }

    private void fun() {
        // concrete method using private
    }
}

class Test implements I1 {
    
    public void goo() {

    }

    public void show() { // In interface all methods are public abstract so we have to give body to a method using public modifier
        System.out.println("In Show") ;
    }
    public static void main(String[] args) {
        
        // I1 i =new I1() ; we cant create an object of an interface

        Test t = new Test() ;
        t.show() ;

        t.disp() ;
        // run() ; it is static in interface
        // fun() ; private i Interface
    }
}