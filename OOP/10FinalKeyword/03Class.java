final class A { // class A cannot be inherited final here
    void m1() {
        System.out.println("In class A") ;
    }
}
// class B extends A { //error: cannot inherit from final A }
class B {

    void m1() {
        System.out.println("In class B") ;
    }
    
    public static void main(String [] args) {
        B obj = new B() ;
        obj.m1() ;
    }
}