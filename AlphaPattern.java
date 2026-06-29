package patternProgram;

public class AlphaPattern {
	public static void star(int num) {
		for(int i = 1; i <=num ; i++) {
			char ch = (char) ('a' + (i - 1) * 4);
			for(int j = 1 ; j<=i ;j++) {
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		star(4);
	}
}
