// can return type of overriden Method must have same
// from 1.5 we can change return type
class Test {
    Object show(Xyz obj) {
        return obj ;
    }
}

class Xyz extends Test {
    String show(String s) { // Child warti aani parent khali chalat nahi
        return s ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        Xyz x = new Xyz() ;

        t.show(x) ;

        Xyz x1 = new Xyz() ;
        x1.show("String") ;
    }
}