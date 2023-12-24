public class Address
{
   private String street, city, state;
   private long zipCode;
   
  //constructor
   public Address (String street, String city, String state, long zipCode)
   {
      this.street = street;
      this.city = city;
      this.street = state;
      this.zipCode = zipCode;
   }
   
  //toString
   public String toString()
   {
      String fullAddress;
      fullAddress = street + "\n" + city + ", " + state + 
                    ", " + zipCode;
      return fullAddress;
   }



}//endclass