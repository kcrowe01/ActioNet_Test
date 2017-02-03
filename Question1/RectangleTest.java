import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {
	@Test
	public void recTests() {
		double height = 4.2;
		double width = 9.7;
		Shape rectangle = new Rectangle(height, width);
		double perimeter = rectangle.getPerimeter();
		double area = rectangle.getArea();
		assertEquals(perimeter, 2*height + 2*width, 1e-15);
		assertEquals(area, height * width, 1e-15);
	}
}