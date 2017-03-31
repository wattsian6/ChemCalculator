
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;


/**
 * 
 * 
 * @author clonigerba
 * @version 3.31.16 
 *
 */
public class Calculator2
{
    private JComboBox dropDown;
	
    private JLabel eqLabel;
    private JLabel var1;
    private JLabel var2;
    private JLabel var3;
    private JLabel var4;
    private JLabel un1;
    private JLabel un2;
    private JLabel un3;    
    private JLabel un4;

    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;
    private JLabel resultLabel;
    private JButton calculateButton;
    private JButton clearButton;
    private JFrame calcFrame;
    private JPanel panel2;
    private JPanel panel1;
    private JPanel panel;
    private final int xSize = 280;
    private final int ySize = 130;

/**
 * calculator. 
 * 
 */
    public Calculator2()
    {
        calcFrame = new JFrame();
        calcFrame.setLocation(100, 100);
        calcFrame.setSize(xSize, ySize);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setTitle("My Calculator");
    
        
        helper();
	panel2 = new JPanel();
        helper2();
        calcFrame.pack();
        calcFrame.setVisible(true);
    }
/**
 * helper. 
 * 
 */
    public void helper()
    {
        String[] equations = {"Boyle's Law", "Percent Yield",
             "Temperature", "Ideal Gas Equation", "Potential Energy",
             "Molarity", "Electron Energy, nth State", "Photon Energy",
             "DeBroglie Relationship", " " , " " , " "};

		dropDown = new JComboBox(equations);
        JPanel panel = new JPanel();
	eqLabel = new JLabel("EQATION");
	eqLabel.setName("eqLabel");
	panel.add(eqLabel);
        resultLabel = new JLabel("Result = ");
        resultLabel.setName("resultLabel");
        panel.add(resultLabel);
        calcFrame.add(panel, BorderLayout.PAGE_START);
        
        panel1 = new JPanel();
        
        clearButton = new JButton("Clear");
        clearButton.setName("clearButton");
        
        calculateButton = new JButton("Calculate");
        calculateButton.setName("calculateButton");
        
		panel1.add(dropDown);
        panel1.add(clearButton);
        
        panel1.add(calculateButton);
        calcFrame.add(panel1, BorderLayout.PAGE_END);
        
        helper1();
    }

    /**
     * return. 
     * @return calcFrame 
     */
    public JFrame getFrame()
    {
        return calcFrame;
    }
/**
 * 
 * 
 * 
 */
    public void helper1()
    {
        clearButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                updateClear();
            }
        });
    
        calculateButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                
                if (1==1)
                {
                    field.setText("");
                    resultLabel.setText("Result = ");
                    
                    throw new NullPointerException("Error");
                }
                resultLabel.setText("Result");
            
            }
        }
    );
	    
	/**dropDown.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String currentQuantity = (String)dropDown.getSelectedItem();
		
		switch(currentQuantity)
		{
			case "Boyle's Law":
				
		}
            }
        });
    */
   
    }
 
    
    public void helper2()
    {
	panel2.removeAll(); 
	panel2.updateUI();
	    
	var1 = new JLabel();
        var1.setName("Var1");
        panel2.add(var1); 
	
        field1 = new JTextField();
        field1.setName("Variable1");
        field1.setColumns(10);
        panel2.add(field1); 
	    
	un1 = new JLabel();
        un1.setName("Un1");
        panel2.add(un1); 
	    
	    
	var2 = new JLabel();
        var2.setName("Var2");
        panel2.add(var2); 
	    
	field2 = new JTextField();
        field2.setName("Variable2");
        field2.setColumns(10);
        panel2.add(field2); 
	    
	un2 = new JLabel();
        un2.setName("Un2");
        panel2.add(un2); 
	    
	
	var3 = new JLabel();
        var3.setName("Var3");
        panel2.add(var3);     
	    
	field3 = new JTextField();
        field3.setName("Variable3");
        field3.setColumns(10);
        panel2.add(field3); 
	    
	un3 = new JLabel();
        un3.setName("Un3");
        panel2.add(un3);     
	    
	var4 = new JLabel();
        var4.setName("Var4");
        panel2.add(var4);    
	    
	field4 = new JTextField();
        field4.setName("Variable4");
        field4.setColumns(10);
        panel2.add(field4); 
	    
	un4 = new JLabel();
        un4.setName("Un4");
        panel2.add(un4);     
        
        calcFrame.add(panel2, BorderLayout.CENTER);
    }
	
	
    public void helper3Var()
    {
	panel2.removeAll(); 
	panel2.updateUI();
        
        field = new JTextField();
        field.setName("Equation");
        field.setColumns(10);
        panel2.add(field); 
        
        calcFrame.add(panel2, BorderLayout.PAGE_START);
    }
	
    public void helper4Var()
    {
        panel2.removeAll(); 
	panel2.updateUI();
	    
        field = new JTextField();
        field.setName("Equation");
        field.setColumns(10);
        panel2.add(field); 
        
        calcFrame.add(panel2, BorderLayout.PAGE_START);
    }
    
/**
 * 
 * 
 */
    public void updateClear()
    {
        field.setText("");
        
        resultLabel.setText("Result = ");
    }


   /**
    * main. 
    * @param args 
    */
    public static void main(String[] args)
    {
        Calculator2 calculator = new Calculator2();
    }
}
