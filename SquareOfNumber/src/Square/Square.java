package Square;


public class Square {
	public static void main(String[] args) {
		
		
		
		int sq;
		sq = squareNumber(7);
		
		System.out.println(sq);
	}
	
	
	public static int squareNumber(int num)
	{
		int square = 0;
		square = num*num;
		return square ;
	}
}
