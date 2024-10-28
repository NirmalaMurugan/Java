package keyword;


public class Dog extends Animal{
	String color = "Black";
	
	void display() {
		System.out.println(color); // to disp dog color
		System.out.println(super.color); // to display color of animal  with dog object without changing the dog color.
	}
}
