import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Jor on 2/11/2017.
 */

//entry point for the program.
//used to display the grid



public class Main extends Thread{



    public static void main(String[] args){

        //arraylist will be holding my ants and duddlebugs

        ArrayList<Ant> ants = new ArrayList<Ant>();
        ArrayList<DoodleBug> bugs = new ArrayList<DoodleBug>();

        Grid grid = new Grid(20,20);

        Ant Ant;
       // Creature cr = new Creature();
        int randAntRow = (int)(Math.random()*19); //randomize location 1
        int randAntCol = (int)(Math.random()*19); // randomize location 2
        Ant   = new Ant(grid, randAntRow,randAntCol);
        ants.add(Ant);

        int randBugRow = (int)(Math.random()*19); //randomize location 1
        int randBugCol = (int)(Math.random()*19); // randomize location 2
        DoodleBug Bug = new DoodleBug(grid, randBugRow,randBugCol);
        bugs.add(Bug);

        int counter = 0;


        while(true)
        {
            try{

                if(counter%2==0) {

                    for (Ant a : ants) {
                       System.out.println("and age before update: "+ a.getAge());
                        if (a.getAge() >= 10) {

                            grid.setChar(a.getXLocation(),a.getYLocation(), ' ');
                            grid.setColor(a.getXLocation(),a.getYLocation(),Color.ORANGE);

                        }
                        int age = a.getAge();
                        a.setAge(++age);
                        System.out.println("and age before update: "+ a.getAge());
                    }
                }
                 randAntRow = (int)(Math.random()*19); //randomize location 1
                 randAntCol = (int)(Math.random()*19); // randomize location 2
                 Ant   = new Ant(grid, randAntRow,randAntCol);
                ants.add(Ant);

                counter++;
                Thread.sleep(100);
            }catch (Exception ex){
                System.out.println("there was a thread exception");
            }

        }





            //AntObj.spawn(grid);



    }



}
