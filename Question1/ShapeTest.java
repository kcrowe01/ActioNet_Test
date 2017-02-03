import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShapeTest {
	@Test
	public void evaluateExpression() {
		double radius = 2.8;
		Shape circle = new Circle(radius);
		double perimeter = circle.getPerimeter();
		double area = circle.getArea();
		assertEquals(perimeter, 2 * radius * Math.PI);
		assertEquals(area, Math.PI * Math.pow(radius, 2));
	}
}