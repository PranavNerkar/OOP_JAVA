class Test {
    void show(int a) {
        System.out.println("01") ;
    }
}

class Xyz extends Test {
    void show(int b){
        super.show(10) ; // refers to parent class method
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}