/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagel.house;
import javax.swing.*;
/**
 *
 * @author jalpa
 */
/* Greeting Planel class */
public class BagelHouse extends JPanel{

  /**
   * Constructor
   */
    public BagelHouse()
    {
        //Create a greeting label
        JLabel greeting = new JLabel("Welcome to Bagel House");
        
        // adding label to this panel
        add(greeting);
    }
    
}
