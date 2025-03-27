package studio7;

public class Die {

	private int sides;
	
	public Die(int n) {
		// TODO Auto-generated constructor stub
		sides = n;
	}
	/**
	 * randomly throws the die
	 * @return the result of the throw
	 */
	public int Throw() {
		return (int) (Math.random()*sides+1);
	}
	/**
	 * @return a description of the number of sides
	 */
	public String toString() {
		return "Sides: " + sides;
	}
	public static void main(String[] args) {
		Die D1 = new Die(6);
		System.out.println(D1.Throw());
		System.out.println(D1);
 
	}

}
