import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class BoxManagerFrame extends JFrame implements ActionListener{
	Font font = new Font("cambria", Font.BOLD, 18);
	JPanel panel;
	
	JLabel label;	
	
	JTextField TLength,TWidth,THeight;
	JButton submit;
	
	DefaultTableModel model;
	JTable table;
	BoxList boxList;
	
	public BoxManagerFrame(BoxList boxList){
		super("My BOX Manager");
		this.boxList = boxList;
		
		initializeFrame();	
		
		createTable();
		
		
		//Display the window after all initialization
		this.setVisible(true);
	}
	
	public void initializeFrame(){
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,50);
		this.setLayout(null);
		
		//Creating a Panel Container
		panel = new JPanel();
		panel.setBounds(0,0,600,600);
		//panel.setBackground( new Color(174,247,255));
		//panel.setBackground( new Color(120,253,132));
		panel.setOpaque(false);
		panel.setLayout(null);
		this.add(panel);
		
		//BackGround Example
		ImageIcon image = new ImageIcon("bg.jpg");
		JLabel background = new JLabel();
		background.setBounds(0,0,600,600);
		background.setIcon(image);
		this.add(background);
		
		//Crating a Labels
		label = new JLabel("Manage Your Box");
		label.setBounds(20,10,360,30);
		label.setFont(font);
		
		JLabel lengthLable = new JLabel("Length");
		lengthLable.setFont(font);
		lengthLable.setBounds(20,50,100,40);

		JLabel widthLable = new JLabel("Width");
		widthLable.setFont(font);
		widthLable.setBounds(140,50,100,40);

		JLabel heightLable = new JLabel("Height");
		heightLable.setFont(font);
		heightLable.setBounds(260,50,100,40);
		
		//TextFields
		TLength = new JTextField("0.0");
		TLength.setFont(font);
		TLength.setBounds(20,100,100,40);

		TWidth = new JTextField("0.0");
		TWidth.setFont(font);
		TWidth.setBounds(140,100,100,40);

		THeight = new JTextField("0.0");
		THeight.setFont(font);
		THeight.setBounds(260,100,100,40);
		
		//Creating Buttons
		submit = new JButton("Add Box");
		submit.setFont(font);
		submit.setBounds(420,100,150,40);
		submit.addActionListener(this);
		
		//adding components to Panel
		panel.add(label);
		panel.add(lengthLable);
		panel.add(widthLable);
		panel.add(heightLable);
		panel.add(TLength);
		panel.add(TWidth);
		panel.add(THeight);
		panel.add(submit);
		
	}
	
	public void createTable(){
		//Create Model For Table
		model = new DefaultTableModel();
		model.addColumn("Box ID");
		model.addColumn("Box Length");
		model.addColumn("Box Width");
		model.addColumn("Box height");
		
		//Create Table with model
		table = new JTable(model);
		table.setFont(font);
		table.setBackground(new Color(174,247,255));
		table.setBounds(0, 0, 400, 400);
		table.setRowHeight(30);
		table.setSelectionBackground(new Color(255, 153, 51));
		table.getTableHeader().setFont(font);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 150, 400, 400);
		
		//copy data from box list to Model
		Box boxes[];
		boxes = boxList.getAllBox();
		
		for(int i=0;i<boxes.length;i++){
			if(boxes[i]!=null){
				model.addRow(new Object[]{
					boxes[i].getBoxID(),
					boxes[i].getLength(),
					boxes[i].getWidth(),
					boxes[i].getHeight()
				});
			}
		}
		
		//add the scrollPane to panel
		panel.add(scrollPane);
	}
	
	public void actionPerformed(ActionEvent e){
		if(submit == e.getSource()){
			double length = Double.parseDouble(TLength.getText());
			double width = Double.parseDouble(TWidth.getText());
			double height = Double.parseDouble(THeight.getText());
			
			Box b = new Box(length,width,height);
			boxList.insertBox(b);
			
			model.addRow(new Object[]{
					b.getBoxID(),
					b.getLength(),
					b.getWidth(),
					b.getHeight()
			});
		}
			
	}
	
}