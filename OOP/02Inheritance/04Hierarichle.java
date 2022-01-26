class A {
    void showA() {
        System.out.println("A Method") ;
    }
}

class B extends A{
    void showB() {
        System.out.println("A Method") ;
    }
}

class C extends A {
    void showC() {
        System.out.println("A Method") ;
    }

    public static void main(String[] args) {
        A a = new A() ;
        a.showA() ;

        B b = new B() ;
        b.showA() ;
        b.showB() ;

        C c = new C() ;
        c.showA() ;
        c.showC() ;
    }
}