import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */
public class DoodleBug extends Creature {

    DoodleBug[][] bugs;


    public DoodleBug(){
        bugs = new DoodleBug[5][5];

        for(int i=0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bugs[i][j] = null;
            }
        }
    }

    public DoodleBug(Grid g){
        bugs = new DoodleBug[5][5];

        for(int i=0; i < 5; i++){

            int randOne = (int)(Math.random()*19); //randomize location 1
            int randtwo = (int)(Math.random()*19); // randomize location 2
            g.setColor(randOne,randtwo,Color.RED);
        }

    }

    void spawn(Grid g){

        int randOne = (int)(Math.random()*19); //randomize location 1
        int randtwo = (int)(Math.random()*19); // randomize location 2

        g.setColor(randOne,randtwo, Color.RED);
    }

}
