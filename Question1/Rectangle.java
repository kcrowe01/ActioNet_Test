public class Rectangle implements Shape{

	double height;
	double width;

	Rectangle(double h, double w){
		height = h;
		width = w;
	}

	public double getArea(){
		return height * width;
	}

	public double getPerimeter(){
		return (2 * height) + (2 * width);
	}	
}