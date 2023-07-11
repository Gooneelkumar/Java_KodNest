package cube;

public class Cube {
public static void main(String[] args) {
	
	int cube=cubeNumber(3);
	
	System.out.println(cube);
}

public static int cubeNumber(int num)
{
	int cube;
	cube=num*num*num;
	return cube;
	
}
}
