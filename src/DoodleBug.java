import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */
public class DoodleBug extends Creature {

    private int age;
    private boolean ate;
    int xLocation;
    int yLocation;



    public DoodleBug(){

    }

    //constructor
    public DoodleBug(Grid g, int xLocation, int yLocation){


        age=0;
        ate = true;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        g.setChar(xLocation,yLocation, 'b');
        g.setColor(xLocation,yLocation,Color.RED);
    }



    @Override
    void spawn(Grid g){

        int randOne = (int)(Math.random()*19); //randomize location 1
        int randtwo = (int)(Math.random()*19); // randomize location 2

        g.setColor(randOne,randtwo, Color.RED);
    }


    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getAte() {
        return ate;
    }

    public void setAte(boolean ate) {
        this.ate = ate;
    }

    public int getXLocation() {
        return xLocation;
    }

    public void setXLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setYLocation(int yLocation) {
        this.yLocation = yLocation;
    }

}
