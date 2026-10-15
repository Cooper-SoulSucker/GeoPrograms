public class GHImage extends World {
    public int RandomX;
    public int RandomY;
    public int randomBlue;
    public int randomRed;
    public int randomGreen;

    public void go() {
        sky();
        sun();
        water();
        mountains();
        square();
        for (int x = 0; x < 45; x++) {
            Meteorshower();
        }



    }// end of go


    public void sky() {
        //sky lines
        plane.hasTrail = true;
        plane.trailWidth = 15;
        plane.pausetime = 1/2;


        for (int x = 0; x < 15; x++) {
            // 15 lines that are different colored sunset lines ( red and yellowish orange)
            if (x < 7) {
                plane.setTrailColor(255, 100, 50);
            }
            if (x > 7)
                plane.setTrailColor(255, 170, 50);


            plane.hasTrail = false;
            plane.teleport(100, 100 + x * 20);
            plane.hasTrail = true;
            plane.move(800);





        }//end of for


    }// end of go

    public void sun() {
        // Yellow sun method
        plane.hasTrail =false;
        plane.teleport(500,300);
        plane.setTrailColor(255, 100, 10);
        plane.trailWidth = 20;
        plane.hasTrail =true;
            // circle for the sun
        for (int x = 0; x < 36; x++) {
            plane.move(10);
            plane.turnLeft(10);

        }//end of for


    }//end of sun

    public void square(){
        //square to fill the sun
        plane.teleport(465,245);
        plane.setTrailColor(255, 100, 10);
        //integer
        plane.hasTrail = true;
        //boolean
        plane.trailWidth = 55;
        plane.move(50);
        plane.turnLeft(90);
        plane.move(50);
        plane.turnLeft(90);
        plane.move(50);
        plane.turnLeft(90);
        plane.move(50);
    }//end of square

    public void water() {
        // blue ocean lines
        plane.setTrailColor(0,100,255);
        //13 lines needed for ocean
        for (int x = 0; x < 13; x++) {
            plane.hasTrail = false;
            plane.teleport(100,500 + x * 20);
            plane.hasTrail = true;
            plane.trailWidth = 13;
            plane.move(800);
        }//end of for


    }// end of water

    public void mountains() {
        // mountains method
        plane.setTrailColor(120,70,30);
        plane.trailWidth = 10;
        plane.hasTrail = false;
        plane.teleport(100,480);
        plane.hasTrail = true;
        //5 peaks of the mountain
        for (int x = 0; x < 05; x++) {
            plane.turnLeft(60);
            plane.move(150);
            plane.turnLeft(240);
            plane.move(150);
            plane.turnLeft(60);
        }//end of for

    }//end of mountains

    public void Meteorshower(){
        //random colored lines that look like a meteorshower
        randomBlue = plane.random(0, 255);
        randomRed = plane.random(0, 255);
        randomGreen = plane.random(0, 255);
        plane.setTrailColor(randomRed,randomRed,randomGreen);
        plane.trailWidth = 5;
        plane.hasTrail = false;
        RandomY = plane.random(0, 255);
        RandomX = plane.random(0, 255);
        plane.teleport(RandomX,RandomY);
        plane.hasTrail = true;

        plane.setAngle(45);
        plane.move(90);
        plane.setAngle(45);
        plane.move(90);


    }//end of meteorshower




}// end of file

