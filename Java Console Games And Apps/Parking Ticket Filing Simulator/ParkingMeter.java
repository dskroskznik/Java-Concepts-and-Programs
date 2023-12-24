// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.16
/******************************************************
 * This class represents a parking meter 'object' and *
 * contains methods and data collected pertaining to  *
 * how long the car has been parked and the minutes   *
 * of parked time purchased in the parking meter      *
 *****************************************************/
public class ParkingMeter //Class represents parking meter
{
   //construct Static Integer variables of parking meter and car parking length properties 
   private static int parkingMinPurchased;
   private static int parkedCarTime;
   
   //default object contructer shares blank information on parking meter minutes    
   public ParkingMeter() {
         parkingMinPurchased = 0;
   }
 
   //constructs parking meter minutes purchased variable with parking minutes purchased as a parameter 
   public ParkingMeter(int parkingMinPurchased) {
         ParkingMeter.parkingMinPurchased = parkingMinPurchased;
   }
 
   //construct getter and setter methods for 'ParkingMeter'  
   //public methods to get data and set new data to and from parkedcar property variables        
   public int getMinPurchased() { //get data from 'parkingMinPurchased' and returns it
      return parkingMinPurchased;
   }
   
   public void setMinPurchased(int parkingMinPurchased) { //sets new input for 'parkingMinPurchased'
      ParkingMeter.parkingMinPurchased = parkingMinPurchased;
   }
   
   public int getParkedCarTime() { //get data from 'parkedCarTime' and returns it
      return parkedCarTime;
   }
   
   public void setParkedCarTime(int parkedCarTime) { //sets new assigned input for 'parkedCarTime'
      ParkingMeter.parkedCarTime = parkedCarTime;
   }
 
   public String toString() { //print statement of given class status in detail 
      String meterOutput = "----Meter Status----\n" + 
                      "Number of minutes car was parked: " +  getParkedCarTime() +
                      "\nNumber of minutes paid to park: " + getMinPurchased() + "\n\n";
      return meterOutput; 
   }
   
}//end class 