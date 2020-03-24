
public class TestAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		x = -10;
		y = -10;
		
		// && AND
		// || OR 
		if(x > 0 && y > 0) {
			System.out.println("Both nums are +ve");
		} else if (x > 0 || y >0) {
			System.out.println("One nums is +ve");
		}else {
			System.out.println("Both nums are -ve");
		}

	}

}
