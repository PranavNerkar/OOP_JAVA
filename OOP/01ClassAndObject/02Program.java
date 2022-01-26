class Animal {
    String colour ;
    int age ;
    public static void main(String[] args) {
        Animal dog = new Animal() ;
        dog.colour = "black" ;
        dog.age = 3 ;
        System.out.println(dog.colour + " " + dog.age) ;
    }
}