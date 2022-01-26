class Test {
    synchronized void show(int a) {
        System.out.println("01") ;
    }
}

class Xyz extends Test {
    void show(int b){ // cannot override
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}
// synchronized method can use any method and affect nothing
// strictfp method can use any method and affect nothing