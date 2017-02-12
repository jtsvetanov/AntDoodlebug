import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */
public class Ant extends Creature {

    Ant[][] ants;


    public Ant(){
        ants = new Ant[20][20];

        for(int i=0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                ants[i][j] = null;
            }
        }
    }

    public Ant(Grid g){
        ants = new Ant[20][20];

        for(int i=0; i < 20; i++){

            int randOne = (int)(Math.random()*19); //randomize location 1
            int randtwo = (int)(Math.random()*19); // randomize location 2
            g.setColor(randOne,randtwo,Color.BLUE);
            }

    }

    void spawn(Grid g){

        int randOne = (int)(Math.random()*19); //randomize location 1
        int randtwo = (int)(Math.random()*19); // randomize location 2

        g.setColor(randOne,randtwo, Color.BLUE);
    }

}
