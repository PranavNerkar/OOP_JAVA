class P {
    void showP() {
        System.out.println("P Class") ;
    }
}

class Q extends P {
    void showQ() {
        System.out.println("Q Class") ;
    }
}

class R extends Q {
    void showR() {
        System.out.println("R Class") ;
    }

    public static void main(String[] args) {
        P p = new P() ;
        p.showP() ;

        Q q = new Q() ;
        q.showP() ;
        q.showQ() ;

        R r = new R() ;
        r.showP() ;
        r.showQ() ;
        r.showR() ;
    }
}