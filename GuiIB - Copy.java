import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
public class GuiIB extends JFrame {
private JPanel contentPane;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GuiIB frame = new GuiIB();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
int x =0; 
/**
* Create the frame.
*/
public GuiIB() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(500, 500, 575, 523);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblNewLabel = new JLabel("Welcome to the Online Calulator");
lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
lblNewLabel.setBounds(51, 33, 455, 57);
contentPane.add(lblNewLabel);
JButton btnNewButton_1 = new JButton("Gas Calulator ");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	GasGui sf = new GasGui(); 
	sf.show(); // show intro gui
	dispose(); // closes main frame
}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton_1.setBounds(175, 176, 158, 57);
contentPane.add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("Split Bill Calculator ");
btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
SplitGui sf = new SplitGui(); 
sf.show(); // show intro gui
dispose(); // closes main frame
}
});
btnNewButton_2.setBounds(175, 299, 158, 57);
contentPane.add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("Tip Calculator");
btnNewButton_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
TipGui sf = new TipGui(); 
sf.show(); // show intro gui
dispose(); // closes main frame
}
});
btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton_3.setBounds(175, 243, 158, 46);
contentPane.add(btnNewButton_3);
JButton btnNewButton_4 = new JButton("End Screen");
btnNewButton_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
EndGui sf = new EndGui(); 
sf.show(); // show intro gui
dispose(); // closes main frame
}
});
btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton_4.setBounds(175, 366, 158, 51);
contentPane.add(btnNewButton_4);
JButton btnNewButton = new JButton("Intro");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Introgui sf = new Introgui(); 
sf.show(); // show intro gui
dispose(); // closes main frame 
}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
btnNewButton.setBounds(175, 124, 158, 42);
contentPane.add(btnNewButton);
JButton btnNewButton_5 = new JButton("Exit");
btnNewButton_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
dispose();
}
});
btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton_5.setBounds(185, 428, 138, 33);
contentPane.add(btnNewButton_5);
}
}
