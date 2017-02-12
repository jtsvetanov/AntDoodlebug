import javax.swing.*;
import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */

//Grid display class

public class Grid extends JFrame {



    private JLabel labels[];
    private Container container;
    private GridLayout layout;
    int row;
    int col;

    // set up GUI
    public Grid(int row, int col)
    {
        super( "Game Of Life - Jordan" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set up grid layout struture of the display
        this.row = row;
        this.col = col;
        layout = new GridLayout( row, col );
        container = getContentPane();
        container.setLayout(layout);

        // create and add buttons
        labels = new JLabel[ row * col ];

        for ( int i = 0; i < labels.length; i++ ) {
            labels[ i ] = new JLabel( " " );
            labels[i].setOpaque(true);
            container.add( labels[ i ] );
        }

        // set up the size of the window and show it
        setSize( col*20,row*20);
        setVisible( true );

    } // end constructor GridLayoutDemo

    // display the given char in the (row,col) position of the display
    public void setChar (int rowX, int colY, char c)
    {
        if ((rowX >= 0 && rowX < row) && (colY >= 0 && colY < col) )
        {
            int pos = rowX*col + colY;
            labels [pos].setText("" + c);
        }
    }

    // display the given color in the (row,col) position of the display
    public void setColor (int rowX, int colY, Color c)
    {
        if ((rowX >= 0 && rowX < row ) && (colY >= 0 && colY < col ) )
        {
        int pos = rowX * col  + colY;
        labels [pos].setBackground(c);
    }
    }

}
