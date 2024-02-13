import java.util.*;
abstract class Vehicle
{
    private String make;
    private String model;
    private int manufacturingYear;
    private int rentalPrice;

    void setElements(String make, String model, int manufacturingYear , int rentalPrice)
    {
        this.make = make;
        this.model=model;
        this.manufacturingYear = manufacturingYear;
        this.rentalPrice = rentalPrice;
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }

    public int getManufactyear(){
        return this.manufacturingYear;
    }
    public int getrentalPrice(){
        return this.rentalPrice;
    }

    abstract int calculateRentalCost(Vehicle veh , int days);

}

class Car extends Vehicle
{
    private int numofSeats;
    private String fuelType;
    private ArrayList<Vehicle> allVehicles;

    public Car(String make, String model, int manufacturingYear , int rentalPrice, int numofSeats, String fuelType)
    {
        super.setElements(make, model, manufacturingYear, rentalPrice);
        this.fuelType=fuelType;
        this.numofSeats = numofSeats;
        allVehicles = new ArrayList<>(); 
    }

    public int getNumofSeats(){
        return this.numofSeats;
    }
    public String getFueltype(){
        return this.fuelType;
    }
    
    public int calculateRentalCost(Vehicle veh,int days)
    {
        int rentalcost=1;
        if(veh.getModel() == "bmw"){
            rentalcost = veh.getrentalPrice() * days;
        }
        else if(veh.getModel() == "swift"){
            rentalcost = veh.getrentalPrice() * days;
        }
        else if(veh.getModel() == "gwagon"){
            rentalcost = veh.getrentalPrice() * days;
        }
        else if(veh.getModel() == "audi"){
            rentalcost = veh.getrentalPrice() * days;
        }
        else{
            rentalcost = veh.getrentalPrice() * days;
        }
       
        return rentalcost;
    }

    public void addVehicles(Vehicle veh){
        allVehicles.add(veh);
        System.out.println("This vehicle is added to Vehicles list");
    } 

    public void removeVehicle(Vehicle veh){
        allVehicles.remove(veh);
        System.out.println("This Vehicle is now not in Vehicles list");

    }
}

public class CarRentalSystem
{
    static class Customer
    {
        private String name;
        private String email;
        private ArrayList<Vehicle> RentedVehicles;

        public Customer(String name, String email){
            this.email=email;
            this.name = name;
            RentedVehicles = new ArrayList<>(); 
        }

        public String getName(){
            return this.name;
        }

        public String getEmail(){
            return this.email;
        }
        public List<Vehicle> getRentedVehicles(){
            return RentedVehicles;
        }

        public void addVehicle(Vehicle veh) {
            RentedVehicles.add(veh);
            System.out.println("This vehicle is added to Rented Vehicles list");
        }

        public void removeVehicle(Vehicle veh) {
            RentedVehicles.remove(veh);
            System.out.println("This vehicle is removed from Rented Vehicles list");
        }

        
    }

    static class RentalAgency
    {
        private List<Vehicle> rentedVeh;
        private List<Vehicle> returningVehicle;
        private List<Customer> customers;
        private List<Vehicle> allVehicles;

        public RentalAgency() {
            rentedVeh = new ArrayList<>();
            returningVehicle = new ArrayList<>();
            customers = new ArrayList<>();
            allVehicles = new ArrayList<>();
        }

        public void addRentedVehicle(Vehicle vehicle) {
            rentedVeh.add(vehicle);
        }

        public void addReturningVehicle(Vehicle vehicle) {
            returningVehicle.add(vehicle);
        }

        public void addCustomer(Customer customer) {
            customers.add(customer);
        }

        public List<Vehicle> getRentedVehicles() {
            return rentedVeh;
        }

        public List<Vehicle> getReturningVehicles() {
            return returningVehicle;
        }

        public List<Customer> getCustomers() {
            return customers;
        }


        public void giveVehicleOnRent(Vehicle vehicle) {
            rentedVeh.add(vehicle);
            allVehicles.remove(vehicle);
            System.out.println("Vehicle given on rent.");
        }

        public void returnVehicle(Customer customer, Vehicle vehicle) {
            customer.removeVehicle(vehicle);
            returningVehicle.add(vehicle);
            rentedVeh.remove(vehicle);
            allVehicles.add(vehicle);
            System.out.println("Vehicle returned.");
        }

        public void addVehicleToAll(Vehicle vehicle) {
            allVehicles.add(vehicle);
        }

    }


    public static void main(String[] args)
    {
        // CarRentalSystem obj= new CarRentalSystem();
        RentalAgency rental = new RentalAgency();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println();
            System.out.println("*************** CAR RENTAL SYSTEM ******************");
            System.out.println("1. Add vehicle to garage");
            System.out.println("2. To check Details of all vehicles");
            System.out.println("3. Give Vehicle to rent");
            System.out.println("4. Details of vehicles given to rent with their rent");
            System.out.println("5. Details of customer who had taken vehicle on rent");
            System.out.println("6. Exit..");
           

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                case 1:    
                    System.out.print("Enter the make of the vehicle: ");
                    String make = sc.nextLine();
                    System.out.print("Enter the model of the vehicle: ");
                    String model = sc.nextLine();
                    System.out.print("Enter the Manufacturing year: ");
                    int manufacturingYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the rentalprice: ");
                    int rentalprice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Number of seats it have: ");
                    int numofSeats = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type of fuel: ");
                    String fuelType = sc.nextLine();
                    Car ob = new Car(make, model, manufacturingYear, rentalprice, numofSeats, fuelType);
                    // ob.addVehicles(ob);
                    rental.addVehicleToAll(ob);
                    break;
                case 2:
                    List<Vehicle> allVehicles = rental.allVehicles;
                    System.out.println("Details of all vehicles present currently:");
                    for (Vehicle vehicle : allVehicles) {
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Manufacturing Year: " + vehicle.getManufactyear());
                        System.out.println("Rental Price: " + vehicle.getrentalPrice());
                        System.out.println("---------------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter customer email: ");
                    String customerEmail = sc.nextLine();
                    System.out.print("Enter the model of the vehicle to give on rent: ");
                    model = sc.nextLine();
                    System.out.print("Enter the Manufacturing Year of the vehicle to give on rent: ");
                    manufacturingYear = sc.nextInt();
                    sc.nextLine();

                    Customer custome = new Customer(customerName, customerEmail);
                    boolean check = true;
                    for (Vehicle vehicle : rental.allVehicles) {
                        if (vehicle.getManufactyear() == manufacturingYear  && vehicle.getModel().equalsIgnoreCase(model)) {
                            rental.giveVehicleOnRent(vehicle);
                            custome.addVehicle(vehicle);
                            rental.addCustomer(custome);
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        System.out.println("Sorry! This Vehicle is not present...");
                    }
                    break;

                case 4:
                    System.out.println("Details of rented vehicles:");
                    List<Vehicle> rentedVehicles = rental.getRentedVehicles();
                    for (Vehicle vehicle : rentedVehicles) {
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Manufacturing Year: " + vehicle.getManufactyear());
                        System.out.println("Rental Price: " + vehicle.getrentalPrice());
                        System.out.println("---------------------------");
                    }
                    break;
                case 5:
                System.out.println("Details of customers who have taken vehicles on rent:");
                    List<Customer> customers = rental.getCustomers();
                    for (Customer customer : customers) {
                        System.out.println("Customer Name: " + customer.getName());
                        System.out.println("Customer Email: " + customer.getEmail());
                        System.out.println("Vehicles Rented:");
                        List<Vehicle> rented = customer.getRentedVehicles();
                        for (Vehicle vehicle : rented) {
                            System.out.println("Make: " + vehicle.getMake());
                            System.out.println("Model: " + vehicle.getModel());
                            System.out.println("Manufacturing Year: " + vehicle.getManufactyear());
                            System.out.println("Rental Price: " + vehicle.getrentalPrice());
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Try Again");
                
            }


        }
    }

}



