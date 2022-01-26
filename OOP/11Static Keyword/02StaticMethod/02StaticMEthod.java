// Rule 02 : Static methods can be accessed directly by the class name and does not need any method
class Test {
    void run() {
        
    }
    
    static void fun() {

    }
}

class StaticMethod {
    void disp() {

    }
    static void show() {

    }
    public static void main(String[] args) {
        // disp() ; // cannot access static in nonstatic context
        show() ;
        StaticMethod.show() ; // directly access using class name

        StaticMethod sm = new StaticMethod() ;
        sm.disp() ;


        // fun() ; // method fun is undefined for static method main
        // run() ;  to call run we have to create an object of class Test
        Test.fun() ;
        Test t = new Test() ;
        t.run() ;
    }
}
