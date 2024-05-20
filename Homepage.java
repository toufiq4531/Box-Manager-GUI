import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame implements ActionListener
{	
	JButton btnBoxManager;
	BoxList boxList;
	 Font font = new Font("cambria", Font.PLAIN, 20);
	public Homepage(BoxList boxList){
		super("Homepage");
		this.boxList = boxList;
        this.setSize(400, 300);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnBoxManager = new JButton("Box Manager");
        btnBoxManager.setBounds(100, 20, 200, 35);
        btnBoxManager.setFont(font);
        btnBoxManager.addActionListener(this);
        this.add(btnBoxManager);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
        if(btnBoxManager == e.getSource()){
			BoxManagerFrame bmf = new BoxManagerFrame(boxList);
		}
    }
}