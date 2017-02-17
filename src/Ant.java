import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */
public class Ant extends Creature {

    private int age;
    private boolean ate;
    private int xLocation;
    private int yLocation;



    public Ant(){

    }

    //constructor
    public Ant(Grid g, int xLocation, int yLocation){
            age=0;
            ate = true;
            this.xLocation = xLocation;
            this.yLocation = yLocation;
            g.setChar(xLocation,yLocation, 'a');
            g.setColor(xLocation,yLocation,Color.BLUE);
    }



    @Override
    void spawn(Grid g){

        int randOne = (int)(Math.random()*19); //randomize location 1
        int randtwo = (int)(Math.random()*19); // randomize location 2

        g.setChar(randOne,randtwo, 'a');
        g.setColor(randOne,randtwo, Color.BLUE);
    }


    //getters and setters for our private variables

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
