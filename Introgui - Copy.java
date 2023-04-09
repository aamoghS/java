import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Introgui extends JFrame {
private JPanel contentPane;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Introgui frame = new Introgui();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the frame.
*/
public Introgui() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(200, 300, 550, 500);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);
JLabel lblNewLabel = new JLabel("Introduction ");
lblNewLabel.setFont(new Font("Lucida Console", Font.PLAIN, 14));
lblNewLabel.setBounds(162, 33, 241, 13);
contentPane.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("Welcome to the Online Calculator ");
lblNewLabel_1.setBounds(10, 61, 416, 24);
contentPane.add(lblNewLabel_1);
JLabel lblNewLabel_2 = new JLabel("In the Online Calculator you can access:");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_2.setBounds(10, 97, 258, 13);
contentPane.add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("Gas Calculator: Tells you how much money you would spend and could save with membership");
lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
lblNewLabel_3.setBounds(10, 150, 516, 13);
contentPane.add(lblNewLabel_3);
JLabel lblNewLabel_4 = new JLabel("Split Bill Calcuator: Tells you how much you would need to split the bill among a certain ammount of people");
lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
lblNewLabel_4.setBounds(10, 200, 516, 13);
contentPane.add(lblNewLabel_4);
JLabel lblNewLabel_5 = new JLabel("Tip Calcuator: Tells you how much money you are giving with a tip from the ammount of money you spend. ");
lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
lblNewLabel_5.setBounds(10, 251, 526, 13);
contentPane.add(lblNewLabel_5);
JButton btnNewButton = new JButton("Back to menu\r\n");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
GuiIB sa = new GuiIB(); 
sa.show(); // show intro gui
dispose(); // closes main frame 
}
});
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton.setBounds(149, 336, 181, 58);
contentPane.add(btnNewButton);
}
}
