// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.16
/***********************************************************************
 * This complete program will simulate the scenario for a parked car   *
 * getting filed for a parking ticket when parking meter time expire   *
 * and a police guard issues the ticket fee based on parking time      *
 **********************************************************************/
import java.util.*;
public class ParkingTicketSim_Main //Main Class represents parking ticket scenario in full
{
   public static void main (String [] args) 
   {
      //create a user input scanner object for correct input use
      try(Scanner scan = new Scanner(System.in)) {
         //introduce new String & Int variables based on the parked car and
         //the parking meter pertaining to parking ticket enteries when filing for a ticket    
         String carMake, carModel, carColor, carLicense; //create car variables
         int meterTimePurchased, meterCarParked; //create meter variables
          
         //Incorporate new object from of creates class types
         //created for this scenario to simulate a parkingticket
         ParkedCar car = new ParkedCar(); //car object of type 'ParkedCar'
         ParkingMeter meter = new ParkingMeter(); //meter object of type 'ParkingMeter'
         ParkingTicket ticket = new ParkingTicket(); //ticket object of type 'ParkingTicket'
         PoliceGuard police = new PoliceGuard("Dylan Skroskznik", 25434875); //pre established police object of type 'PoliceGuard'
         ticket.setGuardInfo(police); //deposit set guard data in parking ticket object method
                 
         System.out.println("=-----------------------------------------=");
         System.out.println("Welcome, this is a parking ticket simulator");
         System.out.println("=-----------------------------------------=");
         //Prompt User to enter parking status from car and parking meter  
         System.out.println("Enter the amount of parking minutes you purchased: ");
         meterTimePurchased = scan.nextInt(); //scan meter time bought
         System.out.println("Enter how many minutes you have been parked: ");
         meterCarParked = scan.nextInt(); //scan car duration parked
         car.setCarMinParked(meterCarParked); //set car object with parked car data
         meter.setParkedCarTime(meterCarParked); //set meter object with meter data
         meter.setMinPurchased(meterTimePurchased); //set meter object with meter minutes bought 
         ticket.setCarInfo(car); //set ticket object with parked car data
         ticket.setMeterInfo(meter); //set ticket object with parking meter data
         System.out.print(meter);    
            
         //if loop to determine if parked time and meter time issue no illegal parking      
         if (police.examineParkTime(car, meter)) { //examines parking time to determine illegal parking
            System.out.println("[ Time To Issue A Parking Ticket ]"); //initializes parking ticket when true
            System.out.println("Enter Vehicle Make: "); //input enters car make data
            carMake = scan.next();
            car.setCarMake(carMake);
            System.out.println("Enter Vehicle Model: "); //input enters car model data 
            carModel = scan.next();
            car.setCarModel(carModel);
            System.out.println("Enter Vehicle Color: "); //input enter car color data
            carColor = scan.next();
            car.setCarColor(carColor);
            System.out.println("Enter Vehicle License Num: "); //input enter car license data
            carLicense = scan.next();
            car.setCarLic(carLicense);
            System.out.println();
                        
            //issue and calculate fee for illegal parking and print ticket form    
            police.issueTicket(car, meter, police); 
            System.out.print(ticket);
         }
         else { 
            //OR is parking minutes purchased were not exceded, issue no ticket
            System.out.print("[NOT Illegally Parked, Parking Ticket Not Issued]"); 
         }
      }                 
   }//end main
}//end class