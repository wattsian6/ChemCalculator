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
 * @author STEM group 3 (maybe)
 * @version 3.31.16
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
    private JPanel eqPanel;
    private JPanel eqPanel2;
    private JPanel panel2;
    private JPanel panel1;
    private JPanel panel;
    private JPanel input1;
    private JPanel input2;
    private JPanel inputN;
    private JPanel input3;
    private JPanel input4;
    private JPanel inputS;
    private final int xSize = 280;
    private final int ySize = 130;

    /**
     * The constructor for the GUI.
     */
    public Calculator2()
    {
        calcFrame = new JFrame();
        calcFrame.setLocation(100, 100);
        calcFrame.setSize(xSize, ySize);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setTitle("Chemistry Calculator");

        outerCreation();
        panel2 = new JPanel(new BorderLayout());
        bodyPanel();
        calcFrame.pack();
        calcFrame.setVisible(true);
    }

    /**
     * Constructs the panels for the buttons, dropdown, and labels.
     */
    public void outerCreation()
    {
        String[] equations = {"Boyle's Law", "Percent Yield",
             "Temperature", "Ideal Gas Equation", "Potential Energy",
             "Molarity", "Electron Energy, nth State", "Photon Energy",
             "DeBroglie Relationship"};

        dropDown = new JComboBox(equations);
        JPanel panel = new JPanel(new BorderLayout());
        eqPanel = new JPanel();
        eqPanel2 = new JPanel();
        eqLabel = new JLabel("P1*V1 = P2*V2");
        eqLabel.setName("eqLabel");
        eqPanel.add(eqLabel);

        resultLabel = new JLabel("Result will go here.");
        resultLabel.setName("resultLabel");
        eqPanel2.add(resultLabel);
        panel.add(eqPanel,BorderLayout.NORTH);
        panel.add(eqPanel2,BorderLayout.SOUTH);

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

        listeners();
    }

    /**
     * Get the frame of the GUI.
     */
    public JFrame getFrame()
    {
        return calcFrame;
    }

    /**
     * Adds all the action listeners to the buttons and dropdown.
     */
    public void listeners()
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
                    field1.setText("");
                    field2.setText("");
                    field3.setText("");
                    field4.setText("");
                    resultLabel.setText(eqLabel.getText());

                    throw new NullPointerException("Error");
                }
                resultLabel.setText("Result");

            }
        });

        dropDown.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String currentQuantity = (String)dropDown.getSelectedItem();

                switch(currentQuantity)
                {
                    case "Boyle's Law":
                        eqLabel.setText("P1*V1 = P2*V2");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(true);
                        field4.setVisible(true);
                        un4.setVisible(true);
                        break;
                    case "Percent Yield":
                        eqLabel.setText("% yield = actual / theoretical * 100%")                                                                                                                                                             ;
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(false);
                        field4.setVisible(false);
                        un4.setVisible(false);
                        break;
                    case "Temperature":
                        eqLabel.setText("K = C + 273.15 \n F = ((C * 9 / 5) + 32                                                                                                                                                             )");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(false);
                        field4.setVisible(false);
                        un4.setVisible(false);
                        break;
                    case "Ideal Gas Equation":
                        eqLabel.setText("P*V = n*R*T");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(true);
                        field4.setVisible(true);
                        un4.setVisible(true);
                        break;
                    case "Potential Energy":
                        eqLabel.setText("V = k * q1 * q2 / r");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(true);
                        field4.setVisible(true);
                        un4.setVisible(true);
                        break;
                    case "Molarity":
                        eqLabel.setText("Molarity = moles / solution");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(false);
                        field4.setVisible(false);
                        un4.setVisible(false);
                        break;
                    case "Electron Energy, nth State":
                        eqLabel.setText("E = -R * 1 / n^2");
                        var3.setVisible(false);
                        field3.setVisible(false);
                        un3.setVisible(false);
                        var4.setVisible(false);
                        field4.setVisible(false);
                        un4.setVisible(false);
                        break;
                    case "Photon Energy":
                        eqLabel.setText("E = R * (1/ni^2 - 1/nf^2)");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(false);
                        field4.setVisible(false);
                        un4.setVisible(false);
                        break;
                    case "DeBroglie Relationship":
                        eqLabel.setText("lambda = h / (m * v)");
                        var3.setVisible(true);
                        field3.setVisible(true);
                        un3.setVisible(true);
                        var4.setVisible(true);
                        field4.setVisible(true);
                        un4.setVisible(true);
                        break;
                    default:
                        break;

                }
            }
        });
    }

    /**
     * Constructs the panel that contains the body for user input.
     */
    public void bodyPanel()
    {
        panel2.removeAll();
        panel2.updateUI();

        input1 = new JPanel();
        input2 = new JPanel();
        inputN = new JPanel(new BorderLayout());
        input3 = new JPanel();
        input4 = new JPanel();
        inputS = new JPanel(new BorderLayout());


        var1 = new JLabel("a = ");
        var1.setName("Var1");
        input1.add(var1);

        field1 = new JTextField();
        field1.setName("Variable1");
        field1.setColumns(10);
        input1.add(field1);

        un1 = new JLabel("m");
        un1.setName("Un1");
        input1.add(un1);


        var2 = new JLabel("x = ");
        var2.setName("Var2");
        input2.add(var2);

        field2 = new JTextField();
        field2.setName("Variable2");
        field2.setColumns(10);
        input2.add(field2);

        un2 = new JLabel("m/s");
        un2.setName("Un2");
        input2.add(un2);


        var3 = new JLabel("m = ");
        var3.setName("Var3");
        input3.add(var3);

        field3 = new JTextField();
        field3.setName("Variable3");
        field3.setColumns(10);
        input3.add(field3);

        un3 = new JLabel("J");
        un3.setName("Un3");
        input3.add(un3);

        var4 = new JLabel("b = ");
        var4.setName("Var4");
        input4.add(var4);

        field4 = new JTextField();
        field4.setName("Variable4");
        field4.setColumns(10);
        input4.add(field4);

        un4 = new JLabel("N    ");
        un4.setName("Un4");
        input4.add(un4);

        inputN.add(input1, BorderLayout.WEST);
        inputN.add(input2, BorderLayout.EAST);
        inputS.add(input3, BorderLayout.WEST);
        inputS.add(input4, BorderLayout.EAST);

        panel2.add(inputN, BorderLayout.NORTH);
        panel2.add(inputS, BorderLayout.SOUTH);

        calcFrame.add(panel2, BorderLayout.CENTER);
    }


    /**
     *  Clears the text fields.
     *
     */
    public void updateClear()
    {
        field1.setText("");
        field2.setText("");
        field3.setText("");
        field4.setText("");
    }


   /**
    * The main to show the calculator.
    */
    public static void main(String[] args)
    {
        Calculator2 calculator = new Calculator2();
    }
}
