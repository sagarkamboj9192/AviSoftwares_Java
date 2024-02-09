import java.util.ArrayList;

abstract class Employee
{
    private int EmpId;
    private String name;
    private String position;
    private int salary;
    
    public void setElements(int EmpId, String name, String position, int salary)
    {
        this.EmpId=EmpId;
        this.name = name;
        this.position=position;
        this.salary=salary;
    }

    public int getEmpId()
    {
        return this.EmpId;
    }

    public String getName()
    {
        return this.name;
    }

    public String getPosition()
    {
        return this.position;
    }

    public int getSalary()
    {
        return this.salary;
    }

}

class Display extends Employee
{
    void display()
    {
        System.out.println("Details of the Employee: ");
        System.out.println("The id of the Employee is : "+getEmpId());
        System.out.println("The name of the Employee is : "+getName());
        System.out.println("The Position of the Employee is : "+getPosition());
        System.out.println("The Salary of the Employee is : "+getSalary());
    }
}

class AddEmployee extends Employee
{
    public AddEmployee(int EmpId, String name, String position, int salary){
        super.setElements(EmpId, name, position, salary);
    }

}


public class EmplyeeManagement
{
    static class EmployeeDetail
    {
        private ArrayList<Employee> empl;

        public EmployeeDetail(){
            empl = new ArrayList<>();
        }

        public void addEmpl(Employee emp)
        {
            empl.add(emp);
            System.out.println("New Employee is added.. with Employee Id : "+emp.getEmpId());
        }

        public void displayDetail(Display dis)
        {
            dis.display();
        }

        public void removeEmployee(Employee emp)
        {
            empl.remove(emp);
            System.out.println("Employee with Employee Id : "+emp.getEmpId()+" is removed!");
        }
        
    }


    public static void main(String[] args)
    {

    }
}