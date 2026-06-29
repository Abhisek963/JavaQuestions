package patternProgram;

public class MalphaPyramid {
    public static void star(int num) {

        for (int i = num ; i >= 1; i--) {
        	char ch = 'a';
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch++ +" ");
            }

            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        star(4);
    }
    
}