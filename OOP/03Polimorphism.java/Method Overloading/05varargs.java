// int... a  it is a variable argument which accepts nul or multiple argumen
class Test{
    void shoe(int x) {
        System.out.println("Int") ;
    }

    void shoe(int... x) { // varargs 
        System.out.println("Variable Int") ;
    }
    public static void msin(String [] args) {
        Test t = new Test() ;
        t.shoe(1) ;
        t.shoe() ;
        t.shoe(10,20,30) ;
    }
}