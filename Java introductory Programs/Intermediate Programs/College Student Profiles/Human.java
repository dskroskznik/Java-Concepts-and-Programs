//Inheritance class exercise - parent class
public class Human
{
   protected String name;
   protected int age;
   
  //constructor 
   public Human (String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public String getName() {
      return name;
   }
   
   public String toString() {
      return "Name: " + name + "\nAge: " + age;
   }
}//endclass