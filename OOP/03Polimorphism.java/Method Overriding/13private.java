class Test {
    private void show() {
        System.out.println("01") ;
    }
}

class Xyz extends Test {
    void show(int b){ // cannot override
        System.out.println(b) ;
    }
    public static void main(String[] args) {
        Xyz x = new Xyz() ;
        x.show(20) ;
        // method of child is different from parent
    }
}