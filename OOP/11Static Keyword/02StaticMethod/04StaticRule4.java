// Rule 5 : a static method can call only other static methods and cannot call a non-static method

class StaticRule4 {
    void fun() {
        
    }

    static void show() {

    }

    static void test() {
        // fun() ; fun is nonstatic within this context
        show() ;
    }
}