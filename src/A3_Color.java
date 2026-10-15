import java.awt.event.KeyEvent;

public class A3_Color extends World {


    //Variables
    public int randomBlue;
    public int randomRed;
    public int randomGreen;

    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.trailWidth = 10;

        //add value to the variable

        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);

        // r = red, g = green, B = blue\
        //Values have to be between 0-255
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.move(100);
        square();

    }// end of go


    public void square() {
        plane.hasTrail = true;
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);

        plane.move(300);
        plane.turnLeft(180);
        plane.move(200);
        plane.turnLeft(180);
        plane.move(200);
        plane.turnLeft(180);
        plane.move(200);
        plane.turnLeft(180);

    }//end of square
}//end of file
