// can return type of overriden Method must have same
class Test {
    void show(String s , int a) {
        System.out.println(s +" "+ a) ;
    }
}

class Xyz extends Test {
    void show(String s , int b) {
        System.out.println(s+" "+b) ;
    }
    // int show(String s , int b) {
    //     System.out.println(s+" "+b) ; return type must have same
    // }
    // but we can override method using covarient return type with Parent Child Relation
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show("aama" , 10) ;

        Xyz x = new Xyz() ;
        x.show("appa" , 20) ;
    }
}