/*************************************************************
 * This class represents a police officer 'object' with      *
 * data pertaining to their name and badge ID number,        *
 * this will examine a parked car to determine an expired    *
 * status and issues a parking ticket object if such happens *
 ************************************************************/
 public class PoliceGuard //Class represents a police officer
 {
 //construct Long & String variables for the police officers properties
   private String guardName;
   private long guardBadgeID;

 //default constructer method for 'PoliceGuard' shares blank information 
   public PoliceGuard() {
   
   }
   
 //constructer 'PoliceGuard' utilizes data from variables and applies each as parameters    
   public PoliceGuard(String guardName, long guardBadgeID) {
      this.guardName = guardName; //assigns input to String 'guardName'
      this.guardBadgeID = guardBadgeID; //assigns input to long 'guardBadgeID'
   }
 
 //construct getter and setter methods for 'PoliceGuard'  
 //public methods to get data and set new data to 'PoliceGuard' 
   public String getGuardName() { //get data from 'guardName' and returns it
      return guardName;      
   }
   
   public void setGuardName(String guardName) { //sets new input data for 'guardName'
      this.guardName = guardName;
   }
   
   public long getGuardBadgeID() { //get data from 'guardBadgeID' and returns it
      return guardBadgeID;
   }
   
   public void setGuardBadgeID(long guardBadgeID) { //sets new input data for 'guardBadgeID'
      this.guardBadgeID = guardBadgeID;
   }
   
 //constructed method to determine illegal parking based on data from 'ParkedCar & ParkingMeter' Classes    
   public boolean examineParkTime(ParkedCar carInfo, ParkingMeter meterInfo) {   
      if (carInfo.getCarMinParked() > meterInfo.getMinPurchased()) {
         return true; //returns true if illegal parking     
      }
      else {
         return false; //returns false if no illegal parking 
      }
   }
 //a constructed method of type 'ParkingTicket' which will issue a ticket based off ticket data from
 //the three specified classes, 'ParkedCar' carInfo, 'ParkingMeter' meterInfo, 'PoliceGuard' guard  
   public ParkingTicket issueTicket(ParkedCar carInfo, ParkingMeter meterInfo, PoliceGuard guard) {
      ParkingTicket ticket = null; //initializes ticket object beforehand
      if (examineParkTime(carInfo, meterInfo) == true) { //returns filed ticket with parameter data if 'examineParkTime' is true
         ticket = new ParkingTicket(carInfo, meterInfo, guard);                
         return ticket;
      }
      else { //returns blanket ticket if method 'examineParkTime' is false
         ticket = new ParkingTicket();   
         return ticket;
      }
   }
      
   public String toString() { //print statement of given class properties in detail  
      String guardDetails = "----Officer Details----" + 
                      "\nPolice Guard Name: " + getGuardName() +
                      "\nPolice Guard ID: " + getGuardBadgeID();
      return guardDetails; 
   }
   
}//end class 