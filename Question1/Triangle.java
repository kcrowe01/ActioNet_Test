public class Triangle implements Shape{

	double a;
	double b;
	double c;
	double h;

	Triangle(double side1, double side2, double side3){
		assert side1 < (side2 + side3);
		assert side2 < (side1 + side3);
		assert side3 < (side1 + side2);
		assert side1 > 0;
		assert side2 > 0;
		assert side3 > 0;
		a = side1;
		b = side2;
		c = side3;
	}
	
	public double getArea(){
		//Heron's Formula A=sqrt(p*(p-a)*(p-b)*(p-c)) where p = half 
		//of the perimeter 
		double p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
	}

	public double getPerimeter(){
		return a + b + c;
	}

}