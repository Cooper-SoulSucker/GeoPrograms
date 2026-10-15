public class A7_BasicLoop extends World {
    public int RandomX;
    public int RandomY;

    public int randomBlue;
    public int randomRed;
    public int randomGreen;





    public void go() {

        for (int y = 0; y < 10; y++) {



        for (int x = 0; x < 12; x = x + 1) {

            plane.setTrailColor(x*20+10, x*10, 0);
            plane.teleport(x * 100, y *250 + 100);
            square();
        }

//            // first part is variable exploration
//
//            // second part is an if statement (conditional). Question
//
//            // third part is the incrememnt
//
//            // make a row of squares using teleport
//
//            RandomY = plane.random(10, 900);
//            RandomX = plane.random(10, 500);
//
//            randomBlue = plane.random(0, 255);
//            randomRed = plane.random(0, 255);
//            randomGreen = plane.random(0, 255);
//            plane.setTrailColor(randomRed, randomGreen, randomBlue);
//
//            System.out.println("x: " + x);
//            plane.teleport(RandomX, RandomY);
//            plane.square(100);



        }
    }
    public void square() {
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.pausetime = 3/2;



            // todo: make a loop that loops four times


            for (int x = 0; x < 8; x++) {

                plane.move(50);
                plane.turnLeft(90);

                //todo: draw a square only using two lines of code

            }

        }//end of for
    }
        //end of file