abstract class Test {
    abstract void show(int a) ; // abstract method
}

class Xyz extends Test {
    void show(int b){ // giving body to abstract method
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        // We cannot create object of an abstract class
        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}