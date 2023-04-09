import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
public class EndGui extends JFrame {
private JPanel contentPane;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
EndGui frame = new EndGui();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
AdderMethods adder = new AdderMethods();
ArrayList<String> list = adder.getList();
/**
 *
* Create the frame.
*/
public EndGui() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(800, 500, 575, 523);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblNewLabel = new JLabel("End Screen");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
lblNewLabel.setBounds(179, 26, 203, 55);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("Check to see your total");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblNewLabel_1.setBounds(116, 109, 277, 55);
contentPane.add(lblNewLabel_1);
JButton btnNewButton = new JButton("Check");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.out.print("Thank you for using this");
System.out.println(adder.getList());
        // Printing out each string in the list
String Stra1 = ""; 
        for ( String Olda : list) { 
        	Stra1 = Stra1 + "\n" + Olda;
	}
        JOptionPane.showMessageDialog(null,"In the Gas Calculator you had a membership of shell which made you get 24.15 dollars"+ "\n"+ "You gave 67.05 dollars in the tip calcualtor" + "\n"+ "You split among 5 people and had 18.24 among each","",JOptionPane.INFORMATION_MESSAGE);
	}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
btnNewButton.setBounds(110, 161, 232, 62);
contentPane.add(btnNewButton);
JButton btnNewButton_2_2 = new JButton("Back to menu");
btnNewButton_2_2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		GuiIB sb = new GuiIB(); 
		sb.show(); // show intro gui
		dispose();
	}
});
btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_2_2.setBounds(151, 389, 179, 55);
contentPane.add(btnNewButton_2_2);
}
}
