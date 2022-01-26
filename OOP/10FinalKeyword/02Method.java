class A {
    final void m1() { // m1 method can not be overrided
        System.out.println("In class A") ;
    }
}
class B extends A {

    // void m1() { // error: m1() in B cannot override m1() in A
    //     System.out.println("In class B") ;
    // }

    public static void main(String [] args) {
        B obj = new B() ;
        obj.m1() ;
    }
}