public class GradStudent extends Human
{
  //private members
   private String gradSchool;

  //constructor 
   public GradStudent (String name, int age, String gradSchool) {
      super(name, age); //super reference - call parent class' constructor
      this.gradSchool = gradSchool;
   }         

   public String toString() {
      return "Name: " + getName() + "\nAge: " + super.age
              + "\nGraduate School: " + gradSchool;
   }
}//endclass