// super keyword can be used to invoke immediate parent class method

class A {
    void m1() {
        System.out.println("In class A") ;
    }
}
class B extends A {

    void m1() {
        System.out.println("In class B1") ;
    }

    void show(int a) {
        this.m1() ; // calls current class method
        super.m1() ;// calls parent class method
        System.out.println("In class B2") ;
    }
    public static void main(String [] args) {
        B obj = new B() ;
        obj.show(30) ;
    }
}