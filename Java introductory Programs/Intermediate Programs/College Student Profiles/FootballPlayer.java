//a secondary child class - (whose parent class derives from a child class)
public class FootballPlayer extends Athletes
{
   private String team;
   
   public FootballPlayer(String name, int age, double height, double weight, String team) {
      super(name, age, height, weight);
      this.team = team;
        
   
   }
   public String toString() { 
      return "Name: " + getName() + "\nAge: " + super.age + "\nHeight(in inches): " + getHeight()
               + "\nWeight(in pounds): " + getWeight() + "\nTeam Name: " + team;
   
      
   }



}