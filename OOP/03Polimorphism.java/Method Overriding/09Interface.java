interface Test {
    void show(int a) ; // abstract method
}

class Xyz implements Test {
    public void show(int b){ // giving body to abstract method
        System.out.println(b) ;// interface la body detanna public lihawa
    }
    public static void main(String[] args) {
        // We cannot create object of an abstract class
        Xyz x = new Xyz() ;
        x.show(20) ;
    }
}