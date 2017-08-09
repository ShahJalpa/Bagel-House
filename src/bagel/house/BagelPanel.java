/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagel.house;

/**
 *
 * @author jalpa
 */
import java.awt.*;
import javax.swing.*;
//to select white or wheat bagel
public class BagelPanel extends JPanel{
    
    //cost of white and wheat bagel
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;
    
    //Radio button variable are used to select the any one of the bagel
    private JRadioButton whiteBagel;
    private JRadioButton wheatBagel;
    
    // ButtonGroup object to group the radio buttons
    private ButtonGroup bg;
    
    /**
     * Constructor
     */
    
    public BagelPanel(){
        //rows and columns are created using GridLayout
        setLayout(new GridLayout(2,1));
        
        //RadioButton created
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat", true);
        
        //Group the radioButtons
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        
        //adding border around the panel
        setBorder(BorderFactory.createTitledBorder("Bagel"));
        
        //adding radio button in this panel
        add(whiteBagel);
        add(wheatBagel);
    }
    
    /**
     * adding getBagelCost method to return the cost of selected bagel
     */
    
    public double getBagelCost()
    {
        //adding one more variable to hold the cost of selected bagel
        double bagelCost = 0.0;
        
        //which bagel is selected
        if(whiteBagel.isSelected())
            bagelCost = WHITE_BAGEL;
        else
            bagelCost = WHEAT_BAGEL;
        
        //return the cost of selected bagel
        return bagelCost;
    }
    
    
}
