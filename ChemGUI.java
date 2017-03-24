
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
    private JTextField field;
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
        resultLabel = new JLabel("Result = ");
        resultLabel.setName("resultLabel");
        panel.add(resultLabel);
        calcFrame.add(panel, BorderLayout.LINE_START);
        
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
   
    }
    /**
     * helper2. 
     * 
     */
    public void helper2()
    {
        JPanel panel2 = new JPanel();
        
        field = new JTextField();
        field.setName("infixExpression");
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
