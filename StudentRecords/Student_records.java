import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class student_data {

    private String name;
    private int roll_no;
    private String fath_name;
    private String e_mail;

    private int dbms;
    private int c;
    private int java;
    private int python;

    private int maxthreshold = 90;
    private int minthreshold = 40;


    public static ArrayList<String> btwthreshold = new ArrayList<>();
    public static ArrayList<String> persattentlist = new ArrayList<>();

    public static HashMap<Integer, String> lsttop = new HashMap<>();
    public static HashMap<Integer, String> persat = new HashMap<>();
    public static HashMap<Integer, Float> mp = new HashMap<>();



    public void detail(String name, int roll_no ,String fath_name, String e_mail)
    {
        // This method is used to add details
        this.name=name;
        this.roll_no = roll_no;
        this.fath_name =fath_name;
        this.e_mail= e_mail;
    }

    public void marks(int dbms, int c, int java, int python)
    {
        // this method is used to add marks to particular student
        this.dbms=dbms;
        this.c=c;
        this.java=java;
        this.python=python;

        if(dbms < 30 || c < 30 || java < 30 || python <30){
            // if any student fails in any subject then it goes into personal attention list
            persattentlist.add(this.name);
            persat.put(this.roll_no, this.name);
        }
    }

    public void average()
    {
        // this is used to calculate average and add student to list acc to their average
        float avg = (float) (dbms+c+java+python)/4;
        if(avg > maxthreshold){
            mp.put(this.roll_no, avg);
            lsttop.put(this.roll_no, this.name);
            // listoftopp.add(this.name);
        }
        else if(avg < maxthreshold && avg > minthreshold){
            btwthreshold.add(this.name);
        }
        else{
            // boolean check=true;
            // for(int i=0;i<persattentlist.size();i++){
            //     if(this.name == persattentlist.get(i)){
            //         check= false;
            //         break;
            //     }
            // }
            // if(check){
            //     persattentlist.add(this.name);
            // }
            persat.put(this.roll_no, this.name);
        }

    }
    // public void display()
    // {
    //     System.out.println("The name is : "+this.name);
    //     System.out.println("The father name is : "+this.fath_name);
    //     System.out.println("The roll no is : "+this.roll_no);
    //     System.out.println("The email is : "+this.e_mail);
    // }

    public void listoftopper()
    {
        // This will print the list of first 5 topper
        System.out.println();
        System.out.println("The list of first 5 topper are: ");

        for(int i:lsttop.keySet()){
            String j = lsttop.get(i);
            System.out.println("Roll_no: "+i + " and name is : "+j);
        }
        System.out.println();
    }
    public void personalattention()
    {
        System.out.println();
        System.out.println("The list of students who needs personal attention : ");
        // for(int i=persattentlist.size()-1;i>=0;i--){
        //     System.out.print(persattentlist.get(i)+" ");   
        // }

        for(int j:persat.keySet())
        {
            String s = persat.get(j);
            System.out.println("Roll_no: "+j + " and name is : "+s);
        }
        System.out.println();
    }

    public boolean isValidName(String name) {
        // Regex pattern to match only letters, spaces, hyphens, and apostrophes
        String regex = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public void classtopper()
    {
        Float max = -1f;
        int stud=1;
        for(int i:mp.keySet()){
            Float j=mp.get(i);
            if(j > max){
                max=j;
                stud=i;
            }
        }
        System.out.println();
        System.out.println("The Topper of the class is : ");
        System.out.println("Roll-no is "+ stud+" and name is : "+lsttop.get(stud));
        System.out.println("Congratulations.. Mr "+lsttop.get(stud)+" , You will be awarded with 30,000 cash");
    }
    
}
public class Student_records
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n =obj.nextInt();
        
        student_data[] ob = new student_data[n];

        for(int i=0;i<n;i++)
        {

            ob[i] = new student_data();
            System.out.println();
            obj.nextLine();
            System.out.print("Enter the name of "+(i+1)+" student: ");
            String name  = obj.nextLine();
            while (!ob[i].isValidName(name)) {
                System.out.println("Invalid name format. Name should only contain letters, spaces");
                System.out.print("Enter the name of " + (i + 1) + " student: ");
                name = obj.nextLine();
            }
        
            System.out.print("Father name : ");
            String fath_name  = obj.nextLine();
            
            System.out.print("E_mail : ");
            String email  = obj.nextLine();
            
            int roll_no=0;
            while (true) {
                try {
                    System.out.print("Roll no: ");
                    roll_no = obj.nextInt();
                    break; // Break out of the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input for roll number. Please enter a valid integer.");
                    obj.next(); // Clear the invalid input from the scanner
                }
            }
            

            System.out.println();
            System.out.println("Enter the marks in each subject out of 100: ");
            obj.nextLine();
            // try {
            System.out.print("In DBMS: ");
            int dbms = obj.nextInt();
            
            // } catch (Exception e) {
            //     System.out.println(email);
            // }
            System.out.print("C++: ");
            int c = obj.nextInt();
            System.out.print("Java: ");
            int java = obj.nextInt();
            System.out.print("Python: ");
            int python = obj.nextInt();

    
            ob[i].detail(name, roll_no, fath_name, email);
            ob[i].marks(dbms, c, java, python);
            ob[i].average();
            // ob[i].display();
        }
        student_data newobj = new  student_data();
        newobj.listoftopper();
        newobj.personalattention();
        newobj.classtopper();

        obj.close();
      
    }
}