//Ethan DePorter
//9/18/19
//Drawing a square with a triangle on one side of it
//DrawSquare1
import TurtleGraphics.StandardPen; //importing the necessary drawing tools
import java.util.Random;
import java.awt.*;

public class DrawSquare1
{
public static void main(String[] args)
{
    Random gen = new Random(); //Setting up the randomizations
    StandardPen pen = new StandardPen();//Getting the pen


    // puts the pen in the pos to start shape
    pen.up();//Puts the pen up off the pad
    pen.move(25);
    pen.turn(90); pen.move(25);
    pen.down();//Puts the pen down on the pad


    pen.setColor(Color.red);//Square color
    pen.down();//Initializing the start of drawing
    pen.move(50); //One side                                                                                         
    pen.turn(90); //Right angle
    pen.move(50);
    pen.turn(90);
    pen.move(50);
    pen.turn(90);
    pen.move(50);
    pen.setColor(Color.blue);//Triangle color
    pen.move(50);//Precised right angle
    pen.turn(135);//Simulating a 45 degree angle by 180-135
    pen.move(70.7106781187);//50 root 2 or the hypotoneuse
    pen.turn(135);//Another 45 degree angle turn
    pen.move(50);//Last side
    


//  pen.turn(90); pen.move(100);
    //pen.setWidth(10);
//  pen.turn(90); pen.move(100);
//  pen.setColor(Color.green);
//  pen.turn(90); pen.move(100);


/*  for (int i = 25; i <720; i++)
    {
        pen.turn(i*3);
        pen.move(20);
    }

*/



/**/




/*
    for(int i =0;i<1000;i++)
    {
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    }
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    pen.move(25);
    pen.turn(gen.nextInt(90)+1);
    pen.move(25);
*/
}
}