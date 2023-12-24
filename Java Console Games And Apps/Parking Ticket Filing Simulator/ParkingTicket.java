// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.16
/********************************************************************************
 * This class represents a parking ticket 'object' which reports necessary data *
 * obtained from a parked car object and calculates a total fine dependent on   * 
 * the time the car was parked, while reporting the officer issuing the ticket  *
 *******************************************************************************/
 public class ParkingTicket //Class represents parking ticket
 {
 //contruct structure off data types from classes 'ParkedCar', 'ParkingMeter', & 'PoliceGuard' 
   private ParkedCar carInfo; //use carInfo data form 'ParkedCar' class
   private ParkingMeter meterInfo; //use meterInfo data form 'ParkingMeter' class
   private PoliceGuard guardInfo; //use guardInfo data form 'PoliceGuard' class
   private int fine; //set integer variable for parking fine
   
   private final int BASE_LATE_FEE = 25; //locked late fee
   private final int HOURLY_LATE_FEE = 10; //locket additional late fee
   
 //default contructer shares blank information for ParkingTicket     
   public ParkingTicket() {
   
   }   
   
 //constructer 'ParkingTicket' utilizes class data variables and applies each as parameters   
   public ParkingTicket(ParkedCar carInfo, ParkingMeter meterInfo, PoliceGuard guardInfo) {
      this.carInfo = carInfo; //assign carInfo parameter in 'ParkingTicket' constructor
      this.meterInfo = meterInfo; //assign meterInfo parameter in 'ParkingTicket' constructor
      this.guardInfo = guardInfo;  //assign guardInfo parameter in 'ParkingTicket' constructor
 
   }   
   
 //construct getter and setter methods for 'ParkingTicket'  
 //public methods to get data and set new data for class constructors  
   public ParkedCar getCarInfo() { //get data from 'carInfo' and returns it
      return carInfo;      
   }
   
   public void setCarInfo(ParkedCar carInfo) { //sets new input data for 'carInfo'
      this.carInfo = carInfo;
   }
      
   public ParkingMeter getMeterInfo() { //get data from 'meterInfo' and returns it
      return meterInfo;      
   }
   
   public void setMeterInfo(ParkingMeter meterInfo) { //sets new input data for 'meterInfo'
      this.meterInfo = meterInfo;
   }
      
   public PoliceGuard getGuardInfo() { //get data from 'guardInfo' and returns it
      return guardInfo;      
   }
   
   public void setGuardInfo(PoliceGuard guardInfo) { //sets new input data for 'guardInfo'
      this.guardInfo = guardInfo;
   }
      
   public int fineTotal() { //calculate a final illegal parking meter fee based on 'carInfo & meterInfo' data
      int minLeft = (carInfo.getCarMinParked() - meterInfo.getMinPurchased());
      if (minLeft > 0) {
         if (minLeft <= 60) {
            fine = BASE_LATE_FEE;
         }
         else {
            fine = BASE_LATE_FEE + (HOURLY_LATE_FEE * (minLeft / 60)); 
         }
      } return fine; //returns fine accroding to formula output
   }
   
   public String toString() { //print statement of given class properties in detail  
         String ticketWriteUp = "\t[ Parking Ticket Issued ]\n\n" + getGuardInfo() + "\n\n" +
                                getCarInfo() + "\n\nMinutes Illegally Parked: " + 
                                (carInfo.getCarMinParked() - meterInfo.getMinPurchased()) + "\nTotal Fine: $" + fineTotal();                        
         return ticketWriteUp; 
      }
         
}//end class
   