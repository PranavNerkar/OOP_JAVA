class Test {
    void show(int a) {
        System.out.println(a) ;
    }

    void show(String c) {
        System.out.println("02") ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show(1) ;
        t.show("abc") ;
        t.show('a') ;
    }
}