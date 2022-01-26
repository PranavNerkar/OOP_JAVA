class Employee {

    int emp_id ;
    String emp_Name ;
    static String comp_Name = "Google" ;

    Employee( int emp_id , String emp_Name) {
        this.emp_id = emp_id ;
        this.emp_Name = emp_Name ;
    }

    void disp() {
        System.out.println("Employee Id = "+emp_id) ;
        System.out.println("Employee Name = "+emp_Name) ;
        System.out.println("Company Name = "+comp_Name) ;
    }
    public static void main(String[] args) {

        Employee e1 = new Employee( 10 , "Aanpa" ) ;
        Employee e2 = new Employee( 11 , "Vedant" ) ;
        Employee e3 = new Employee( 12 , "Dhano" ) ;

        e1.disp() ;
        e2.disp() ;
        e3.disp() ;
    }
}