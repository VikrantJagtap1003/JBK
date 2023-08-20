


interface Shape{
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{
	private int radius;
	public Circle(int radius){
		this.radius=radius;
	}
	public void calculateArea(){
		double a=3.14*this.radius*this.radius;
		System.out.println("Area of Circle="+a);
	}
	public void calculatePerimeter(){
		System.out.println("Perimeter of circle="+(2*3.14*this.radius));
	}
}
class Rectangle implements Shape{
	private int length;
	private int breadth;
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	public void calculateArea(){
		System.out.println("Area of rectangle="+(this.length*this.breadth));
	}
	public void calculatePerimeter(){
		System.out.println("Perimeter of Rectangle="+(2*(this.length+this.breadth)));
	}
}

class Triangle implements Shape{
	private int sideA;
	private int sideB;
	private int sideC;
	public Triangle(int sideA,int sideB,int sideC){
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}

	public void setSideA(int val){
		this.sideA=val;
	}
	public int getSideA(){
		return this.sideA;
	
	}
	
	public void setSideB(int val)
	{
		this.sideB=val;
	
	}
	public int getSideB(){
		return this.sideB;
	}
	public void setSideC(int val){
		this.sideC=val;
	}
	public int getSideC(){
		return this.sideC;
	}
	public void calculatePerimeter(){
		int perimeter=this.sideA+this.sideB+this.sideC;
		System.out.println("perimeter of triangle="+perimeter);
	}
	public void calculateArea()
	{
		double s=(this.sideA+this.sideB+this.sideC)/2;
		double Area=Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
		System.out.println("Area of triangle="+Area);
	}

}


class Main{
	public static void main(String args[])
	{
		Circle c=new Circle(3);
		c.calculateArea();
		c.calculatePerimeter();

		Rectangle r=new Rectangle(3,4);
		r.calculateArea();
		r.calculatePerimeter();

		Triangle t=new Triangle(3,4,5);
		t.calculateArea();
		t.calculatePerimeter();
	}
}














