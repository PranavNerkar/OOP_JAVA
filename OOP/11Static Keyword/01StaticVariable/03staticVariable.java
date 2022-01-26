class StaticVariable {

    int a = 20 ;
    static int b = 20 ;

}

class Demo extends StaticVariable{
    public static void main(String[] args) {
        StaticVariable sv = new StaticVariable() ;
        System.out.println(sv.a) ;
        System.out.println(sv.b) ; // should be access in static way
        System.out.println(StaticVariable.b) ; // We can access staic variable directly Without creating obj
        System.out.println(b) ; // b ha diretly inherit zala Demo kade
    }
}