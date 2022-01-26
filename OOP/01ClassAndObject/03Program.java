class Animal {
    String colour ;
    int age ;

    void info(String s , int a) {
        colour = s ;
        age = a ;
        System.out.println(colour + " " + age) ;
    }
    public static void main(String[] args) {
        Animal dog = new Animal() ;
        dog.info("Black" , 3) ;
        System.out.println(dog.colour + " " + dog.age) ;
    }
}