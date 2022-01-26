// 05 this keyword can be used to pass as an argument in the Constructor call

class TestDemo {
    TestDemo(Test t) {
        System.out.println("Test Constructor") ;
    }
}

class Test {

    void disp() {
        TestDemo td = new TestDemo(this) ; // calls constructor of TestDemo
        System.out.println("Display") ;
    }
    public static void main(String [] args) {

        Test t = new Test() ;
        t.disp() ;
    }
}