package Activity3;

import java.util.Scanner;

abstract class Shape{
	private int value;
	abstract float calculateArea(int value);
	

	public int getValue() {
		return value;
	}


	

	public void setValue(int value) {
		this.value = value;
	}
	
}




class Circle extends Shape{

	@Override
	float calculateArea(int value) {
		
		// TODO Auto-generated method stub
		
		float pi=3.14f;
		float val = value;
		return pi*val*val;
				
		
		}
}	
class Square extends Shape{

	@Override
	float calculateArea(int value) {
		// TODO Auto-generated method stub
		
		float val = value;
		return val * val;
		
	}
	
}
	

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Circle \n2.Square \nEnter the Shape");
		String shapeName=sc.next();
		int value;
		if(shapeName.equals("Circle")) {
			System.out.println("Enter the radius");
			value=sc.nextInt();
			Circle c =new Circle();
			c.setValue(value);
			System.out.printf("Area of circle: %.2f",c.calculateArea(c.getValue()));
		}
		else if(shapeName.equals("Square")) {
			System.out.println("Enter the side");
			value=sc.nextInt();
			Square s =new Square();
			s.setValue(value);
			System.out.printf("Area of circle: %.2f",s.calculateArea(s.getValue()));
		}
		sc.close();
		

	}

}
