public class BoxList{
	private Box boxes[];
	
	public BoxList(){
		boxes = new Box[5];
	}
	public BoxList(int size){
		boxes = new Box[size];
	}
	
	//show all the boxes
	void showAllBoxes(){
		for(int i=0;i<boxes.length;i++){
			//looking for cell containing box
			if(boxes[i] != null){
				boxes[i].showBox();
			}
		}
	}
	
	//Insert Box into Boxes array
	void insertBox(Box b){
		boolean flag = false; //the work is not complete yet
		//how would I know which cell is empty??
		//let us check from start to end of the array
		for(int i=0;i<boxes.length;i++){
			//looking for empty cell
			if(boxes[i] == null){
				boxes[i] = b;
				flag = true;
				break; //break loop after assigning the box
			}
		}
		//How will you decide that the box was stored
		//Successfully???
		if(flag){
			System.out.println("Box Inserted Successfully");
		}
		else{
			System.out.println("Not Enough Space to Store the Box");			
		}
	}
	
	double getTotalAreaOfAllBoxes(){
		double totalArea = 0;
		for(int i=0;i<boxes.length;i++){
			//looking for cell containing box
			if(boxes[i] != null){
				totalArea += boxes[i].getArea();
			}
		}
	return totalArea;
	}
	
	void removeBoxById(int id){
		boolean flag = false; //the work is not complete yet
		//how would I know which cell is fill with box??
		//let us check from start to end of the array
		for(int i=0;i<boxes.length;i++){
			//looking for cells filled with box
			if(boxes[i] != null){
				if(boxes[i].getBoxID() == id){
					boxes[i] = null;
					flag = true;
					break; //break loop after assigning the box
				}
			}
		}
		if(flag){
			System.out.println("Box Deleted Successfully");
		}
		else{
			System.out.println("Box is not Found");			
		}
	}
	
	public Box[] getAllBox(){return boxes;}
}