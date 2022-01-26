class Employee {
    int x ;
    private int emp_Id ; // only visible in this class
    // no one can directly modify this data
    public void set(int emp_Id01) {
        emp_Id = emp_Id01 ;
    }

    public int get() {
        return emp_Id ;
    }
}

class Company {
    public static void main(String[] args) {
        Employee e = new Employee() ;
        e.x = 20 ; // unsafe data
        // e.emp_Id = 20 ; emp_Is not visible in this class

        e.set(20) ;
        System.out.println(e.get()) ;
    }
}