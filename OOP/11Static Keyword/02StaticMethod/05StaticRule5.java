// a static method cannot refer to "this" or "Super" keyword in anyway
class StaticRule5 {
    int i = 10 ;
    static void show() {
        // System.out.println(this.i) ;
        // error: non-static variable this cannot be referenced from a static context
    }
}