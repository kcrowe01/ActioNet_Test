import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
	@Test
	public void triTests() {
		double a = 8.6;
		double b = 15.6;
		double c = 9.4;
		Shape triangle = new Triangle(a, b, c);
		double perimeter = triangle.getPerimeter();
		double area = triangle.getArea();
		assertEquals(perimeter, a + b + c, 1e-15);
		double p = (a + b + c)/2;
		double correctarea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		assertEquals(area, correctarea, 1e-15);
	}
}