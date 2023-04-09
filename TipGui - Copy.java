import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class TipGui extends JFrame {
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
TipGui frame = new TipGui();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
double moneyin =0; 
double tipin =0; 
String state = "";
DecimalFormat df = new DecimalFormat("#.##"); 
double taxval = 0; 
double inval = 0; 
AdderMethods adder = new AdderMethods();
ArrayList<String> inputStrings = new ArrayList<>();
String tipstate[][] = { {"Flordia", "Georgia"}, {"0.06", "0.04"}};
/**
* Create the frame.
*/
public TipGui() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(800, 800, 875, 523);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblTiCalculator = new JLabel("Tip Calculator \r\n");
lblTiCalculator.setFont(new Font("Sylfaen", Font.BOLD, 19));
lblTiCalculator.setBounds(345, 10, 179, 55);
contentPane.add(lblTiCalculator);
JLabel lblNewLabel = new JLabel("How much money did you give?");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel.setBounds(44, 90, 226, 22);
contentPane.add(lblNewLabel);
textField = new JTextField();
textField.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try 
		{
			moneyin = Double.parseDouble(textField.getText());
		}
		catch (Exception e1)
		{
			JOptionPane.showMessageDialog(null, "You canot enter a value with a $ ","ERROR!",JOptionPane.INFORMATION_MESSAGE);
		}
		if (moneyin > 500)
		{
		JOptionPane.showMessageDialog(null, "You entered a value higher than 500, please redo","ERROR!",JOptionPane.INFORMATION_MESSAGE);
		}
	}
});
textField.setBounds(54, 126, 96, 22);
contentPane.add(textField);
textField.setColumns(10);
JLabel lblNewLabel_1 = new JLabel("How much would you like to tip?");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_1.setBounds(44, 192, 226, 37);
contentPane.add(lblNewLabel_1);
JRadioButton per2 = new JRadioButton("10%");
JRadioButton per1 = new JRadioButton("5%");
JRadioButton per3 = new JRadioButton("15%");
JRadioButton per4 = new JRadioButton("Other ");
per1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (per1.isSelected())
{
	tipin = 0.05; 
per2.setSelected(false);
per3.setSelected(false);
per4.setSelected(false);
}
}
});
per1.setFont(new Font("Tahoma", Font.PLAIN, 13));
per1.setBounds(44, 235, 208, 21);
contentPane.add(per1);
per2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (per2.isSelected())
{
	tipin = 0.1; 
per1.setSelected(false);
per3.setSelected(false);
per4.setSelected(false);
}
}
});
per2.setFont(new Font("Tahoma", Font.PLAIN, 13));
per2.setBounds(44, 258, 172, 28);
contentPane.add(per2);
per3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (per3.isSelected())
{
	tipin = 0.15; 
per2.setSelected(false);
per1.setSelected(false);
per4.setSelected(false);
}
}
});
per3.setFont(new Font("Tahoma", Font.PLAIN, 13));
per3.setBounds(44, 288, 103, 21);
contentPane.add(per3);
per4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (per4.isSelected())
{
per2.setSelected(false);
per3.setSelected(false);
per1.setSelected(false);
}
}
});
per4.setFont(new Font("Tahoma", Font.PLAIN, 13));
per4.setBounds(44, 309, 103, 21);
contentPane.add(per4);
JLabel lblNewLabel_2 = new JLabel("If you chose other, type how much else type N/A");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2.setBounds(50, 348, 293, 37);
contentPane.add(lblNewLabel_2);
textField_1 = new JTextField();
textField_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try 
		{
			tipin = Integer.parseInt(textField_1.getText());
		}
		catch (Exception e1)
		{
			JOptionPane.showMessageDialog(null, "You canot enter a value with a % ","ERROR!",JOptionPane.INFORMATION_MESSAGE);
		}
	}
});
textField_1.setBounds(54, 386, 96, 19);
contentPane.add(textField_1);
textField_1.setColumns(10);
JLabel lblNewLabel_3 = new JLabel("If you want to see how much money you are giving press the button");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_3.setBounds(280, 95, 408, 13);
JButton btnNewButton_1 = new JButton("Enter");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		inval = CalcMethod.moneygive(tipin,moneyin); 
		
	}
});
btnNewButton_1.setBounds(44, 433, 151, 43);
contentPane.add(btnNewButton_1);
contentPane.add(lblNewLabel_3);
JButton btnNewButton = new JButton("Check ammount");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Your ammount given was $"+ inval, "Ammount given",JOptionPane.INFORMATION_MESSAGE);
	}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
btnNewButton.setBounds(345, 126, 217, 37);
contentPane.add(btnNewButton);
JButton btnNewButton_2_1 = new JButton("Clear\r\n");
btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_1.setBounds(365, 409, 144, 55);
contentPane.add(btnNewButton_2_1);
JButton btnNewButton_2 = new JButton("Back to menu");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		GuiIB sb = new GuiIB(); 
		sb.show(); // show intro gui
		dispose();
	}
});
JLabel lblNewLabel_4 = new JLabel("Which state are you in?/ we currently have Florida and Georgia \r\n");
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_4.setBounds(385, 205, 353, 24);
contentPane.add(lblNewLabel_4);
JComboBox comboBox = new JComboBox();
comboBox.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int combocheck = comboBox.getSelectedIndex();
		if (combocheck == 1)
		{
			state = tipstate[0][0];
			taxval =Double.parseDouble(tipstate[1][0]); 
		}
		else
		{
			taxval = Double.parseDouble(tipstate[1][1]); 
			state = tipstate[0][1];
			
		}
	}
});
comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Flordia ", "Georgia "}));
comboBox.setBounds(395, 236, 167, 21);
contentPane.add(comboBox);
JLabel lblNewLabel_5 = new JLabel("Sales Tax");
lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_5.setBounds(385, 186, 174, 22);
contentPane.add(lblNewLabel_5);
btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2.setBounds(519, 409, 179, 55);
contentPane.add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("Enter to save\r\n");
btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_3.setBounds(708, 409, 143, 55);
contentPane.add(btnNewButton_3);
JButton btnNewButton_4 = new JButton("Check to see new value");
btnNewButton_4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		inval = (inval * taxval) + inval; 
		String formatted = df.format(inval); 
		inval = Double.parseDouble(formatted);
		JOptionPane.showMessageDialog(null,"Your new ammount is $"+ inval, "Ammount new",JOptionPane.INFORMATION_MESSAGE);
	}
});
btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
btnNewButton_4.setBounds(408, 310, 167, 37);
contentPane.add(btnNewButton_4);
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		adder.addString("In the tip calcualtor your tip value was " + tipin + " " + inval); 
		adder.addToNumber(inval); 
	}
});

}
}
