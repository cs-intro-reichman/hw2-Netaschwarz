// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   double times = Double.parseDouble(args[0]);
	   double x = 0;
	   int timeCount = 0;
	   for (double i = 1; timeCount < times; i = i+2) {
			if (i % 4 ==3) {
				x = x - (1/i);
			}
			else if (i % 4 == 1) {
				x = x + (1/i);
			}		
		timeCount++;
	   }
	double pi = 4 * x;
	System.out.println("pi according to Java: " +Math.PI);
	System.out.println("pi, approximated:     "+pi);
		
	}
}
