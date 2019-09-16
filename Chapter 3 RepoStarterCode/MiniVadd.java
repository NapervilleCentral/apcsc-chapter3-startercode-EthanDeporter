//Ethan DePorter
//9/16/19
//Minivan program 
//Focuses on overiding controls of a system so multiple elements of if's
import java.util.*;
public class MiniVadd
{

    public static void MiniVadd()
    {  
        Scanner bob = new Scanner(System.in);
        int DL,DR,CL,MU,IL,IR,OL,OR, choice;
        String G;
        System.out.println("For each instance put 0 for false and 1 for true or trying to open.(put driving mode for Gear)");
        System.out.println("Dashboard Left");
        DL = bob.nextInt();
        System.out.println("Dashboard Right");
        DR = bob.nextInt();
        System.out.println("Child lock");
        CL = bob.nextInt();
        System.out.println("Master unlock");
        MU = bob.nextInt();
        System.out.println("Inside or outside doors? (1 for inside 0 for outside)");
        choice= bob.nextInt();
        if(choice==1){
            System.out.println("Inside Left");
            IL = bob.nextInt();
            System.out.println("Inside Right");
            IR = bob.nextInt();
            OR=0;
            OL=0;}
            
        else{
            System.out.println("Outside Left");
            OL = bob.nextInt();
            System.out.println("Outside Right");
            OR = bob.nextInt();
            IR=0;
            IL=0;}
           
        System.out.println("Gear(D, R, P, 1, 2, 3, etc.)");
        G = bob.nextLine();
        if(G.equals("P") && MU==1){
            if(DR==1 && DL==1){
                System.out.println("both");}
            else if(DR==1){
                System.out.println("right");}
            else if(DL==1){
                System.out.println("left");}
            else{
                if(choice==1 && CL==0){
                    if(IL==1 && IR==1){
                        System.out.println("both");}
                    else if(IL==1){
                        System.out.println("left");}
                    else if(IR==1){
                        System.out.println("right");}
                    else{
                        System.out.println("neither");}}
                else if(choice==1 && CL==1){
                    System.out.println("neither");}
                else if(choice==0){
                    if(OR==1 && OL==1){
                        System.out.println("both");}
                    else if(OR==1){
                        System.out.println("right");}
                    else if(OL==1){
                        System.out.println("left");}
                    else{
                        System.out.println("neither");}}
                else{
                    System.out.println("neither");}}}
        else{
              System.out.println("neither");}
                    
                    
            
    }
}
