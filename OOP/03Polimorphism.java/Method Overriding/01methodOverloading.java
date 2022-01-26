class Test {
    void show() {
        System.out.println("1") ;
    }
}

class Xyz extends Test {
    void show() {
        System.out.println("2") ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show() ; // calls Test Class Method

        Xyz x = new Xyz() ;
        x.show() ; // calls Xyz class Method
        // if we want to call method of Test class using Xyz object it can be done by super Keyword
    }
}