class Test {
    int i ;

    void set(int i) {
        this.i = i ; // this.i --::  this refers to object and i refers to the instance variable
    }
    void show() {
        System.out.println(i) ;
    }
}

class XYZ {
    public static void main(String [] args) {
        Test t = new Test() ;
        t.set(10) ;
        t.show() ;
    }
}