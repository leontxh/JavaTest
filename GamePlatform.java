public class GamePlatform {
	public static double getFinalSpeed(double initialSpeed, int[] inclinations) {
		double degreeFactor = 0.5;
		for (int i = 0;i <= inclinations.length; i++){
			initialSpeed += inclinations[i] * degreeFactor;
		}
		return initialSpeed;
	}
	
	public static void main(String[] args){
	System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45
	}
}
