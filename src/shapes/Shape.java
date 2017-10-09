package shapes;

public abstract class Shape implements Comparable<Shape> {
	/*
	 * Implement compareTo such that shapes are compared by their areas. Follow
	 * the canonical expectations of compareTo interface. See Java API for
	 * expected behavior.
	 * 
	 * Also you need to finish implementing the Square and Circle classes.
	 */
	public int compareTo(Shape shape) {
		int ans = 0;
		if (this.calculateArea() == shape.calculateArea())
			ans = 0;
		if (this.calculateArea() > shape.calculateArea())
			ans = 1;
		if (this.calculateArea() < shape.calculateArea())
			ans = -1;
		return ans;
	}

	public abstract double calculateArea();
}
