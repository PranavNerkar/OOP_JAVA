class Test {
    Test(int x) {
        System.out.println(x) ;
    }
    void run() {
        
    }
    public static void main(String[] args) {
        // Test t = new Test() ; if we write para Const so this has to be a parameter
        Test t1 = new Test(10) ;
        t1.run() ;
    }
}