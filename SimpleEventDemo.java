package passage;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class SimpleEventDemo extends JFrame{
	public SimpleEventDemo(){
		JButton jbtOk = new JButton("Ok");
		setLayout(new FlowLayout());
		add(jbtOk);
		ActionListener listener = new OKListener();
		jbtOk.addActionListener(listener);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new SimpleEventDemo();
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
class OKListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("It is ok");
	}
}
}
