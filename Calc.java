import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
/**
 * This class creates a calculator.
 * 
 * Calculator.java
 * 
 * @author Chris Smith
 * @version 2.6.2014
 */
public class Calculator2
{
    private JFrame frame;
    private JPanel buttonPanel;
    private JButton calculateButton;
    private JButton clearButton;
    private JPanel resultPanel;
    private JLabel label;
    private JPanel textPanel;
    private JTextField infixExpression;
    private String resultLabel;
    /**
     * This constructor creates the calculator.
     */
    public Calculator2()
    {
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");        
        initialize();
        initialize2();
        frame.pack();
        frame.setVisible(true);



    }
    /**
     * This method initializes the buttons and panels.
     */
    public void initialize()
    {
        getFrame();
        resultLabel = "";
        buttonPanel = new JPanel();
        calculateButton = new JButton("Calculate");
        clearButton = new JButton("Clear");
        calculateButton.setName("calculateButton");
        clearButton.setName("clearButton");       
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        resultPanel = new JPanel();
        label = new JLabel("Result = " + resultLabel);
        label.setName("resultLabel");
        resultPanel.add(label);
        frame.add(resultPanel, BorderLayout.WEST);        
    }
    /**
     * Initializes the second half of the calculator.
     */
    public void initialize2()
    {
        final int TEXTSIZE = 15;
        textPanel = new JPanel();
        e1 = new JTextField(TEXTSIZE);
        e1.setName("e1");
        textPanel.add(e1);
        frame.add(textPanel, BorderLayout.NORTH);
        calculateButton.addActionListener(new InnerClass());
        clearButton.addActionListener(new InnerClass());

    }
    /**
     * InnerClass.java
     * This class runs the inner class.
     * @author Chris Smith
     *
     */
    public class InnerClass implements ActionListener
    {

        /**
         * This method runs the functions of the buttons.
         * @param e is the event that runs.
         */
        public void actionPerformed(ActionEvent e)
        {

            if (e.getSource().equals(calculateButton))
            {
                try
                {
                    ExpressionEvaluator eval = new ExpressionEvaluator();
                    String post = eval.toPostfix(infixExpression.getText());
                    resultLabel = "" + eval.evaluate(post);
                    label.setText("Result = " + resultLabel);

                }
                catch (Exception n)
                {
                    label.setText("ERROR");
                }


            }
            if (e.getSource().equals(clearButton))
            {
                
                infixExpression.setText("");
                resultLabel = "";
                label.setText("Result = " + resultLabel);
            }


        }

    }
    /**
     * This method gets the frame for the calculator.
     * @return returns the frame
     */
    public JFrame getFrame()
    {
        return frame;
    }
    /**
     * This is the main method that runs the arguments.
     * @param args runs the arguments.
     */
    public static void main(String args[])
    {
        Calculator2 calc = new Calculator2();
    }
}
