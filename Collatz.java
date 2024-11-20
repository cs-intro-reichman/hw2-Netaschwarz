// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		int counter = 1;
		String input = args[1];
		String v = "v";
		String c = "c";
		if(input.equals(v)){
			String r = "";
			for(int i = 1; i<=N; i++) {
					int seed = i;
					System.out.print(i + " ");
					if (seed==1 && counter == 1){
						seed = seed*3 +1;
						System.out.print(seed+ " ");
						counter++;
					}
					while (seed != 1){
						if (seed%2==0){
							seed = seed/2;
							System.out.print(seed+ " ");
							counter++;
						}
						else {
							seed = seed*3 +1;
							System.out.print(seed+ " ");
							counter++;
						}
					}
				System.out.print( "(" +counter + ")");
				System.out.println();
				counter = 1;	
				}
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
			}
		if(input.equals(c)){
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		
	}
		
}


