package studio7;

public class Rectangle {

	private double length;
	private double width;
	private boolean isSquare;
	private double area;
	private double perimeter;
	/** Construct a rectangle 
	 *  rectangle have length, width provided and isSquare, area, and perimeter automatically generated 
	 * @param l the length
	 * @param w the width
	 */
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
		perimeter = l * 2 + w * 2;
		area = l * w;
		isSquare = (l == w);
		
	}
	
	public String toString() {
		return "Length: " + length + " Width: "+ width +" Area: "+ area + " Perimeter: " + perimeter + " is Square:" + isSquare;
	}
    /**
     * returns if the first rectangle is smaller than the second
     * @param Ri
     * @param Rf
     * @return boolean if the first rectangle is smaller than the second
     */
	public static boolean isSmaller(Rectangle Ri, Rectangle Rf) {
		
		return (Ri.area < Rf.area);
	}
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(3,4);
		Rectangle R2 = new Rectangle(5,4);
		System.out.println(R1);
		System.out.println(isSmaller(R1,R2));

	}

}
