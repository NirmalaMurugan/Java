package learnJavaConcepts;

public class LearnThisKeyword {
	
	int x, y;
	
//	 LearnThisKeyword(int x, int y) {
////		x=x; // will return 0, because java confused which is local and class variable so sets default value of x as 0
////		y=y;
//		
//		this.x=x; //this. x is the class variable , x is the local variable/ local parameter assign (x=100)  
//		this.y=y; //will return 200 
//	}
	void setData(int a, int b) {
		x=a;
		y=b;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
	//	LearnThisKeyword th = new LearnThisKeyword(100,200); //by default passes data to constructor.
		LearnThisKeyword th = new LearnThisKeyword(); //dont pass value here, use object to call method and send data.
		th.setData(100, 200);
		th.display();
	}

}
