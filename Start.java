import java.util.Scanner;
public class Start{
	public static void main(String []args){
		BoxList boxList = new BoxList(100);
		
		boxList.insertBox(new Box(1,2,10));
		boxList.insertBox(new Box(2,4,8));
		boxList.insertBox(new Box(3,6,6));
		boxList.insertBox(new Box(4,8,4));
		boxList.insertBox(new Box(5,10,2));
		boxList.insertBox(new Box(5,10,2));
		boxList.insertBox(new Box(5,10,2));
		
		boxList.showAllBoxes();
		
		//BoxManagerFrame bmf = new BoxManagerFrame(boxList);
		
		
		//System.out.println("Total Area: "+boxList.getTotalAreaOfAllBoxes());
		
		Login login = new Login(boxList);
		
	}
}