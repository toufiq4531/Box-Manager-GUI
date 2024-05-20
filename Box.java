public class Box{
	//instance variabls or members
	private int boxId = -1;
	private double length;
	private double width;
	private double height;
	
	public static int BoxCounter;
	public static int idSeq = 10;
	
	//Empty Constructor
	public Box(){BoxCounter++;} 
	
	//Parameterized Constructor
	public Box(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
		this.boxId = idSeq;
		idSeq+=10;
		BoxCounter++;
	}
	//Parameterized Constructor
	//public Box(int boxId,double length, double width, double height){
		//this(length,width,height);
		//this.boxId = boxId;
	//}
	
	
	
	
	//Setter Methos
	public void setLength(double v){length = v;}
	public void setWidth(double v){width = v;}
	public void setHeight(double v){height = v;}
	
	//Getter Methods
	public double getLength(){return length;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	public int getBoxID(){return boxId;}
	
	//instance method
	public void showBox(){
		System.out.println("------------------");
		System.out.println("Box ID : "+boxId);
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
		System.out.println("Height : "+height);
		System.out.println("------------------");
	}
	
	public double getArea(){
		return length*width;
	}
}

