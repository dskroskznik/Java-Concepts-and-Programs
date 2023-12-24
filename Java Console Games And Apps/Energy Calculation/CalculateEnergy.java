/**********************************************************************
*   This program works to read integers between  0 and 1000 and       *
*  adds the integers of each digit into its own sum                   *
***********************************************************************/
   
import java.util.Scanner; //Utilize a Scanner for user input

public class CalculateEnergy 
{
    public static void main(String [] args)
    {
        //Declare data variables
        float waterMass, waterTempInitial, waterTempFinal, energy;
        float engFloat = (float)4179.4;        

        //Create the Scanner Object
        try (Scanner scan = new Scanner(System.in)) {
            //input amount in water (in kilograms)
            System.out.println(">-------------------------------------<");
            System.out.println("Enter amount of water in kilograms:");
            waterMass = scan.nextInt();
            
            //input initial temp of water
            System.out.println("Enter intitial temp of water in Celsius:");
            waterTempInitial = scan.nextInt();
                    
            //input final temp of water (in Celsius)
            System.out.println("Enter final temp of water in Celcius:");
            waterTempFinal = scan.nextInt();
                    
            //output total energy   
            energy = waterMass * (waterTempFinal - waterTempInitial) * engFloat;
            System.out.printf("The total energy needed is %4e", energy);           
            System.out.printf("\nOR\n%5e", (double)energy);
            System.out.println(">-------------------------------------<");
        }
   }//end main
}//end class