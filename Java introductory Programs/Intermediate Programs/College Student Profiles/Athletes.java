public class Athletes extends Human
{
   private double height;
   protected int weight;
   
  //constructor 
   public Athletes (String name, int age, double height, double weight) {
      super(name, age);
      this.height = height;
      this.height = height;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public String toString() {
      return "Name: " + getName() + "\nAge: " + super.age + 
               "\nHeight(in inches): " + height + "\nWeight(in pounds): " + weight;
   }
}//endclass