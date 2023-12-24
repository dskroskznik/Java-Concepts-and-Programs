public class Intern
{
   private String fullname;
   private Address home, school; //aggregation
   
  //constructor
   public Intern (String fullname, Address home, Address school)
   {
      this.fullname = fullname;
      this.home = home;
      this.school = school;
   }
   
  //toString
   public String toString()
   {
      String internInfo;
      internInfo = fullname + "\nHome Address: " + home + 
                   "\nSchool Address: " + school;
      return internInfo;
   }

}//endclass