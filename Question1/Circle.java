public class Circle implements Shape{

	double r;

	Circle(double radius){
		assert radius >= 0;
		r = radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(r, 2);
	}

	public double getPerimeter(){
		return 2 * Math.PI * r; 
	}
}