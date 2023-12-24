// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.17

public class PersonBuilder
{
   public static void main (String [] args)
   {
      //Aggregation example
      Address school = new Address("4321 E. Fowler Boulovard", "Tampa", "FL", 33440);
      Address home = new Address("1243 Leila Avenue", "St. Petersburg", "FL", 45670);
      
      //Intern object
      Intern staff1 = new Intern("Eddy Brock", home, school);
      
         System.out.print(staff1);
      
      //Inheritance
      GradStudent gradS1 = new GradStudent("Tony Stark", 21, "MIT: Mass. Institute of Tech. University");
         System.out.println(gradS1);
   }//end main
}//end class