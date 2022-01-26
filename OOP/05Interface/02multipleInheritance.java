interface I1 {
    void show () ;
}

interface I2 {
    void disp() ;
}

class Test implements I1 , I2 { // multiple Inheritance
    public void show () {
        System.out.println("In Show") ;
    }
    public void disp() {
        System.out.println("In disp") ;
    }

    public static void main(String[] args) {
        Test t = new Test() ;
        t.show() ;
        t.disp() ;
    }
}