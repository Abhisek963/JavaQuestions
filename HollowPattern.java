package patternProgram;

public class HollowPattern {
	public static void star(int num) {
		for(int i = 1; i <=num ; i++) {
			for(int j=1 ; j<=num ;j++) {
				 if(i==1 || j==1 || j==num ||i ==num) {
				
				System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			}
			System.out.println();
		}
		
	}
	public static void main(String [] args) {
		star(4);
	}

}
