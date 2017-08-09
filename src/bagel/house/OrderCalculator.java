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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

//GUI created for the bagel house using orderCalculator class
public class OrderCalculator extends JFrame
{
    private BagelHouse banner; //display the greeting
    private BagelPanel bagels; //bagel option panel
    private ToppingPanel toppings; //topping panel
    private CoffeePanel coffee; //coffee panel
    
    private JPanel buttonPanel; //hold the buttons
    private JButton calcButton; //calculate the cost
    private JButton exitButton; // quit the application
    
    private final double TAX_RATE = 0.06;
    
    /**
     * constructor
     */
    
    public OrderCalculator()
    {
        //title
        super("Order Calculator");
        
        //action for the clost button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //borderLauoyt Manager
        setLayout (new BorderLayout());
        
        //custom Panels
        banner = new BagelHouse();
        bagels = new BagelPanel();
        toppings = new ToppingPanel();
        coffee = new CoffeePanel();
        
        //buttonPanel
        buildButtonPanel();
        
        //add components to the content pane
        add(banner, BorderLayout.NORTH);
        add(bagels, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(coffee, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        
        //pack the contents of the window and display it
        pack();
        setVisible(true);
        
    }
    
    /**
     * buildButtonPanel methods to build the button panel
     */
    
    private void buildButtonPanel()
    {
        //create panel for the buttons
        buttonPanel = new JPanel();
        
        //create the button
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");
        
        //action listeners
        calcButton.addActionListener (new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
        
        //add button to the button panel
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }
    
    /**
     * private inner class to handle the event on click the button
     */
    
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //variable for holding total cost, tax and subtotal cost
            double subtotal, tax, total;
            
            //subtotal
            subtotal = bagels.getBagelCost() +
                       toppings.getToppingCost() +
                       coffee.getCoffeeCost();
            
            //sales tax
            tax = subtotal * TAX_RATE;
            
            //total cost
            total = subtotal + tax;
            
            //decimal format
            DecimalFormat dollar = new DecimalFormat ("0.00");
            
            //showing charges
            JOptionPane.showMessageDialog(null,"Subtotal: $" + dollar.format(subtotal) + 
                                            "\n" + "Tax: $" + dollar.format(tax) + "\n" 
                                            + "Total: $" + dollar.format(total));
        }
    }
    
    /**
     * Private inner class that handles the event on clicking the button
     */
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    /**
     * main method
     */
    public static void main(String[] args)
    {
        new OrderCalculator();
    }
}

