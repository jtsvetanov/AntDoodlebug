import javax.swing.*;
import java.awt.*;

/**
 * Created by Jor on 2/11/2017.
 */

//Grid display class

public class Grid extends JFrame {


    private JLabel labels[][];
    private Container container;
    private GridLayout layout;
    int row;
    int col;

    // set up GUI
    public Grid(int row, int col)
    {
        super( "Game Of Life" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set up grid layout struture of the display
        this.row = row;
        this.col = col;
        layout = new GridLayout(row,col);
        container = getContentPane();
        container.setLayout(layout);

        // create and add buttons
        labels = new JLabel[row][col];

        for ( int i = 0; i <row; i++ ) {
            for(int j = 0;j<col;j++) {
                labels[i][j] = new JLabel(" ");
                labels[i][j].setOpaque(true);
                container.add( labels[i][j]);
            }
        }

        // set up the size of the window and show it
        setSize( col,row);
        setVisible( true );

    } // end constructor GridLayoutDemo

    // display the given char in the (row,col) position of the display
    public void setChar (int rowX, int colY, char c)
    {
//        if ((rowX >= 0 && rowX < row) && (colY >= 0 && colY < col) )
//        {
//            int pos = row*colY + col;
//            labels [pos].setText("" + c);
//        }
    }

    // display the given color in the (row,col) position of the display
    public void setColor (int rowC, int colC, Color c)
    {
        if ((rowC >= 0 && rowC < row  ) && (colC >= 0 && colC < col) )
        {
            labels [rowC][colC].setBackground(c);
        }
    }

}
