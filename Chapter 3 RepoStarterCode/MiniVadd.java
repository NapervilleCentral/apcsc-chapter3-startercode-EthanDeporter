//Ethan DePorter
//9/16/19
//Minivan program 
//Focuses on overiding controls of a system so multiple elements of if's
import java.util.*;
public class MiniVadd
{

    public static void MiniVadd()
    {  
        Scanner bob = new Scanner(System.in);//Setting up scanner
        char DL,DR,CL,MU,IL,IR,OL,OR, G;
        String choice;
        System.out.println("What is the configuration of your van?");
        choice=bob.nextLine();
        DL =choice.charAt(0);
        DR =choice.charAt(1);
        CL =choice.charAt(2);
        MU =choice.charAt(3);
        IL =choice.charAt(4);
        IR =choice.charAt(5);
        OL =choice.charAt(6);
        OR =choice.charAt(7);
        G =choice.charAt(8);
        
        
        if(G=='P' && MU==1){
            if(DR==1 && DL==1){
                System.out.println("both");}
            else if(DR==1){
                System.out.println("right");}
            else if(DL==1){
                System.out.println("left");}
            else{
                if(CL==0){
                    if(IL==1 && IR==1){
                        System.out.println("both");}
                    else if(IL==1){
                        System.out.println("left");}
                    else if(IR==1){
                        System.out.println("right");}
                    else{
                        System.out.println("neither");}
                    if(OR==1 && OL==1){
                        System.out.println("both");}
                    else if(OR==1){
                        System.out.println("right");}
                    else if(OL==1){
                        System.out.println("left");}
                    else{
                        System.out.println("neither");}}
                else if(CL==1){
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
