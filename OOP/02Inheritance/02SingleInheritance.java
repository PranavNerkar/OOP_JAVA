class A {
    void showA() {
        System.out.println("A Method") ;
    }
}
class B extends A {
    void showB() {
        System.out.println("B Method") ;
    }
    public static void manin(String [] args) {
        A obj = new A() ;
        obj.showA() ;

        B obj1 = new B() ;
        obj1.showA() ;
        obj1.showB() ;
    }
}