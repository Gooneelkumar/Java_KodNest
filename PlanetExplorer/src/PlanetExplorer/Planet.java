package PlanetExplorer;


public class Planet {

	public static void main(String[] args) {
		
		PlanetExplorer explorer = new PlanetExplorer();

		double area;
		area = explorer.calculateSurfaceArea(3.0);
		System.out.printf("%.2f",area);
	}
}
