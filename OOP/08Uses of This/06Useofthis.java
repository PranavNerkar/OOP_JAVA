// 06 this keyword can be used to return the current class instance from the method

class Test {

    Test t1() {
        return this ; // returning current class instance
    }
    public static void main(String [] args) {

        Test t = new Test() ;
        t.t1() ;
    }
}