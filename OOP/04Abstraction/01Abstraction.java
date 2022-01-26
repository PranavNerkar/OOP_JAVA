abstract class Vehicle {
    abstract void run() ;
    void fuel() {
        System.out.println("Petrol") ;
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("On Road") ; // body given
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("ON Mountain") ;
    }
    public static void main(String[] args) {
        Bike b = new Bike() ;
        b.run() ;

        Car c = new Car() ;
        c.run() ;

        // Vehicle v = new Vehicle() ; we cannot create object of abstract class
    }
}