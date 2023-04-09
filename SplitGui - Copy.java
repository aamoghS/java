import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
public class SplitGui extends JFrame {
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SplitGui frame = new SplitGui();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
AdderMethods adder = new AdderMethods();
double invalnew =0; 
double moneyin =0; 
int people =0; 
DecimalFormat df = new DecimalFormat("#.##"); 
/**
* Create the frame.
*/
public SplitGui() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(800, 800, 875, 523);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblSplitBillCalculator = new JLabel("Split Bill Calculator \r\n");
lblSplitBillCalculator.setBounds(336, 10, 179, 55);
lblSplitBillCalculator.setFont(new Font("Sylfaen", Font.BOLD, 19));
contentPane.add(lblSplitBillCalculator);
JLabel lblNewLabel = new JLabel("If you want to use money from previous Calculators press the button");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel.setBounds(10, 53, 465, 55);
contentPane.add(lblNewLabel);
textField = new JTextField();
textField.setBounds(92, 161, 141, 47);
contentPane.add(textField);
textField.setColumns(10);
JButton btnNewButton = new JButton("Total Money");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		invalnew = adder.getNumber();
		invalnew = 91.2;
		String strNumber = Double.toString(invalnew);
		textField.setText((strNumber));
		
	}
});
btnNewButton.setBounds(73, 98, 185, 21);
contentPane.add(btnNewButton);
JLabel lblNewLabel_1 = new JLabel("Total Balance ");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_1.setBounds(111, 138, 147, 13);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("If you did not use the other Calculators, Enter your value here ");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2.setBounds(10, 208, 417, 55);
contentPane.add(lblNewLabel_2);
textField_1 = new JTextField();
textField_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try 
		{
			invalnew = Double.parseDouble(textField.getText());
		}
		catch (Exception e1)
		{
			JOptionPane.showMessageDialog(null, "You canot enter a value with a $ ","ERROR!",JOptionPane.INFORMATION_MESSAGE);
		}
	}
});
textField_1.setBounds(77, 260, 168, 37);
contentPane.add(textField_1);
textField_1.setColumns(10);
JLabel lblNewLabel_3 = new JLabel("How many people do you want to split upon\r\n");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_3.setBounds(10, 307, 304, 21);
contentPane.add(lblNewLabel_3);
textField_2 = new JTextField();
textField_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		people = Integer.parseInt(textField_2.getText());
	}
});
textField_2.setBounds(58, 338, 160, 37);
contentPane.add(textField_2);
textField_2.setColumns(10);
JButton btnNewButton_2 = new JButton("Enter ");
btnNewButton_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		invalnew = invalnew /people; 
		String formatted = df.format(invalnew); 
		invalnew = Double.parseDouble(formatted);
		
	}
});
btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
btnNewButton_2.setBounds(58, 411, 147, 44);
contentPane.add(btnNewButton_2);
JButton btnNewButton_1 = new JButton("Check Price \r\n");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Your value is " + invalnew,"Value",JOptionPane.INFORMATION_MESSAGE);
	}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_1.setBounds(570, 98, 168, 55);
contentPane.add(btnNewButton_1);
JLabel lblNewLabel_4 = new JLabel("Check your price ");
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel_4.setBounds(596, 74, 132, 13);
contentPane.add(lblNewLabel_4);
JButton btnNewButton_2_1 = new JButton("Clear\r\n");
btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_1.setBounds(371, 400, 144, 55);
contentPane.add(btnNewButton_2_1);
JButton btnNewButton_2_2 = new JButton("Back to menu");
btnNewButton_2_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		GuiIB sb = new GuiIB(); 
		sb.show(); // show intro gui
		dispose();
	}
});
btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_2.setBounds(519, 400, 179, 55);
contentPane.add(btnNewButton_2_2);
JButton btnNewButton_3 = new JButton("Enter to save\r\n");
btnNewButton_3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
	}
});
btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_3.setBounds(708, 400, 143, 55);
contentPane.add(btnNewButton_3);
}
}
