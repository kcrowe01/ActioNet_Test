import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
	@Test
	public void circTests() {
		double radius = 2.8;
		Shape circle = new Circle(radius);
		double perimeter = circle.getPerimeter();
		double area = circle.getArea();
		assertEquals(perimeter, 2 * radius * Math.PI, 1e-15);
		assertEquals(area, Math.PI * Math.pow(radius, 2), 1e-15);
	}
}