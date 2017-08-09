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

//allow customer to select coffee

public class CoffeePanel extends JPanel{
    
    //constant to indicate the cost of coffee
    public final double NO_COFFEE = 0.0;
    public final double REGULAR_COFFEE = 1.25;
    public final double DECAF_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;
    
    //Radio buttons for the available coffees.
    private JRadioButton noCoffee;
    private JRadioButton regularCoffee;
    private JRadioButton decafCoffee;
    private JRadioButton cappuccino;
    
    //create a buttonGroup
    private ButtonGroup bg;
    
    /**
     * constructor
     */
    public CoffeePanel()
    {
        //add rows and columns with the help of gridLayout manager
        setLayout(new GridLayout(4,1));
        
        //create radio buttons
        noCoffee = new JRadioButton ("None");
        regularCoffee = new JRadioButton ("Regular Coffee");
        decafCoffee = new JRadioButton("Decaf Coffee");
        cappuccino = new JRadioButton ("Cappuccino");
        
        //group the all radio buttons
        bg = new ButtonGroup();
        
        bg.add(noCoffee);
        bg.add(regularCoffee);
        bg.add(decafCoffee);
        bg.add(cappuccino);
    }
    
    /**
     * getCoffeeCost method will return the cost of coffee
     */
    
    public double getCoffeeCost()
    {
        //add one more variable to hold the cost of selected coffee
        double coffeeCost = 0.0;
        
        //coffee selection option
        if (noCoffee.isSelected())
            coffeeCost = NO_COFFEE;
        else if (regularCoffee.isSelected())
            coffeeCost = REGULAR_COFFEE;
        else if (decafCoffee.isSelected())
            coffeeCost = DECAF_COFFEE;
        else if (cappuccino.isSelected())
            coffeeCost = CAPPUCCINO;
        
        return coffeeCost;
    }
}
