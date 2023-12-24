//excepetion - unusual situation (fixable)
//error - unusual unrecoverable situation (avoid)
public class OutofmyRange extends Exception
{
   public OutofmyRange (String message)
   {
      super(message);
   
   }

}


