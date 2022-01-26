class CounterDemo {
    // int count ; // reinitializes count = 0 when object created
    static int count = 0 ; // initialize only once when class loading

    CounterDemo() {
        count++ ;
        System.out.println(count) ;
    }

    public static void main(String[] args) {

        CounterDemo c1 = new CounterDemo() ;
        CounterDemo c2 = new CounterDemo() ;
        CounterDemo c3 = new CounterDemo() ;
        CounterDemo c4 = new CounterDemo() ;

        /*
            count = 0 ; // initialize when class loading
            c1 -> 0 : c++ == 1
            c2 -> 1 : c++ == 2
            c2 -> 2 : c++ == 3
            c2 -> 3 : c++ == 4
        */
    }
}