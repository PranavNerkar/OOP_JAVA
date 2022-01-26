class Test {
    int i ;

    void set(int x) {
        i = x ;
    }
    void show() {
        System.out.println(i) ;
    }
}

class XYZ {
    public static void main(String [] args) {
        Test t = new Test() ;
        t.set(10) ;
        t.show() ; // 10
    }
}