class Test {
    static void show(int a) {
        System.out.println("01") ;
    }
}

class Xyz extends Test {
    // void show(int b){ // cannot override
    //     System.out.println(b) ;
    // }
    void gun(int b){ // cannot override
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Xyz x = new Xyz() ;
        show(20) ; // we can access static method directly
        x.gun(2) ;
    }
}