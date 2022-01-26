class StaticVariable {
    int a = 10 ;
    static int b = 20 ;
    void show () {
        // static int c = 30 ; stattic variable only works in class level
    }
    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable() ;
        System.out.println(sv.a) ;
        System.out.println(sv.b) ; // should be access in static way
        System.out.println(StaticVariable.b) ; // accessing static variable by static way
        System.out.println(b) ; // We can access staic variable directly Without creating obj in its own class
    }
}