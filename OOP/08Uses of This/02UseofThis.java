// 02 this keyword can be used to invoke current class method (implicitly)
class Test {

    void disp() {
        System.out.println("Hello") ;
    }

    void show() {
        this.disp() ; // both are same
        disp() ; // compiler by default add this keyword while invoking method
    }
}

class XYZ {
    public static void main(String [] args) {

        Test t = new Test() ;
        t.show() ;
    }
}