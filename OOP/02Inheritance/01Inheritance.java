class Animal {
    void run() {
        System.out.println("Run") ;
    }
}

class Dog extends Animal {
    public static void main(String [] args) {
        Dog d1 = new Dog() ;
        d1.run() ;
    }
}