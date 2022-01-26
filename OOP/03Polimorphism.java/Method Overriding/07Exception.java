class Test {
    void show(int a) throws RuntimeException{ // if here throws an exception then child must throws same or its subclass Exception
        System.out.println(a) ;
    }
}

class Xyz extends Test {
    void show(int b) throws ArithmeticException{  // same or child Excepton of parent class exception
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show(10) ;

        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}