/**
 * Created by Jor on 2/11/2017.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Creature {


    private Creature creature[][];
    private boolean isAlife;
    private int age;


    //constructor
    public Creature()
    {
        creature = new Creature[20][20];

        for(int i=0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                creature[i][j] = null;
            }
        }
    }


    //spawning
    void spawn(Grid gr){


    }

}
