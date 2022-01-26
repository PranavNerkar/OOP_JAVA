class Animal {
    public void eat() {
        System.out.println("In Eat") ;
    }
    public static void main(String[] args) {
        Animal dog = new Animal() ;
        dog.eat() ;
        dog.run() ;

        Birds b = new Birds() ;
        b.fly() ;
    }
    public void run() {
        System.out.println("In run") ;
    }
}
class Birds {
    void fly() {
        System.out.println("Fly") ;
    }
}