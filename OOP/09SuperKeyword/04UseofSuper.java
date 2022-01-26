// super() can be used to invoke immediate parent class Constructor

class A {
    A() {
        System.out.println("In A Cnstructor") ;
    }
}
class B extends A {
    
    B() {
        super() ; // bydefault add by compiler
        System.out.println("In B COnstructor") ;
    }
    void sss() {

    }
    public static void main(String [] args) {
        B obj = new B() ;
        obj.sss() ;
    }
}