package com.company;

class Employee{
    private String Designation;

    public Employee(String Designation) {
        this.Designation = Designation;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
}


interface Accessible{
    void Access();
}
class Record implements Accessible{

    protected Employee Employee;

    public Record(Employee Employee) {
        this.Employee = Employee;
    }


    @Override
    public void Access() {
        System.out.println("Access The Record");
    }
}

class RecordProxy  extends Record{

    public RecordProxy(Employee Employee) {
        super(Employee);
    }

    @Override
    public void Access() {
        if(Employee.getDesignation()!="Admin"){
            System.out.println("You can't Access" +" : You are not Admin");
        }else {
            System.out.println("You can Access" +" :" +Employee.getDesignation());
            super.Access();
        }
    }

}
public class Example8{

    public static void main(String[] args) {
        Employee Aadivya= new Employee("Admin");
        Employee Gaurav= new Employee("Trainee");
        Accessible Records=new RecordProxy(Aadivya);
        Accessible Record= new RecordProxy(Gaurav);

        Records.Access();
        Record.Access();
    }
}

