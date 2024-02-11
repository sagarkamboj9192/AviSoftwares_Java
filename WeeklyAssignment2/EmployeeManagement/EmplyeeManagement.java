import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface EmployeeManagementInterface {
    void addEmployee(Employee emp);
    void removeEmployee(int empId);
    void displayEmployeeInformation(int empId);
    void displayAllEmployees();
    int calculateTotalSalary();
    void sortEmployeesBySalary();
    List<Employee> searchEmployees(String keyword);
    void updateEmployeeInformation(int empId, String name, String position, int salary);
}

abstract class Employee {
    private int empId;
    private String name;
    private String position;
    private int salary;

    public Employee(int empId, String name, String position, int salary) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

class Display {
    void display(Employee emp) {
        System.out.println("Details of the Employee: ");
        System.out.println(emp);
    }
}

class AddEmployee extends Employee {
    public AddEmployee(int empId, String name, String position, int salary) {
        super(empId, name, position, salary);
    }
}

public class EmplyeeManagement implements EmployeeManagementInterface {
    private List<Employee> employees;

    public EmplyeeManagement() {
        employees = new ArrayList<>();
    }

    
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("New Employee is added with Employee Id: " + emp.getEmpId());
    }

    
    public void removeEmployee(int empId) {
        Employee empToRemove = null;
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                empToRemove = emp;
                break;
            }
        }
        if (empToRemove != null) {
            employees.remove(empToRemove);
            System.out.println("Employee with Employee Id: " + empId + " is removed!");
        } else {
            System.out.println("Employee with Employee Id: " + empId + " not found!");
        }
    }

    public void displayEmployeeInformation(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                Display display = new Display();
                display.display(emp);
                return;
            }
        }
        System.out.println("Employee with Employee Id: " + empId + " not found!");
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    
    public int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }

    
    public void sortEmployeesBySalary() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getSalary));
    }

    
    public List<Employee> searchEmployees(String keyword) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().contains(keyword) || emp.getPosition().contains(keyword) || Integer.toString(emp.getSalary()).contains(keyword)) {
                result.add(emp);
            }
        }
        return result;
    }

    
    public void updateEmployeeInformation(int empId, String name, String position, int salary) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                emp.setName(name);
                emp.setPosition(position);
                emp.setSalary(salary);
                System.out.println("Employee information updated successfully for Employee Id: " + empId);
                return;
            }
        }
        System.out.println("Employee with Employee Id: " + empId + " not found!");
    }
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmplyeeManagement empManagement = new EmplyeeManagement();

        while (true) {
            System.out.println("****************Employee Management System**********************");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employee Information");
            System.out.println("4. Display All Employees");
            System.out.println("5. Calculate Total Salary");
            System.out.println("5. Employee Details according to the salary");
            System.out.println("7. Update Employee Information");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    int salary = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    empManagement.addEmployee(new AddEmployee(empId, name, position, salary));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int empIdToRemove = scanner.nextInt();
                    empManagement.removeEmployee(empIdToRemove);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to display information: ");
                    int empIdToDisplay = scanner.nextInt();
                    empManagement.displayEmployeeInformation(empIdToDisplay);
                    break;
                case 4:
                    empManagement.displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Total Salary: " + empManagement.calculateTotalSalary());
                    break;
                case 6:
                    empManagement.sortEmployeesBySalary();
                    empManagement.displayAllEmployees();
                    break;
                
                case 7:
                    System.out.print("Enter Employee ID to update information: ");
                    int empIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String updatedPosition = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    int updatedSalary = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    empManagement.updateEmployeeInformation(empIdToUpdate, updatedName, updatedPosition, updatedSalary);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            
        }
    }

}


