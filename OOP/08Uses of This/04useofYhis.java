// 04 this keyword can be used to pass as an argument in the method call

class Test {

    void disp(Test t1) {
        System.out.println("Display") ;
    }

    void show() {
        disp(this) ; // pass as an argument :: helps to call disp method
        System.out.println("Show") ;
    }
    public static void main(String [] args) {

        Test t = new Test() ;
        t.show() ;
    }
}