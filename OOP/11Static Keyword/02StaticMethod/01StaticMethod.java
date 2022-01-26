// Rule 01 : Static methods belongs to the class , not to the objects
class StaticMethod {
    void disp() {

    }
    static void show() {

    }
    public static void main(String[] args) {
        // disp() ; // cannot access static in nonstatic context
        show() ;
        StaticMethod.show() ; // directly access using class name

        StaticMethod sm = new StaticMethod() ;
        sm.disp() ;

    }
}