class Test {
    void show(String s , int a) {
        System.out.println(s +" "+ a) ;
    }
}

class Xyz extends Test {
    void show(String s , int b) {
        System.out.println(s+" "+b) ;
    }
    void show(float m) {
        System.out.println(m) ;
    }
    public static void main(String[] args) {
        Test t = new Test() ;
        t.show("aama" , 10) ;

        Xyz x = new Xyz() ;
        x.show("appa" , 20) ;
        x.show(50.50f) ; // f dyacha float sathi
    }
}