class Test {
    void show() {
        System.out.println("01") ;
    }
    void show(int a) {
        System.out.println("02") ;
    }
    void show(int a,int b) {
        System.out.println("02") ;
    }
    void show(int a , String s) {
        System.out.println("02") ;
    }
    void show(String s , int a) {
        System.out.println("02") ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show() ;
        t.show(1) ;
    }
}