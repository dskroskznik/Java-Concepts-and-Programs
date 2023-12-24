// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.3
/*******************************************************************
 * This program construct a class build for a object of type       *
 * Dog to setup easy method builders to help classify a Dog's      *
 * name, age, human age equivalent within a driver file named Pack *
 ******************************************************************/

//CLASS DOGS: object defining dogs based off name, age, 
import java.text.DecimalFormat;

//begin class "Dog"
public class Dog
{
   //set double type numbers with 2 decimal place formatting with DecimalFormat object
   DecimalFormat df = new DecimalFormat("#.##");
   //initialize a private static variable to count instances of Dog method
   private static int dogCount = 0;
   //create 2 private variable instances to allow methods to hold name and age data
   private String name;
   private double age;

 //constructor named Dog, no parameters needed, placeholds fixed variable data for blank objects
 //updates objects data if objects created using the contructor 
   public Dog() {
      name = " ";
      age = 1;
      
      dogCount++; //increments count instance variable for each Dog object created using this constructor
   }
   
 //overloaded Dog contructor, allow parameters for Dog objects created with needed object data    
   public Dog(String nameDog, double ageDog) { //assign parameter references points for method
      name = nameDog; 
      age = ageDog;
    
      dogCount++;
   }
   
 //accessor method to access name data from dog objects
   public String getNameDog() { return name; }
   
 //mutator method allowed to set new name data of dog objects  
   public String setNameDog(String nameDog) {
      name = nameDog;
      return name; 
   }
   
 //accessor method to access age data from dog objects
   public double getAgeDog() { return age; }

 //mutator method allowed to set new name data of dog objects     
   public double setAgeDog(double ageDog) {
      age = ageDog;
      return age; 
   }

 //method to calculate and return the age of dog in human years 
 //using defined formula for finding dogs ages in human years
   public String personYears() {        
      return df.format((16 * Math.log(age)) + 31); 
   }
   
 //static method to return a instance variable pre-defined that 
 //increments amount uses from Dog() method in driver class file
   public static int getDogInstances() {
      return dogCount;
   }
   
 //toString method here contructs print statement showcasing object data when printing selected dog object
 //allowing other Dog class methods to share their method data into the return statement   
   public String toString() {
      return "Dog Name: " + getNameDog() + "\n\t Age: " + getAgeDog() + " | Age In Human Years: " + personYears(); 
   }
}//end class