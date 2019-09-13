//Ethan DePorter
//9/13/19
//Planet Weight
//Determines what planet the user wants and then what their weight would be on that planet
import java.util.*;
public class PlanetWeight
{

    public static void PlanetWeight(){
        Scanner bob= new Scanner(System.in);//Building the Scanner
        System.out.println("Pick a planet by typing the corresponding letter below: ");
        System.out.println("Earth (E)");
        System.out.println("Jupiter (J)");
        System.out.println("Saturn (S)"); // All of this is formating a menu for them to choose 
        System.out.println("Uranus (U)"); // from
        System.out.println("Neptune (N)");
        System.out.println("Mars (M)");
        System.out.println("Venus (V)");
        System.out.println("Mercury (C)");
        char choice=bob.next().charAt(0); //Taking that character
        System.out.println("What is your weight to see your weight on the planets? ");
        double weight=bob.nextDouble(); //Taking in their weight, even as a decimal
        switch(choice){ //Starting a switch
            case 'E': //if its earth
            case 'e':
                System.out.println("Your weight on Earth is "+weight+" lbs"); //Prints the weight
                break;
            case 'J':
            case 'j'://Jupiter
                System.out.println("Your weight on Jupiter is "+(weight*2.528)+" lbs");
                break;
            case 's':
            case 'S'://Saturn
                System.out.println("Your weight on Saturn is "+(weight*1.07)+" lbs");
                break;
            case 'U':
            case 'u'://Uranus
                System.out.println("Your weight on Uranus is "+(weight*0.86)+" lbs");
                break;
            case 'N':
            case 'n'://Neptune
                System.out.println("Your weight on Neptune is "+(weight*1.1)+" lbs");
                break;
            case 'V':
            case 'v'://Venus
                System.out.println("Your weight on Venus is "+(weight*0.907)+" lbs");
                break;
            case 'M':
            case 'm'://Mars
                System.out.println("Your weight on Mars is "+(weight*0.377)+" lbs");
                break;
            case 'C':
            case 'c'://Mercury
                System.out.println("Your weight on Mercury is "+(weight*0.378)+" lbs");
                break;
    }}}

