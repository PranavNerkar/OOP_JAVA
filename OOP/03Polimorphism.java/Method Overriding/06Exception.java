class Test {
    void show(int a) {
        System.out.println(a) ;
    }
}

class Xyz extends Test {
    // if Parent class method dosent throws any exception then child classs method only throws Unchecked Exception(runtime)
    void show(int b) throws ArithmeticException{ // Unchecked Exception(runtime Exceptin)
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show(10) ;

        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}