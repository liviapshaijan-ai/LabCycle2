class Employee{
    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Emplpoyee Name : "+name);
        System.out.println("Employee salary : "+salary);
    }
}

public class EMPLOYEE {
    public static void main(String[] args){
        Employee emp1 = new Employee("Livia" , 2309098);

        emp1.display();
    }
}
