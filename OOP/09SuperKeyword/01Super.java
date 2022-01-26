class A {
    int a = 10 ;
}
class B extends A {
    int a = 20 ;
    void show(int a) {
        System.out.println(a) ;
        System.out.println(this.a) ; // refers to current class instance variable
        System.out.println(super.a) ; // refers to parent class instance variable
    }
    public static void main(String [] args) {
        B obj = new B() ;
        obj.show(30) ;
    }
}