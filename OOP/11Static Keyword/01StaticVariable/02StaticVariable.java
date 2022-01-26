class StaticVariable {
    int a = 20 ;
    static int b = 20 ;

}
// static variable can be access with using class name
class Demo {
    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable() ;
        System.out.println(sv.a) ;
        System.out.println(sv.b) ; // should be access in static way
        System.out.println(StaticVariable.b) ; // We can access staic variable directly Without creating obj
        // System.out.println(b) ; // compiler hya b la Demo class made sapadto
    }
}