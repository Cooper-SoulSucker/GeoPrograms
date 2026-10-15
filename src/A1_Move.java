import java.awt.*;

public class A1_Move extends World {

    public void go() {
        System.out.println("This message will be printed to the window below.");



        //Variables
        int randomBlue;
        int randomRed;
        int randomGreen;

        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);

        plane.setTrailColor(randomRed, randomGreen, randomBlue);
        plane.move(100);
        cat();
    }

    private void cat() {
        plane.pausetime = 1;
        plane.trailWidth = 5;

        plane.hasTrail = false;
        plane.setAngle(270);
        plane.move(250);

        plane.hasTrail = true;


        plane.setAngle(315);
        plane.move(55);
        plane.setAngle(45);
        plane.move(55);

        plane.setAngle(0);
        plane.move(40);

        plane.setAngle(315);
        plane.move(55);
        plane.setAngle(45);
        plane.move(55);

        plane.setAngle(90);
        plane.move(200);

        plane.setAngle(140);
        plane.move(50);

        plane.setAngle(180);
        plane.move(120);

        plane.setAngle(220);
        plane.move(50);

        plane.setAngle(270);
        plane.move(200);
    }


    }


