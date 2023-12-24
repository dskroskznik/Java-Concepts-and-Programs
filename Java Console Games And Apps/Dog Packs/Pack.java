// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.3
/*******************************************************************
 * This program construct a class build for a object of type       *
 * Dog to setup easy method builders to help classify a Dog's      *
 * name, age, human age equivalent within a driver file named Pack *
 ******************************************************************/
 
import java.util.*; //WildCare called for utilites package - Scanner,ArrayList,etc.

public class Pack
{
   public static void main (String [] args)
   {
      //assign and initialize dog age and name for updating an objects methodstry 
      try(Scanner scan = new Scanner(System.in)) {
         String name;
         double age = 0; 
           
      //add dog objects, hardcode 2 dog objects parameters
      //3rd dog object leaves no parameteres inputted     
         Dog dogOne = new Dog("Doug",2);
         Dog dogTwo = new Dog("Lily",9);
         Dog dogThree = new Dog("name",age);
 
      //print statement for original dog pack you have started with
         System.out.println("Here's your original pack of dogs: ");
         System.out.println("=---------------------------------=");
         System.out.println(dogOne); //dog object 1
         System.out.println(dogTwo); //dog object 2
         System.out.println(dogThree); //dog object 3 w/ empty data
         System.out.println();
            
      //test senario for setting new dog parameters to 3rd dog object with it's name and age
         System.out.println("OH! You adopted a new dog, go ahead and decide on a name. ");
         System.out.println("What's your new dogs name? ");
         name = scan.next(); //assigns name value in dog object with next string input
         dogThree.setNameDog(name); //sets name parameter to dog object 3 
         System.out.println("How old is " + dogThree.getNameDog() + "?");
         age = scan.nextDouble(); //assigns age value in dog object with next age input
         while (age < 1) { //use while loop to accept only ages over 0
            System.out.println("How old is the new dog, " + dogThree.getNameDog() + "?");
            age = scan.nextDouble(); 
         }
         dogThree.setAgeDog(age); //sets age parameter to dog object 3 
             
      //test senario to change and apply new name parameters to previously assigned objects parameters         
      //asks for suggested dog nicknames for dog object 1 & 2
         System.out.println("Does any of your dogs have a nickname you prefer?");         
         System.out.println("What is " + dogOne.getNameDog() + "'s nickname? ");
         name = scan.next(); //scan new name input for dog object 1
         System.out.print(dogOne.getNameDog() + " also answers to ");
         dogOne.setNameDog(name); //sets new name input to dog 1 parameters
         System.out.println(dogOne.getNameDog());
            
         System.out.println("What is " + dogTwo.getNameDog() + "'s nickname? ");
         name = scan.next(); //scan new name input for dog object 2
         System.out.print(dogTwo.getNameDog() + " also answers to ");
         dogTwo.setNameDog(name); //sets new name input to dog 2 parameters
         System.out.println(dogTwo.getNameDog());
            
      //test scenario for updating age parameter with modifier and accessor                  
         System.out.println("Wait, looks like " + dogOne.getNameDog() + " had a birthday!");
         age = dogOne.getAgeDog(); //re-assigns age value to dog object 1 age data
         dogOne.setAgeDog(age + 1); //and updates the set age by 1 from birthday
         System.out.println("Happy Birthday, " + dogOne.getNameDog() + 
                             ". \n You're now " + dogOne.getAgeDog() + " years old, "
                             + dogOne.personYears() + " in human years. \n");                  

      //update data set for new dog pack featuring new dog addition      
         System.out.println("Here's your updated pack of dogs: ");
         System.out.println("=---------------------------------=");
         System.out.println(dogOne);
         System.out.println(dogTwo);
         System.out.println(dogThree);
      }
      //use constructor assigned method for instances where Dog methods were called
      System.out.println();               
      System.out.println("This code provided info on " + Dog.getDogInstances() + " dogs.");
        
   }//end main
}//end class