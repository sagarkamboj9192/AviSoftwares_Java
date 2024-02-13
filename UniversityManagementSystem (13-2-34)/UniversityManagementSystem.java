import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// This is abstract class....
abstract class Person
{
    private int id;
    private String name;
    private int age;

    public void setElements(int id, String name , int age){
        this.id = id;
        this.name=name;
        this.age =age;                               // getter and setter 
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    abstract void getDetails();
}

class Student extends Person
{
    
    private int studentId;
    private String course; 
    private static HashMap<Integer, String> enrolledInCourse;
    private static List<Student> listofstudent;
    static {
        enrolledInCourse = new HashMap<>();
        listofstudent = new ArrayList<>();
    }

    public Student(int id, String name , int age,int studentId, String course){
        super.setElements(id, name, age);
        this.studentId = studentId;
        this.course = course;
        listofstudent = new ArrayList<>();
        
    }

    public int getStudentId(){
        return this.studentId;
    }

    public String getCourse(){
        return this.course;
    }
   

    // map is used to get details of students who get enrolled in course
    public void enrollCourse(Student stud){
        listofstudent.add(stud);
        enrolledInCourse.put(stud.getStudentId(), stud.getCourse());
        System.out.println("Student with student id : "+stud.getStudentId()+" get enrolled in course: "+stud.getCourse());
    }

    public void getDetails(){
        System.out.println("Details of the student : ");
        for(Student std :  listofstudent){
            System.out.println("The id of the Student is (i.e StudentId) : "+std.getStudentId());
            System.out.println("The name of the Student is : "+std.getName());
            System.out.println("The age of the Student is : "+std.getAge());
            System.out.println("The course student is enrolled in : "+std.getCourse());
            System.out.println("-----------------------------------");
        }
        
    }

    public void DisplayStudentEnrolledInCourse(){
        System.out.println("List of Students Enrolled in various Courses: ");
        for(int i: enrolledInCourse.keySet()){
            String j = enrolledInCourse.get(i);

            System.out.println("The id of Student is: "+i + " is enrolled in course: "+j);
        }
    }

}

class Faculty extends Person
{
    
    private int employeeId;
    private String department;
    private static HashMap<Integer, String> teacherenrolledInCourse;
    private static List<Faculty> listoffaculty;
    static {
        teacherenrolledInCourse = new HashMap<>();
        listoffaculty = new ArrayList<>();
    }

    public Faculty(int id, String name , int age, int employeeId , String department){
        super.setElements(id, name, age);
        this.employeeId = employeeId;
        this.department = department;
        listoffaculty = new ArrayList<>();
    }

    public int getEmployeeId(){
        return this.employeeId;
    }
    public String getDepartment(){
        return this.department;
    }

    public void teachCourse(Faculty fac, String course){
        listoffaculty.add(fac);
        teacherenrolledInCourse.put(fac.getEmployeeId(), course);
        System.out.println("Done!");
    }

    public void getDetails(){
        System.out.println("Details of the Faculty members : ");
        for(Faculty fac: listoffaculty){
            System.out.println("The id of the Employee is (i.e StudentId) : "+fac.getEmployeeId());
            System.out.println("The Department of employee is : "+fac.getDepartment());
            System.out.println("Employee with employee id : "+fac.getEmployeeId()+" teaching course: "+teacherenrolledInCourse.get(fac.getEmployeeId()));
            System.out.println("-----------------------------------");
        }
    }

}

class Courses
{
    private int courseCode;
    private String courseName;
    private int credits;
    // private static ArrayList<Courses> listofCourses;

    public Courses(int courseCode, String courseName, int credits){
        this.courseCode = courseCode;
        this.courseName=courseName;
        this.credits = credits;
        // listofCourses = new ArrayList<>();
    }

    public int getCourseCode(){
        return this.courseCode;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public int getCredits(){
        return this.credits;
    }

    // public List<Courses> getlistofcourse(){
    //     return listofCourses;
    // }    
}

public class UniversityManagementSystem
{
    // University class is used to manage all students, faculty and courses like add or remove 
    static class University
    {
        private List<Student> students;
        private List<Faculty> faculty;
        private List<Courses> courses;

        public University(){
            students = new ArrayList<>();
            faculty = new ArrayList<>();
            courses = new ArrayList<>();
        }

        public void addStudent(Student std){
            students.add(std);
            System.out.println("New Student is added with student id : "+std.getStudentId());
        }

        public void removeStudent(Student std){
            students.remove(std);
            System.out.println("Student is removed with student id : "+std.getStudentId());
        }


        public void addFaculty(Faculty fac){
            faculty.add(fac);
            System.out.println("New Employee is added with employee id : "+fac.getEmployeeId());
        }

        public void removeFaculty(Faculty fac){
            faculty.remove(fac);
            System.out.println("Employee is removed with employee id : "+fac.getEmployeeId());
        }

        public void addCourses(Courses cor){
            courses.add(cor);
            System.out.println("New Course is added with coourse code : "+cor.getCourseCode());
        }

        public void removeCourse(Courses cor){
            courses.remove(cor);
            System.out.println("Course is removed with coourse code : "+cor.getCourseCode());
        }


        public void displaystudentdetails(){
            System.out.println("List of all Students:");
            for (Student std : students) {
                std.getDetails();
            }
        }
        public void displayfacultydetails(){
            System.out.println("List of all Faculty members:");
            for (Faculty fac: faculty) {
                fac.getDetails();
            }
        }

        public void displaycoursedetails(){
            System.out.println("Details of all the Courses: ");
            for(Courses cor : courses){
                System.out.println("The Course code is: "+cor.getCourseCode());
                System.out.println("The Course name is: "+cor.getCourseName());
                System.out.println("The credits hours of the course is: "+cor.getCredits());
                System.out.println("------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University obj = new University();

        while(true)
        {
            System.out.println();
            System.out.println("*************** UNIVERSITY MANAGEMENT SYSTEM ******************");
            System.out.println("1. Add Courses");
            System.out.println("2. Add New Student enrolled in the course");
            System.out.println("3. Add New Faculty Member teaching course");
            System.out.println("4. Remove course");
            System.out.println("5. Remove Student from the course");
            System.out.println("6. Remove Faculty member from the course");
            System.out.println("7. Display all the courses");
            System.out.println("8. Display all the students ");
            System.out.println("9. Display all the faculty members");
            System.out.println("10. Display all the details of the university");
            System.out.println("11. Exit..");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the course code : ");
                    int coursecode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the course name: ");
                    String coursename = sc.nextLine();
                    System.out.print("Enter the credits hours of the course: ");
                    int credits = sc.nextInt();
                    sc.nextLine();
                    Courses cor = new Courses(coursecode, coursename, credits);
                    obj.addCourses(cor);
                    break;
                case 2:
                    System.out.print("Enter the person id: ");
                    int personid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the name of the student: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the age :  ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the student id: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the course in which student want to enroll: ");
                    coursename = sc.nextLine();
                    Student std= new Student(personid, name, age, studentId, coursename);
                    obj.addStudent(std);
                    std.enrollCourse(std);
                    break;
                case 3:
                    System.out.print("Enter the person id: ");
                    personid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the name of the Employee: ");
                    name = sc.nextLine();
                    System.out.print("Enter the age :  ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the employee id: ");
                    int employeeId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the department: ");
                    String department = sc.nextLine();
                    Faculty fac = new Faculty(personid, name, age, employeeId, department);
                    obj.addFaculty(fac);
                    
                    System.out.print("Enter the course  to enroll: ");
                    coursename = sc.nextLine();
                    fac.teachCourse(fac, coursename);
                    break;
                case 4:
                    System.out.print("Enter the course code you want to remove: ");
                    coursecode = sc.nextInt();
                    sc.nextLine();

                    for (Courses course : obj.courses) {
                        if (course.getCourseCode() == coursecode) {
                            obj.removeCourse(course);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter the studentId you want to remove: ");
                    studentId = sc.nextInt();
                    sc.nextLine();
                    for(Student stud: obj.students){
                        if(stud.getStudentId() == studentId){
                            obj.removeStudent(stud);
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter the employeeId you want to remove: ");
                    employeeId = sc.nextInt();
                    sc.nextLine();
                    for(Faculty fact : obj.faculty){
                        if(fact.getEmployeeId() == employeeId){
                            obj.removeFaculty(fact);
                            break;
                        }
                    }
                    break;
                case 7:
                    obj.displaycoursedetails();
                    break;
                case 8:
                    obj.displaystudentdetails();
                    break;
                case 9:
                    obj.displayfacultydetails();
                    break;
                case 10:
                    obj.displaycoursedetails();
                    obj.displaystudentdetails();
                    obj.displayfacultydetails();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Try Again");
            
            }  
        }

    }
}