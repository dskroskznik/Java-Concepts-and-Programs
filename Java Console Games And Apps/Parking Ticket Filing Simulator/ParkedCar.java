/***************************************************
 * This class represents a parked car 'object' and *
 * its data pertaining to the cars characteristics *
 **************************************************/
public class ParkedCar //Class represents parked car
{
   //construct String & Integer variables of parked cars properties 
   private String carMake, carModel, carColor, carLic;
   private static int carMinParked;
   
   //default object constructer shares blank information  
   public ParkedCar() {
      carMake = " ";
      carModel = " ";
      carColor = " ";
      carLic = " ";
      carMinParked = 0;
   }
   
   //constructs parked car variables with your car properties as parameters    
   public ParkedCar(String carMake, String carModel, String carColor, String carLic, int carMinParked) {
      this.carMake = carMake; //assigns input to String 'carMake'
      this.carModel = carModel; //assign input to String 'carModel'
      this.carColor = carColor; //assign input to String 'carColor'
      this.carLic = carLic; //assign input to String 'carLic'
      ParkedCar.carMinParked = carMinParked; //assign int of min parked to Integer carMinParked
   }
   
   //construct getter and setter methods for 'ParkedCar'  
   //public methods to get data and set new data to and from parkedcar property variables 
   public String getCarMake() { //get data from 'carMake' and returns it
      return carMake;      
   }
   
   public void setCarMake(String carMake) { //sets new assigned input for 'carMake'
      this.carMake = carMake;
   }
      
   public String getCarModel() { //get data from 'carModel' and returns it
      return carModel; 
   }
   
   public void setCarModel(String carModel) { //sets new assigned input for 'carModel'
      this.carModel = carModel;
   }
   
   public String getCarColor() { //get data from 'carColor' and returns it
      return carColor;
   }
   
   public void setCarColor(String carColor) { //sets new assigned input for 'carColor'
      this.carColor = carColor;
   }      
      
   public String getCarLic() { //get data from 'carLic' and returns it
      return carLic.toUpperCase();
   }
   
   public void setCarLic(String carLic) { //sets new assigned input for 'carLic'
      this.carLic = carLic.toUpperCase(); //format ALL UPPERCASE
   }
   
   public int getCarMinParked() { //gets data off minutes car was parked 
      return carMinParked;
   }
   
   public void setCarMinParked(int carMinParked) { //sets new data input for minutes car parked
      ParkedCar.carMinParked = carMinParked;
   }
   
   public String toString() { //print statement of given class properties in detail  
      String parkedCar = "-----Car Details-----" + 
                      "\nMake: " + getCarMake() + "\nModel: " + getCarModel() +
                      "\nColor: " + getCarColor() + "\nLicense Tag: " + getCarLic();
      return parkedCar; 
   }
    
}//end class
   