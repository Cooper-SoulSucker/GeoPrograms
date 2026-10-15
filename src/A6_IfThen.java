public class A6_IfThen extends World {

    public int randNum;

   public int randomBlue;
   public int randomRed;
    public int randomGreen;

    public int RandomX;
    public int RandomY;



    public void go() {

        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);

        RandomY = plane.random(0, 255);
        RandomX = plane.random(0, 255);

        plane.hasTrail = true;
        plane.pausetime = 2;
        plane.teleport(RandomX, RandomY);
        plane.setTrailColor(randomBlue, randomRed, randomGreen);



        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);


        }
        //todo: write and if that asks the question if randomnum 3
        if (randNum == 3) {
            cat();

        }
        //Variables



    }


    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    } //end of rectangle

    // todo: add a method to the file. you can copy and paste an old one or new one


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



