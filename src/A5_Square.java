public class A5_Square extends World {

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 3;
        plane.setTrailColor(100, 10, 200);

        plane.setAngle(90);
        square(100);
        plane.teleport(100, 50);
        //plane.teleport
        bigsquare();
        plane.teleport(300, 150);
        square(300);
        plane.teleport(50, 150);
        square(400);
        plane.teleport(110, 25);

        star(144);
        plane.setAngle(144);
        plane.teleport(150, 100);
        star(144);
        plane.teleport(300, 150);
        star(144);
        plane.teleport(10, 100);





    }


    //todo:make two more squares different sizes
    //parameter type of variable that live inside methods
    public void square(int size) {
        plane.setAngle(90);
        //integer
        plane.hasTrail = true;
        //boolean
        plane.trailWidth = 10;
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        // notice the direction your plane is facing at this point
    }
    //todo: make another method called big square that makes a square thats big
    public void bigsquare() {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);
        plane.turnLeft(90);
        plane.move(222);


    }
    public void star (int degree) {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 15;
        plane.move(100);
        plane.turnLeft(degree);
        plane.move(100);
        plane.turnLeft(degree);
        plane.move(100);
        plane.turnLeft(degree);
        plane.move(100);
        plane.turnLeft(degree);
        plane.move(100);
        plane.turnLeft(144);
        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);
        plane.setTrailColor(randomRed, randomGreen, randomBlue);
    }
    public int randomBlue;
    public int randomRed;
    public int randomGreen;

}


