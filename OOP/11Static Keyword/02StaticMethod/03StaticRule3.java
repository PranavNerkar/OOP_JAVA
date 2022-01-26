// Static method can access only static data . it cannot access non-static data(instance data

class StaticRule3 {
    static int a = 10 ;
    int x = 20 ;

    static void show() {
        // System.out.println(x) ; x is nonstatic in this Context
        System.out.println(a) ;
    }
} 