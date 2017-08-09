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
//this class allows the customer to choose the toppings
public class ToppingPanel extends JPanel{
    //constant to identify the cost of toppings
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;
    
    //Check boxes for selecting the toppings.
    private JCheckBox creamCheese;
    private JCheckBox butter;
    private JCheckBox peachJelly;
    private JCheckBox blueberryJam;
    
    /**
     * Constructor
    */
    
    public ToppingPanel()
    {
        //rows and columns are made with gridLayout manager
        setLayout(new GridLayout(4,1));
        
        //create check boxes
        creamCheese = new JCheckBox ("Cream cheese");
        butter = new JCheckBox ("Butter");
        peachJelly = new JCheckBox ("Peach Jelly");
        blueberryJam = new JCheckBox ("Blueberry jam");
        
        //add border around the panel
        setBorder (BorderFactory.createTitledBorder("Toppings"));
        
        //add the check boxes
        add(creamCheese);
        add(butter);
        add(peachJelly);
        add(blueberryJam);
    }
    
    //getToppingCost method added to return the cost of the selected toppings
    
    public double getToppingCost()
    {
        //one more variable added to hold the cost of selected toppings.
        double toppingCost = 0.0;
        
        //identify the selected toppings
        if (creamCheese.isSelected())
            toppingCost += CREAM_CHEESE;
        if (butter.isSelected())
            toppingCost += BUTTER;
        if (peachJelly.isSelected())
            toppingCost += PEACH_JELLY;
        if (blueberryJam.isSelected())
            toppingCost += BLUEBERRY_JAM;
        
        return toppingCost;
    }
}
