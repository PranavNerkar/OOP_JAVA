class Test {
    int i ;

    void set(int i) {
        i = i ; // both are local variables
    }
    void show() {
        System.out.println(i) ; // this i is instance variable
    }
}

class XYZ {
    public static void main(String [] args) {
        Test t = new Test() ;
        t.set(10) ;
        t.show() ; // 0 default value of insatnce variable
    }
}