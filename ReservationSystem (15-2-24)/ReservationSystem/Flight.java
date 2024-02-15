package ReservationSystem;

import java.util.Arrays;

public class Flight {
    private int flightNumber;
    private String departureCity;
    private String destinationCity;
    private int availableSeats;
    private boolean[] arr;   // boolean array is used to found seat is booked or not 

    public Flight(int flightNumber, String departureCity, String destinationCity, int availableSeats){
        this.flightNumber = flightNumber;
        this.departureCity =departureCity;
        this.destinationCity = destinationCity;
        this.availableSeats = availableSeats;
        arr = new boolean[availableSeats+1];
        Arrays.fill(arr, false);     // initalize all seats with false means there is no booking yet
 
    }

    public int getFlightnumber(){              // all are getter methods
        return this.flightNumber;
    }

    public String getDeparturecity(){
        return this.departureCity;
    }

    public String getDestinationcity(){
        return this.destinationCity;
    }

    public int getAvailableseats(){                   // this will calculate no of seats available...
        int count=this.availableSeats;
        count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] == false){
                count++;
            }
        }
        return count;
    }

    public int reserveTicket(){               // this will reserve a ticket and make that true 
        int seatNo=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == false){
                arr[i]=true;
                seatNo=i;
                break;
            }
        }
        return seatNo;
    }

    public void cancelTicket(int seat_no)      // this will cancel ticket.. and make that seat false
    {

        // use try catch block for various exception....
        try{
            if(arr[seat_no] == true){
                arr[seat_no]=false;
                System.out.println("Your ticket is cancelled with flight number: "+getFlightnumber());
            }
            else{
                throw new ReservationException("This seat is not booked yet , Sorry you have a mistake regarding seat no");
            }

            if(seat_no < 0){
                throw new InvalidSeatNumberException("Invalid seat no !");
            }
        }
        catch(InvalidSeatNumberException e){
            System.out.println(e);
        }
        catch (ReservationException e){
            System.out.println(e);
        }
    }

}
