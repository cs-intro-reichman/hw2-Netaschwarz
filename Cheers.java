// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            String w = word.toUpperCase();
            int number = Integer.parseInt(args[1]);
            int f = 0;
            for(int i = 0; i < (w.length());i++) {
                char k = w.charAt(i);
                if (k=='A'|| k=='E'|| k=='F'|| k=='H'|| k=='I'||k== 'L'|| k=='M'|| k=='N'|| k=='O'|| k=='R'||
                k=='S'|| k== 'X') {
                        System.out.println("Give me an "+ k + ": " + k + "!");
                }
                else {
                        System.out.println("Give me a  "+ k + ": " + k + "!");
                }
                }
            System.out.println("What does that spell?");
            while(f < number){
                System.out.println(w + "!!!");
                f++;
            }
        }

}

        
        

