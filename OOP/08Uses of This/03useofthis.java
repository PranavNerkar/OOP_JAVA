// 03 this keyword can be used to invoke current class Constructor

class Test {

    Test() {
        // this(10) ; // this calls para constructor
        System.out.println("no.Arg constructor") ;
    }
    Test(int a) {
        this() ; // this calls no arg constructor
        System.out.println("Para constructor") ;
    }
    public static void main(String [] args) {

        Test t = new Test(10) ;
    }
}