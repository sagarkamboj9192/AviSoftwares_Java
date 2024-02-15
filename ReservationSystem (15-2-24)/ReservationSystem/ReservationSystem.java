package ReservationSystem;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class ReservationSystem {
    public static Set<Integer> uniqueFlightno = new HashSet<>();   // this will check unique flight number
    public static List<Flight> flightDetails = new ArrayList<>();


    public void addFlights(Flight fl){                // used to add flight details in the list describe above
        flightDetails.add(fl);  
        System.out.println("New Flight is added .....");
    }

    public void bookticket(int flightno)          // method to book a ticket 
    {    
        int seatNo=0;   
        try{
            boolean check =true;
            for(Flight fl: flightDetails){
                if(fl.getFlightnumber() == flightno){
                    seatNo = fl.reserveTicket();
                    check=false;
                    break;
                }
            }
            if(check){
                throw new ResolutionException("There is no flight with this flight no");
            }
            if(seatNo == -1){
                throw new ReservationException("Sorry Mate! All Seats are booked..");
            }
            System.out.println("You reseverd seat with seatNo: "+seatNo +" in flight with flightNumber: "+flightno);
        }
        catch( ReservationException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void cancelticket(int flightno, int seatno)   // method to cancel a ticket and make that seat available
    {
        boolean check1=true;
        try{
            for(Flight fli : flightDetails){
                if(fli.getFlightnumber() == flightno){
                    fli.cancelTicket(seatno);
                    check1=false;
                    break;
                }
            }
            if(check1){
                throw new ReservationException("There is no flight with this flight no");
            }
        }catch(ReservationException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        ReservationSystem obj = new ReservationSystem();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println();
            System.out.println("***************** BANK MANAGEMENT SYSTEM ********************");
            System.out.println("1. Add New Flight ");
            System.out.println("2. Check Flight Details");
            System.out.println("3. Book Seat");
            System.out.println("4. Cancel Seat");
            System.out.println("5. Exit");


            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    while(true)    // while loop is used user will enter flight number until enter it unique
                    {
                        try{
                            System.out.print("Enter the flight number: ");
                            int flightnumber = sc.nextInt();
                            sc.nextLine();
                            if(uniqueFlightno.contains(flightnumber)){
                                throw new ReservationException("Flight No must be unique! Try Again.");
                            }
                            else{
                                System.out.print("Enter the departure city: ");
                                String departurecity = sc.nextLine();
                                System.out.print("Enter the destination city: ");
                                String destinationcity = sc.nextLine();
                                System.out.print("Enter the no of available seats: ");
                                int availableseats = sc.nextInt();
                                sc.nextLine();
                                if(availableseats < 0){
                                    throw new InvalidSeatNumberException("Invalid Seat No !");
                                }
                                uniqueFlightno.add(flightnumber);
                                Flight flight = new Flight(flightnumber, departurecity, destinationcity, availableseats);
                                obj.addFlights(flight); 
                                break;                              
                            }
                        }
                        catch(ReservationException e){
                            System.out.println(e);
                        }
                        catch (InvalidSeatNumberException e){
                            System.out.println(e);
                        }   
                    }
                    break;
                case 2:
                    System.out.print("Enter the flight number to get details: ");
                    int flightnumber = sc.nextInt();
                    sc.nextLine();
                    boolean check = true;
                    for(Flight fl : flightDetails){
                        if(fl.getFlightnumber() == flightnumber){   // this will check that flight no in list and then call
                            System.out.println("The flight departure city is: "+fl.getDeparturecity());
                            System.out.println("The flight destination city is: "+fl.getDestinationcity());
                            System.out.println("The number of available seats are:  "+fl.getAvailableseats());
                            System.out.println("----------------------------------");   
                            check =false;
                            break;                         
                        }
                    }
                    if(check){
                        System.out.println("There is no flight with this flight no.");
                    }
                    break;
                
                case 3:
                    // firstly it will check that flight no in the list then make booking
                    
                    System.out.print("Enter the flight number to book seat: ");
                    flightnumber = sc.nextInt();
                    sc.nextLine();
                    if(uniqueFlightno.contains(flightnumber)){
                        obj.bookticket(flightnumber);
                    }
                    else{
                        System.out.println("There is no flight with this flight no.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the flight number to cancel seat: ");
                    flightnumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the seat no to cancel the ticket: ");
                    int seatno = sc.nextInt();
                    sc.nextLine();
                    if(uniqueFlightno.contains(flightnumber)){
                        obj.cancelticket(flightnumber, seatno);
                    }
                    else{
                        System.out.println("There is no flight with this flight no.");
                    }
                    break;
                case 5:
                    System.out.println("Exititng");
                    sc.close();
                    System.exit(0);
            }
        }

    }
}
