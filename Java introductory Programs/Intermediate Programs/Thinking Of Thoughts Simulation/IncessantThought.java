public class IncessantThought extends Thought
{
   @Override //optional tag, to verify same method signatures
             //method signature - name of method plus parameters list
   public void message()
   {  
      super.message(); //calls parent version of message
   
      System.out.println("You thought of the thing... didn't you?");   
   }
}//end class