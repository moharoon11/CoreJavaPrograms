package Projects_Excersise.Project2;

import java.util.Scanner;
abstract class Shapes {
	
    double area;
    
    
	abstract void input();
	abstract void compute();
	
	public void display() {
		System.out.println("The area is : " + area);
	}
	
	

}

class Rectangle extends Shapes{
	private double len;
	private double bre;
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length");
		len = in.nextDouble();
		System.out.println("Enter the breatg");
		bre = in.nextDouble();
		
	}
	
	protected void compute() {
		
		area = len * bre;
	}
	
}

class Square extends Shapes{
	private double len;
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length");
		len = in.nextDouble();
		
		
	}
	
	public void compute() {
		
		area = len * len;
	}
}

class Circle extends Shapes{
	private final double pi = 3.14;
	private double rad;
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length");
		rad = in.nextDouble();
		
		
	}
	
	public void compute() {
		
		area = pi * (rad * rad);
	}
	
}

class Geomentric {
	
	
	public void permit(Shapes shape) {
		shape.input();
		shape.compute();
		shape.display();
	}
	
}

class TestProject2{
	
	public static void main(String[] args) {
		Shapes r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		// Shapes rs = new Shapes(); --> cannot create an instance to abstract class
		Geomentric g = new Geomentric();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
	}
}


