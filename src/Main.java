import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */

//entry point for the program.
//used to display the grid



public class Main extends Thread{



    public static void main(String[] args){

        Grid grid = new Grid(20,20);

       // Creature cr = new Creature();

            Ant AntObj  = new Ant(grid);
        DoodleBug big = new DoodleBug(grid);
            //AntObj.spawn(grid);


//        grid.setChar(19,19,'g');
//        grid.setColor(0,0, Color.BLUE);
//        grid.setColor(0,19, Color.BLUE);
//        grid.setColor(19,0, Color.BLUE);
//        grid.setColor(19,19, Color.BLUE);

       // grid.lablesCreate(400, 400);


    }



}
