package oops;

public class employee {
    String name;
    int employeeid;
    double salary;
    public employee(String n,int e,double s)
    {
        this.name=n;
        this.employeeid=e;
        this.salary=s;
    }
    public void displayEmployeeInfo()
    {
        System.out.println("employee name: "+name);
        System.out.println("employee id: "+employeeid);
        System.out.println("employee salary: "+salary);
    }
    public static void main(String[] args) {
        employee em=new employee("Iniya",1234,50000);
        em.displayEmployeeInfo();
    }
}
