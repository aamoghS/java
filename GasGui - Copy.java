import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.*; 

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class GasGui extends JFrame {
private JPanel contentPane;
private final ButtonGroup buttonGroup = new ButtonGroup();
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GasGui frame = new GasGui();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
int value = 0; 
double gallons =0; 
double inval =0;
DecimalFormat df = new DecimalFormat("#.##"); 
private JTextField textField;
private JTextField textField_1;
int combocheck =0; 
String val1 = ""; 
/**
* Create the frame.
*/
AdderMethods adder = new AdderMethods();
public GasGui() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(800, 800, 875, 523);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblNewLabel = new JLabel("Gas Calculator \r\n");
lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 19));
lblNewLabel.setBounds(344, 10, 179, 55);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("What type of Gas did you buy?");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_1.setBounds(10, 60, 233, 55);
contentPane.add(lblNewLabel_1);
JRadioButton GassButton2 = new JRadioButton("Special-89/ $3.60\r\n");
JRadioButton Gassbutton1 = new JRadioButton("Regular-87/ $3.40");
JRadioButton GassButton3= new JRadioButton("Premium-91/ $3.90\r\n");
Gassbutton1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (Gassbutton1.isSelected())
{
value = 1; 
GassButton2.setSelected(false);
GassButton3.setSelected(false);
}
}
});
Gassbutton1.setFont(new Font("Tahoma", Font.PLAIN, 15));
Gassbutton1.setBounds(6, 107, 192, 21);
contentPane.add(Gassbutton1);
GassButton2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (GassButton2.isSelected())
{
value = 2; 
Gassbutton1.setSelected(false);
GassButton3.setSelected(false);
}
}
});
GassButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
GassButton2.setBounds(6, 130, 159, 21);
contentPane.add(GassButton2);
GassButton3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (GassButton3.isSelected())
{
value = 3; 
GassButton2.setSelected(false);
GassButton3.setSelected(false);
}
}
});
GassButton3.setFont(new Font("Tahoma", Font.PLAIN, 15));
GassButton3.setBounds(6, 153, 155, 21);
contentPane.add(GassButton3);
JLabel lblNewLabel_2 = new JLabel("How many Gallons does your car need?");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_2.setBounds(10, 215, 272, 26);
contentPane.add(lblNewLabel_2);
textField = new JTextField();
textField.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
gallons = Integer.parseInt(textField.getText());
}
});
textField.setBounds(69, 251, 96, 19);
contentPane.add(textField);
textField.setColumns(10);
JButton btnNewButton = new JButton("Check\r\n & Enter");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
inval = CalcMethod.GasGalin(value, gallons);
JOptionPane.showMessageDialog(null, "This is your value" + "\n" + "$" + inval,"",JOptionPane.INFORMATION_MESSAGE);
}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnNewButton.setBounds(42, 341, 138, 21);
contentPane.add(btnNewButton);
JLabel lblNewLabel_3 = new JLabel("Check how much you are paying ");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_3.setBounds(10, 298, 233, 33);
contentPane.add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("Do you have a Membership?");
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_4.setBounds(376, 83, 192, 32);
contentPane.add(lblNewLabel_4);
JComboBox comboBox = new JComboBox();
comboBox.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
val1 = (String)comboBox.getSelectedItem();
textField_1.setText(val1);
combocheck = comboBox.getSelectedIndex();
if(combocheck == 1)
{
inval = inval - (gallons * .10); 
String formatted = df.format(inval); 
inval = Double.parseDouble(formatted);
}
else if (combocheck == 2)
{
inval = inval - 10; 
String formatted = df.format(inval); 
inval = Double.parseDouble(formatted);
}
else if (combocheck ==3)
{
inval = inval - (gallons * .15);
String formatted = df.format(inval); 
inval = Double.parseDouble(formatted);
}
}
}); 
comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Gate- save 10 cents per gallon", "Bp - save 10 dollars on total price ", "Shell- save 15 cents per gallon", "None"}));
comboBox.setBounds(376, 109, 192, 21);
contentPane.add(comboBox);
textField_1 = new JTextField();
textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
textField_1.setBounds(376, 196, 223, 19);
contentPane.add(textField_1);
textField_1.setColumns(10);
JLabel lblNewLabel_5 = new JLabel("Membership Selected");
lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_5.setBounds(376, 144, 179, 42);
contentPane.add(lblNewLabel_5);
JLabel lblNewLabel_6 = new JLabel("Check to see how much you saved with a membership\r\n");
lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_6.setBounds(319, 238, 373, 42);
contentPane.add(lblNewLabel_6);
JButton btnNewButton_1 = new JButton("Check & Enter ");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null, "This is your new value with " + val1 + "\n" + "$" + inval,"",JOptionPane.INFORMATION_MESSAGE);
}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
btnNewButton_1.setBounds(412, 290, 149, 26);
contentPane.add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("Back to menu");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
GuiIB sb = new GuiIB(); 
sb.show(); // show intro gui
dispose(); // closes main frame
}
});
btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2.setBounds(426, 421, 233, 55);
contentPane.add(btnNewButton_2);
JButton btnNewButton_2_1 = new JButton("Clear\r\n");
btnNewButton_2_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
val1 =""; 
inval =0;
Gassbutton1.setSelected(false);
GassButton2.setSelected(false);
GassButton3.setSelected(false);
textField_1.setText(""); 
comboBox.setSelectedIndex(0);
textField.setText("");
}
});
btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_1.setBounds(192, 421, 233, 55);
contentPane.add(btnNewButton_2_1);
JButton btnNewButton_2_1_1 = new JButton("Enter to save \r\n");
btnNewButton_2_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if (combocheck > 0)
		{
			adder.setNumber(inval); 
			String a = "In the Gas Calcualtor you had a membership of " + val1 + " and your price came out as" + inval; 
			adder.addString(a);
		}
		else 
		{
			adder.setNumber(inval);
			adder.addString("In the Gas Calcualtor your price came out as" + inval);
		}
	}
});
btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_1_1.setBounds(658, 421, 179, 55);
contentPane.add(btnNewButton_2_1_1);
}
}
